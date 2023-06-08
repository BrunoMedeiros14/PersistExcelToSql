package com.medeiros.excel.to.sql.service;

import com.medeiros.excel.to.sql.dto.ParticipantDTO;
import com.medeiros.excel.to.sql.entities.Participant;
import com.medeiros.excel.to.sql.repositories.ParticipantRepository;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public Boolean saveParticipant(ParticipantDTO participantDTO) {
        participantRepository.save(new Participant(participantDTO));
        return true;
    }

    public Boolean saveParticipants(InputStream spreadsheet) {
        List<Participant> participants = new ArrayList<>();

        try (Workbook workbook = WorkbookFactory.create(spreadsheet)) {
            Sheet sheet = workbook.getSheet("data");

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;
                ParticipantDTO participantDTO = new ParticipantDTO((int) row.getCell(0).getNumericCellValue(),
                                                                   row.getCell(1).getStringCellValue(),
                                                                   (int) row.getCell(2).getNumericCellValue(),
                                                                   row.getCell(3).getNumericCellValue()
                );
                participants.add(new Participant(participantDTO));
            }
            participantRepository.saveAll(participants);

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Participant> getAllParticipantsByAge() {
        return participantRepository.findAll(Sort.by(Sort.Direction.ASC, "age"));
    }

    public byte[] getFile() {

        AtomicInteger actualRow = new AtomicInteger();

        try (Workbook workbook = WorkbookFactory.create(true)) {
            Sheet sheet = workbook.createSheet("data");
            sheet.setColumnWidth(0, 6000);
            sheet.setColumnWidth(1, 6000);
            sheet.setColumnWidth(2, 5000);
            sheet.setColumnWidth(3, 5500);

            Row header = sheet.createRow(actualRow.get());

            CellStyle headerStyle = workbook.createCellStyle();
            Font titleFont = workbook.createFont();

            titleFont.setBold(true);
            headerStyle.setFont(titleFont);
            headerStyle.setAlignment(HorizontalAlignment.CENTER);

            Cell cell = header.createCell(0, CellType.STRING);
            cell.setCellValue("Identificação");
            cell.setCellStyle(headerStyle);

            cell = header.createCell(1, CellType.STRING);
            cell.setCellValue("Nome");
            cell.setCellStyle(headerStyle);

            cell = header.createCell(2, CellType.STRING);
            cell.setCellValue("Idade");
            cell.setCellStyle(headerStyle);

            cell = header.createCell(3, CellType.STRING);
            cell.setCellValue("Média de notas");
            cell.setCellStyle(headerStyle);

            getAllParticipantsByAge().forEach(participant -> {
                Row row = sheet.createRow(actualRow.incrementAndGet());

                Cell rowCell = row.createCell(0, CellType.NUMERIC);
                rowCell.setCellValue(participant.getIdentification());

                rowCell = row.createCell(1, CellType.STRING);
                rowCell.setCellValue(participant.getName());

                rowCell = row.createCell(2, CellType.NUMERIC);
                rowCell.setCellValue(participant.getAge());

                rowCell = row.createCell(3, CellType.NUMERIC);
                rowCell.setCellValue(participant.getAverage());

            });

            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                workbook.write(bos);
                return bos.toByteArray();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
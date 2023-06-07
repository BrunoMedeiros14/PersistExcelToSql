package com.medeiros.excel.to.sql.service;

import com.medeiros.excel.to.sql.dto.ParticipantDTO;
import com.medeiros.excel.to.sql.entities.Participant;
import com.medeiros.excel.to.sql.repositories.ParticipantRepository;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public void saveData(InputStream spreadsheet) {
        List<Participant> participants = new ArrayList<>();

        try (Workbook workbook = WorkbookFactory.create(spreadsheet)) {
            Sheet sheet = workbook.getSheet("data");

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;
                ParticipantDTO participantDTO = new ParticipantDTO((int) row.getCell(0).getNumericCellValue(), row.getCell(1).getStringCellValue(), (int) row.getCell(2).getNumericCellValue(), row.getCell(3).getNumericCellValue());
                participants.add(new Participant(participantDTO));
            }
            participantRepository.saveAll(participants);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
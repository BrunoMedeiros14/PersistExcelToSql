package com.medeiros.excel.to.sql.controllers;

import com.medeiros.excel.to.sql.entities.Participant;
import com.medeiros.excel.to.sql.service.ParticipantService;
import com.medeiros.excel.to.sql.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/participants")
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @PostMapping
    public ResponseEntity<Map<String, String>> saveData(@RequestParam("spreadSheet") MultipartFile file) throws IOException {
        if (!Validator.spreadSheetValidator(file))
            throw new IOException("Formato de objeto inválido, favor inserir uma planilha.");

        InputStream spreadsheet = file.getInputStream();
        participantService.saveData(spreadsheet);
        return ResponseEntity.ok().body(Map.of("message", "Planilha salva com sucesso"));
    }

    @GetMapping
    public ResponseEntity<List<Participant>> getAll() {
        return ResponseEntity.ok().body(participantService.getAllParticipantsByAge());
    }

    @GetMapping("/sheet")
    public HttpEntity<byte[]> downloadFile() {

        byte[] arquivo = participantService.getFile();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Disposition", "attachment;filename=sheet.xlsx");

        return new HttpEntity<>(arquivo, httpHeaders);
    }

}

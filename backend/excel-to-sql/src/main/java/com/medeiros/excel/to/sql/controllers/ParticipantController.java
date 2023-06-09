package com.medeiros.excel.to.sql.controllers;

import com.medeiros.excel.to.sql.dto.ParticipantDTO;
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
    public ResponseEntity<Map<String, String>> saveParticipant(@RequestBody ParticipantDTO participant) {

        try {
            participantService.saveParticipant(participant);
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                                 .body(Map.of("message", "Falha ao salvar o participante.", "error:", e.getMessage()));
        }
        return ResponseEntity.ok().body(Map.of("message", "Participante salvo com sucesso."));

    }

    @PostMapping("/spreadsheet")
    public ResponseEntity<Map<String, String>> saveParticipants(@RequestParam("spreadSheet") MultipartFile file) throws IOException {

        if (!Validator.spreadSheetValidator(file))
            return ResponseEntity.badRequest().body(Map.of("message", "Favor inserir uma planilha válida."));

        InputStream spreadsheet = file.getInputStream();

        try {
            participantService.saveParticipants(spreadsheet);
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                                 .body(Map.of("message", "Falha ao salvar planilha.", "error:", e.getMessage()));
        }

        return ResponseEntity.ok().body(Map.of("message", "Planilha salva com sucesso."));
    }

    @GetMapping
    public ResponseEntity<List<Participant>> getAll() {

        return ResponseEntity.ok().body(participantService.getAllParticipantsByAge());
    }

    @GetMapping("/spreadsheet")
    public HttpEntity<byte[]> downloadFile() {

        byte[] arquivo = participantService.getFile();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Disposition", "attachment;filename=sheet.xlsx");

        return new HttpEntity<>(arquivo, httpHeaders);
    }

}

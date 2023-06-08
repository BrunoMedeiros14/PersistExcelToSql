package com.medeiros.excel.to.sql.controllers;

import com.medeiros.excel.to.sql.entities.Participant;
import com.medeiros.excel.to.sql.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/participants")
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @PostMapping
    public void saveData(@RequestParam("spreadSheet") MultipartFile file) throws IOException {
        InputStream spreadsheet = file.getInputStream();
        participantService.saveData(spreadsheet);
    }

    @GetMapping
    public List<Participant> getAll(){
        return participantService.getAllParticipants();
    }

}

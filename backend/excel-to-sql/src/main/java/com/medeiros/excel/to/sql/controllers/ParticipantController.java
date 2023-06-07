package com.medeiros.excel.to.sql.controllers;

import com.medeiros.excel.to.sql.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

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

}

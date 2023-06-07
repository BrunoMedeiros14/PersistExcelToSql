package com.medeiros.excel.to.sql.controllers;

import com.medeiros.excel.to.sql.service.ParticipantService;
import com.medeiros.excel.to.sql.utils.Validator;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

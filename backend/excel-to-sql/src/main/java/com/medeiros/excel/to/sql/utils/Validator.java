package com.medeiros.excel.to.sql.utils;

import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

public class Validator {

    public static boolean spreadSheetValidator(MultipartFile file) {

        return Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    }

}

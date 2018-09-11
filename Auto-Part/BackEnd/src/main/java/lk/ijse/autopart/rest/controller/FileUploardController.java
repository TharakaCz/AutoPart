package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.service.FileUploardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
//
@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/fileUploard")
public class FileUploardController {

    @Autowired
    private FileUploardService service;


    @PostMapping(value = "/file")
    public boolean singleFileUpload (@RequestParam("file") MultipartFile file){

        return service.singleFileUpload(file);
    }
}

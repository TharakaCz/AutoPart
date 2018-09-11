package lk.ijse.autopart.rest.controller;


import lk.ijse.autopart.rest.dto.DiliverDTO;
import lk.ijse.autopart.rest.service.DiliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/diliver")
public class DiliverController {

    @Autowired
    private DiliverService service;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    private boolean save(@RequestBody DiliverDTO diliverDTO){
        return service.save(diliverDTO);
    }

    @DeleteMapping(value ="/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    private boolean delete(@PathVariable("id") String dNic){
        return service.delete(dNic);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    private ArrayList<DiliverDTO>getAllDiliver(){
        return service.getAllDiliver();
    }

    @GetMapping(value = "/count",produces = MediaType.APPLICATION_JSON_VALUE)
    public long getAllDilivers(){
        return  service.getAllDilivers();
    }
}

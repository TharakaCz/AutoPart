package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.PakagesDTO;
import lk.ijse.autopart.rest.service.PakagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/pakages")
public class PakagesController {

    @Autowired
    private PakagesService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean save (@RequestBody PakagesDTO pakagesDTO){
        return service.save(pakagesDTO);
    }


    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable("id") int id){
        return service.delete(id);
    }

    @GetMapping(value = "/count",produces = MediaType.APPLICATION_JSON_VALUE)
    public long TotalPakages(){
        return service.TotalPakages();
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<PakagesDTO>getAllPakage(){
        return  service.getAllPakage();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PakagesDTO getPakage(@PathVariable("id") int id){
        return service.getPakage(id);
    }
}

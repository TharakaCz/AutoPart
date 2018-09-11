package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.SellerDTO;
import lk.ijse.autopart.rest.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<SellerDTO> getAllSellers(){
        return service.getAllSellers();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerDTO getSellers(@PathVariable("id")String sNic){
        return service.getSellers(sNic);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteSellers(@PathVariable("id") String sNic){
        return service.deleteSellers(sNic);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveSellers(@RequestBody SellerDTO seller){
        return service.saveSellers(seller);
    }

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getTotalSellers(){
        return service.getTotalSellers();
    }


}

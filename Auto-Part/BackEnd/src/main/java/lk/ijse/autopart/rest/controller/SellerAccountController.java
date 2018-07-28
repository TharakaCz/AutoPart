package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;
import lk.ijse.autopart.rest.service.SellerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/SellerAccounts")
public class SellerAccountController {

    @Autowired
    private SellerAccountService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<SellerAccountDTO> getAllSellerAcccounts(){
        return service.getAllSellerAcccounts();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerAccountDTO getSellerAccounts(@PathVariable("id") String email){
        return service.getSellerAccounts(email);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteSellerAccount(@PathVariable("id") String email){
        return service.deleteSellerAccount(email);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
     public boolean saveSellerAccount(@RequestBody SellerAccountDTO accountDTO){
        return service.saveSellerAccount(accountDTO);
     }

     @GetMapping(value = "/count",produces = MediaType.APPLICATION_JSON_VALUE)
     public long getAllSellerAccount(){
        return service.getAllSellerAccount();
     }
}

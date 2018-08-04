package lk.ijse.autopart.rest.controller;
import lk.ijse.autopart.rest.dto.PaymentsDTO;
import lk.ijse.autopart.rest.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/payments")
public class PaymentsController {

    @Autowired
    private PaymentsService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<PaymentsDTO>loardAllPayments(){
        return service.loardAllPayments();
    }

    @GetMapping(value ="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentsDTO getPayments(@PathVariable("id") String pNic){
        return service.getPayments(pNic);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deletePayments(@PathVariable("id") String pNic){
        return service.deletePayments(pNic);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean puchesePayment(@RequestBody PaymentsDTO paymentsDTO){
        return service.puchesePayment(paymentsDTO);
    }


    @GetMapping(value = "/count",produces = MediaType.APPLICATION_JSON_VALUE)
    public long getTotelPayments(){
        return service.getTotelPayments();
    }
}

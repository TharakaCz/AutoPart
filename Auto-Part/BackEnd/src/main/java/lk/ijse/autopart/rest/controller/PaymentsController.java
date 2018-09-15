package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.PaymentsDTO;
import lk.ijse.autopart.rest.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/payments")
public class PaymentsController {

    @Autowired
    private PaymentsService service;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody PaymentsDTO paymentsDTO){
        return service.save(paymentsDTO);
    }

//
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ArrayList<PaymentsDTO>getAllPayments(){
//        return  service.getAllPayments();
//    }
//
//    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public boolean delete(@PathVariable("id") int id){
//        return service.delete(id);
//    }
//
//    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public PaymentsDTO getPayments(@PathVariable("id") int id){
//        return service.getPayments(id);
//    }

    @GetMapping(value = "/count",produces = MediaType.APPLICATION_JSON_VALUE)
    public long TotalPayment(){
        return service.TotalPayment();
    }
}

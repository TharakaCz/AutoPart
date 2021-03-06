package lk.ijse.autopart.rest.controller;


import lk.ijse.autopart.rest.dto.CustomerDTO;
import lk.ijse.autopart.rest.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/customerLogin")
public class CustomerLoginController {

    @Autowired
    private CustomerLoginService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody CustomerDTO customer){
        return service.canAuthenticate(customer.getcNic(),
                customer.getcPassword());
    }
}

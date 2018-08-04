package lk.ijse.autopart.rest.controller;


import lk.ijse.autopart.rest.dto.SellerAccountDTO;
import lk.ijse.autopart.rest.service.SellerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/sellerAccountLogin")
public class SellerLoginController {

    @Autowired
    private SellerLoginService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody SellerAccountDTO sellerAccountDTO){
        return service.canAuthenticate(sellerAccountDTO.getaNic(),sellerAccountDTO.getApassword());
    }
}

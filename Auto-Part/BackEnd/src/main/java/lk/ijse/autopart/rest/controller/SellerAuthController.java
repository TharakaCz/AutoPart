package lk.ijse.autopart.rest.controller;


import lk.ijse.autopart.rest.dto.SellerAccountDTO;
import lk.ijse.autopart.rest.service.SellerAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/sellerAccountLogin")
@CrossOrigin
public class SellerAuthController {

    @Autowired
    private SellerAuthService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody SellerAccountDTO sellerAccountDTO){
        return service.canAuthenticate(sellerAccountDTO.getaNic(),sellerAccountDTO.getApassword());
    }

    @GetMapping(value = "/logined", produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerAccountDTO getLoginedSeller(){
        return service.getLoginedSeller();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerAccountDTO getAuthinticate(@PathVariable("id") String aNic){
        return service.getAuthinticate(aNic);
    }
}

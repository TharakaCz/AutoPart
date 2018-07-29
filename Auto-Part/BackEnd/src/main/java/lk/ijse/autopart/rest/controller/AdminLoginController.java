package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.AdminLoginDTO;
import lk.ijse.autopart.rest.service.AdminLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/adminlogin")
public class AdminLoginController {

    @Autowired
    private AdminLoginService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody AdminLoginDTO adminLoginDTO){
        return service.canAuthenticate(adminLoginDTO.getId(),adminLoginDTO.getPassword());
    }
}

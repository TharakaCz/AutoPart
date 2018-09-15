package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.AdminDTO;
import lk.ijse.autopart.rest.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/adminlogin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody AdminDTO adminDTO){
        return service.canAuthenticate(adminDTO.getId(),adminDTO.getPassword());
    }

}

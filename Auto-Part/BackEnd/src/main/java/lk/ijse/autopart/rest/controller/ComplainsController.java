package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.ComplainsDTO;
import lk.ijse.autopart.rest.service.ComplainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/complains")
public class ComplainsController {

    @Autowired
    private ComplainsService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody ComplainsDTO complainsDTO){
        return service.save(complainsDTO);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}

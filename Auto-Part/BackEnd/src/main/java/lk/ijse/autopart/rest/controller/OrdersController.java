package lk.ijse.autopart.rest.controller;

import lk.ijse.autopart.rest.dto.PlaceOrderDTO;
import lk.ijse.autopart.rest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/orders")

public class OrdersController {

    @Autowired
    private OrderService orderService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody PlaceOrderDTO placeOrderDTO){
        return orderService.save(placeOrderDTO);
    }
}

package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.OrdersDTO;
import lk.ijse.autopart.rest.dto.PlaceOrderDTO;

public interface OrderService {

    public boolean save(PlaceOrderDTO placeOrderDTO);
}

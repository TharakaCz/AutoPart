package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.OrdersDTO;

public interface OrdersService {

    public boolean orders(OrdersDTO ordersDTO)throws Exception;
}

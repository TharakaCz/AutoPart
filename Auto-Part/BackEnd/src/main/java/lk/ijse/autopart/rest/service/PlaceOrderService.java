package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.PlaceOrdersDTO;

public interface PlaceOrderService {

    public boolean placeOrders(PlaceOrdersDTO placeOrdersDTO) throws Exception;
}

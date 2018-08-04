package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.OrdersDTO;
import lk.ijse.autopart.rest.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class OrdersServiceImpl implements OrdersService {

    @Override
    public boolean orders(OrdersDTO ordersDTO) throws Exception {
        return false;
    }
}

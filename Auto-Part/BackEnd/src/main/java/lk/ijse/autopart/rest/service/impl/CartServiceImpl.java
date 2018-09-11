package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.CartDTO;
import lk.ijse.autopart.rest.service.CartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class CartServiceImpl implements CartService {


    @Override
    public boolean add(CartDTO cartDTO) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}

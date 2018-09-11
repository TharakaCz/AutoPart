package lk.ijse.autopart.rest.service;


import lk.ijse.autopart.rest.dto.CartDTO;

public interface CartService {

    public boolean add(CartDTO cartDTO);

    public boolean delete(int id);
}

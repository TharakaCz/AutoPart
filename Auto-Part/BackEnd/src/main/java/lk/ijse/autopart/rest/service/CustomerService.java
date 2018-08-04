package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.CustomerDTO;

import java.util.ArrayList;


public interface CustomerService {

    public ArrayList<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomer(String cNic);

    public boolean deleteCustomer(String cNic);

    public boolean saveCustomer(CustomerDTO customerDTO);

    public long getTotelCustomers();

    boolean canAuthenticate(String cNic,String cPassword);
}

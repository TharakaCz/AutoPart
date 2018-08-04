package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.CustomerDTO;
import lk.ijse.autopart.rest.entity.Customer;
import lk.ijse.autopart.rest.repository.CustomerRepository;
import lk.ijse.autopart.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer>customers = repository.findAll();

        ArrayList<CustomerDTO>alCustomers = new ArrayList<>();

        for (Customer customer : customers){
            CustomerDTO customerDTO = new CustomerDTO(customer.getcNic(),
                    customer.getcName(),
                    customer.getcEmail(),
                    customer.getcAddress(),
                    customer.getcContact(),
                    customer.getcPassword());
            alCustomers.add(customerDTO);
        }
        return alCustomers;
    }

    @Override
    public CustomerDTO getCustomer(String cNic) {
       Customer customer = repository.findById(cNic).get();
       CustomerDTO customerDTO = new CustomerDTO(customer.getcNic(),
               customer.getcName(),
               customer.getcEmail(),
               customer.getcContact(),
               customer.getcAddress(),
               customer.getcPassword());
       return customerDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteCustomer(String cNic) {
        repository.deleteById(cNic);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getcNic(),
                customerDTO.getcName(),
                customerDTO.getcEmail(),
                customerDTO.getcContact(),
                customerDTO.getcAddress(),
                customerDTO.getcPassword()
                );

                repository.save(customer);

                return true;

    }

    @Override
    public long getTotelCustomers() {
        return repository.getTotelCustomers();
    }

    @Override
    public boolean canAuthenticate(String cNic, String cPassword) {

        boolean exists = repository.existsById(cNic);

        if (!exists){
            return false;
        }
         Customer customer = repository.findById(cNic).get();
        return customer.getcPassword().equals(cPassword);

    }
}

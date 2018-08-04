package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.entity.Customer;
import lk.ijse.autopart.rest.repository.CustomerRepository;
import lk.ijse.autopart.rest.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class CustomerLoginServiceImpl implements CustomerLoginService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public boolean canAuthenticate(String cNic, String cPassword) {
           boolean exist = repository.existsById(cNic);

           if (!exist){
               return false;
           }

           Customer login = repository.findById(cNic).get();
           return login.getcPassword().equals(cPassword);

    }
}

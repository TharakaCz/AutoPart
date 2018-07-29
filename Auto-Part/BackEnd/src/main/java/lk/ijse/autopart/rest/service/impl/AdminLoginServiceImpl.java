package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.entity.AdminLogin;
import lk.ijse.autopart.rest.repository.AdminLoginRepository;
import lk.ijse.autopart.rest.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    private AdminLoginRepository repository;


    @Override
    public boolean canAuthenticate(String id, String password) {
        boolean exists = repository.existsById(id);

        if (!exists){
            return false;
        }

        AdminLogin login = repository.findById(id).get();

        return login.getPassword().equals(password);
    }
}

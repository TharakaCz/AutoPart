package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.entity.Admin;
import lk.ijse.autopart.rest.repository.AdminRepository;
import lk.ijse.autopart.rest.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repository;

    @Override
    public boolean canAuthenticate(String id, String password) {
        boolean exsist = repository.existsById(id);

        if (!exsist){

            return false;
        }

        Admin admin = repository.findById(id).get();

        return admin.getPassword().equals(password);
    }
}

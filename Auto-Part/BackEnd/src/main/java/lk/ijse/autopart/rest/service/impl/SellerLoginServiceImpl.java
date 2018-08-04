package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.entity.SellerAccount;
import lk.ijse.autopart.rest.repository.SellerLoginRepository;
import lk.ijse.autopart.rest.service.SellerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED , readOnly = true)
public class SellerLoginServiceImpl implements SellerLoginService {

    @Autowired
    private SellerLoginRepository repository;

    @Override
    public boolean canAuthenticate(String aNic, String apassword) {

        boolean exist = repository.existsById(aNic);

        if (!exist){
            return false;
        }

        SellerAccount account = repository.findById(aNic).get();

        return account.getApassword().equals(apassword);
    }
}

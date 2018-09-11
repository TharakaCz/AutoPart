package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;
import lk.ijse.autopart.rest.dto.SellerDTO;
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

    private SellerAccountDTO logsellerDTO;

    @Override
    public boolean canAuthenticate(String aNic, String apassword) {

        boolean exist = repository.existsById(aNic);

        if (!exist){
            return false;
        }

        SellerAccount account = repository.findById(aNic).get();

        return account.getApassword().equals(apassword);
    }

    @Override

    public SellerAccountDTO getAuthinticate(String aNic) {

        SellerAccount sellerAccount = repository.findById(aNic).get();

        SellerAccountDTO sellerAccountDTO = new SellerAccountDTO(sellerAccount.getaNic(),
                sellerAccount.getaName(),
                sellerAccount.getApassword());

        logsellerDTO=new SellerAccountDTO(sellerAccount.getaNic(),sellerAccount.getaName(),sellerAccount.getaPackageType(),sellerAccount.getaPackagePrice(),sellerAccount.getApassword(),sellerAccount.getaOdate(),sellerAccount.getaExpaierDate());


        return sellerAccountDTO;


    }

    @Override
    public SellerAccountDTO getLoginedSeller() {
        return logsellerDTO;
    }
//
//    @Override
//    public boolean canAuth(String aNic, String aName, String apassword) {
//
//        boolean auth = repository.existsById(aNic);
//
//        if (!auth){
//            return false;
//        }
//
//        SellerAccount account = repository.findById(aNic).get();
//
//        return account.getaName().equals(aName);
//    }
}

package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;
import lk.ijse.autopart.rest.entity.SellerAccount;
import lk.ijse.autopart.rest.repository.SellerAccountRepository;
import lk.ijse.autopart.rest.service.SellerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class SellerAccountServiceImpl implements SellerAccountService {

    @Autowired
    private SellerAccountRepository repository;

    @Override
    public ArrayList<SellerAccountDTO> getAllSellerAcccounts() {
        List<SellerAccount> accounts = repository.findAll();
        ArrayList<SellerAccountDTO>alSellerAccount = new ArrayList<>();

        for (SellerAccount sellerAccount : accounts){
            SellerAccountDTO sellerAccountDTO = new SellerAccountDTO(sellerAccount.getaNic(),
                    sellerAccount.getaName(),
                    sellerAccount.getaPackageType(),
                    sellerAccount.getaPackagePrice(),
                    sellerAccount.getApassword(),
                    sellerAccount.getaOdate(),
                    sellerAccount.getaExpaierDate());
            alSellerAccount.add(sellerAccountDTO);
        }
        return alSellerAccount;
    }

    @Override
    public SellerAccountDTO getSellerAccounts(String aNic) {
        SellerAccount selleraccount = repository.findById(aNic).get();
        SellerAccountDTO sellerAccountDTO = new SellerAccountDTO(selleraccount.getaNic(),
                selleraccount.getaName(),
                selleraccount.getaPackageType(),
                selleraccount.getaPackagePrice(),
                selleraccount.getApassword(),
                selleraccount.getaOdate(),
                selleraccount.getaExpaierDate());
        return sellerAccountDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteSellerAccount(String aNic) {
        repository.deleteById(aNic);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveSellerAccount(SellerAccountDTO sellerAccount) {
       SellerAccount sellerAccount1 = new SellerAccount(sellerAccount.getaNic(),
               sellerAccount.getaName(),
               sellerAccount.getaPackageType(),
               sellerAccount.getaPackagePrice(),
               sellerAccount.getApassword(),
               sellerAccount.getaOdate(),
               sellerAccount.getaExpaierDate());
       repository.save(sellerAccount1);

       return true;
    }

    @Override
    public long getAllSellerAccount() {
        return repository.getAllSellerAccount();
    }
}

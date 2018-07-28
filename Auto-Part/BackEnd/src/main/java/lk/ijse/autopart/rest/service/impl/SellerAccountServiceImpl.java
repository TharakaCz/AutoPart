package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;
import lk.ijse.autopart.rest.entity.Seller;
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

        ArrayList<SellerAccountDTO> allSellerAccounts=new ArrayList<>();

        for (SellerAccount sellerAccount: accounts){
            SellerAccountDTO sellerAccountDTO = new SellerAccountDTO(sellerAccount.getEmail(),
                    sellerAccount.getPassword());

            allSellerAccounts.add(sellerAccountDTO);
        }
        return allSellerAccounts;
    }

    @Override

    public SellerAccountDTO getSellerAccounts(String email) {
        SellerAccount sellerAccount = repository.findById(email).get();
        SellerAccountDTO sellerAccountDTO = new SellerAccountDTO(sellerAccount.getEmail(),sellerAccount.getPassword());
        return sellerAccountDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteSellerAccount(String email) {
       repository.deleteById(email);
       return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveSellerAccount(SellerAccountDTO accountDTO) {
        SellerAccount sellerAccount = new SellerAccount(accountDTO.getEmail(),
                accountDTO.getPassword());

        repository.save(sellerAccount);
        return true;
    }

    @Override
    public long getAllSellerAccount() {
        return repository.getAllSellerAccount();
    }
}

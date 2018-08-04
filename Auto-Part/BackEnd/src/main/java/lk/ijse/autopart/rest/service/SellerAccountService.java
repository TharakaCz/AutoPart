package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;

import java.util.ArrayList;

public interface SellerAccountService {

    public ArrayList<SellerAccountDTO> getAllSellerAcccounts();

    public SellerAccountDTO getSellerAccounts(String aNic);

    public boolean deleteSellerAccount(String aNic);

    public boolean saveSellerAccount(SellerAccountDTO sellerAccount);

    public long getAllSellerAccount();
}

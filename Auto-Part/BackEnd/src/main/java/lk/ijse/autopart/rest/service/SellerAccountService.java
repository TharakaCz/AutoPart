package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;

import java.util.ArrayList;

public interface SellerAccountService {

    public ArrayList<SellerAccountDTO> getAllSellerAcccounts();

    public SellerAccountDTO getSellerAccounts(String email);

    public boolean deleteSellerAccount(String email);

    public boolean saveSellerAccount(SellerAccountDTO accountDTO);

    public long getAllSellerAccount();
}

package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.SellerDTO;

import java.util.ArrayList;

public interface SellerService {

    public ArrayList<SellerDTO> getAllSellers();

    public  SellerDTO getSellers(String sNic);

    public boolean deleteSellers(String sNic);

    public  boolean saveSellers(SellerDTO seller);

    public long getTotalSellers();


}

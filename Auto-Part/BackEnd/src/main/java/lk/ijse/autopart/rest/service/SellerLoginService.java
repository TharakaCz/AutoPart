package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.SellerAccountDTO;

public interface SellerLoginService {

    boolean canAuthenticate(String aNic, String apassword );


    public SellerAccountDTO getAuthinticate(String aNic);

    public  SellerAccountDTO getLoginedSeller();

}

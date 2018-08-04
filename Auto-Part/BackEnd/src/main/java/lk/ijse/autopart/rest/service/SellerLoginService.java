package lk.ijse.autopart.rest.service;

public interface SellerLoginService {

    boolean canAuthenticate(String aNic, String apassword);
}

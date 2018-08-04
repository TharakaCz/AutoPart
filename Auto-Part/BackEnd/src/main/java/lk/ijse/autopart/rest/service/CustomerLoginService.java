package lk.ijse.autopart.rest.service;

public interface CustomerLoginService {

    boolean canAuthenticate(String cNic, String cPassword);
}

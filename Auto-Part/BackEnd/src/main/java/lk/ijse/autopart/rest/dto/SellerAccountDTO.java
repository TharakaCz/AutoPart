package lk.ijse.autopart.rest.dto;

public class SellerAccountDTO  {

    private String email;
    private String password;

    public SellerAccountDTO() {
    }

    public SellerAccountDTO(String password) {
        this.setPassword(password);
    }

    public SellerAccountDTO(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SellerAccountDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

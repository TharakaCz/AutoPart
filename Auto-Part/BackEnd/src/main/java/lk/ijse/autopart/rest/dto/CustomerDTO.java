package lk.ijse.autopart.rest.dto;

public class CustomerDTO {


    private String cNic;

    private String cName;

    private String cEmail;

    private String cAddress;

    private String cContact;

    private String cPassword;

    public CustomerDTO() {
    }

    public CustomerDTO(String cNic) {
        this.setcNic(cNic);
    }

    public CustomerDTO(String cNic, String cPassword) {
        this.setcNic(cNic);
        this.setcPassword(cPassword);
    }

    public CustomerDTO(String cNic, String cName, String cEmail, String cAddress, String cContact) {
        this.setcNic(cNic);
        this.setcName(cName);
        this.setcEmail(cEmail);
        this.setcAddress(cAddress);
        this.setcContact(cContact);
    }

    public CustomerDTO(String cNic, String cName, String cEmail, String cAddress, String cContact, String cPassword) {
        this.setcNic(cNic);
        this.setcName(cName);
        this.setcEmail(cEmail);
        this.setcAddress(cAddress);
        this.setcContact(cContact);
        this.setcPassword(cPassword);
    }


    public String getcNic() {
        return cNic;
    }

    public void setcNic(String cNic) {
        this.cNic = cNic;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcContact() {
        return cContact;
    }

    public void setcContact(String cContact) {
        this.cContact = cContact;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cNic='" + cNic + '\'' +
                ", cName='" + cName + '\'' +
                ", cEmail='" + cEmail + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cContact='" + cContact + '\'' +
                ", cPassword='" + cPassword + '\'' +
                '}';
    }
}

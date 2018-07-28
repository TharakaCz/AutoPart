package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {

    @Id
    private String sNic;

    private String sName;

    private String sEmail;

    private String sAddress;

    private String sContactNo;

    private String sCompany;

    public Seller() {
    }

    public Seller(String sName, String sEmail, String sAddress, String sContactNo, String sCompany) {
        this.setsName(sName);
        this.setsEmail(sEmail);
        this.setsAddress(sAddress);
        this.setsContactNo(sContactNo);
        this.setsCompany(sCompany);
    }

    public Seller(String sNic, String sName, String sEmail, String sAddress, String sContactNo, String sCompany) {
        this.setsNic(sNic);
        this.setsName(sName);
        this.setsEmail(sEmail);
        this.setsAddress(sAddress);
        this.setsContactNo(sContactNo);
        this.setsCompany(sCompany);
    }


    public String getsNic() {
        return sNic;
    }

    public void setsNic(String sNic) {
        this.sNic = sNic;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsContactNo() {
        return sContactNo;
    }

    public void setsContactNo(String sContactNo) {
        this.sContactNo = sContactNo;
    }

    public String getsCompany() {
        return sCompany;
    }

    public void setsCompany(String sCompany) {
        this.sCompany = sCompany;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sNic='" + sNic + '\'' +
                ", sName='" + sName + '\'' +
                ", sEmail='" + sEmail + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", sContactNo='" + sContactNo + '\'' +
                ", sCompany='" + sCompany + '\'' +
                '}';
    }
}

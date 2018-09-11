package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SellerAccount {

    @Id
    private String aNic;
    private String aName;
    private String aPackageType;
    private String aPackagePrice;
    private String apassword;
    private String aOdate;
    private String aExpaierDate;

    public SellerAccount() {
    }

    public SellerAccount(String aNic) {
        this.setaNic(aNic);
    }

    public SellerAccount(String aNic, String aName, String apassword) {
        this.setaNic(aNic);
        this.setaName(aName);
        this.setApassword(apassword);
    }

    public SellerAccount(String aNic, String aName, String aPackageType, String aPackagePrice, String apassword, String aOdate, String aExpaierDate) {
        this.setaNic(aNic);
        this.setaName(aName);
        this.setaPackageType(aPackageType);
        this.setaPackagePrice(aPackagePrice);
        this.setApassword(apassword);
        this.setaOdate(aOdate);
        this.setaExpaierDate(aExpaierDate);
    }


    public String getaNic() {
        return aNic;
    }

    public void setaNic(String aNic) {
        this.aNic = aNic;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPackageType() {
        return aPackageType;
    }

    public void setaPackageType(String aPackageType) {
        this.aPackageType = aPackageType;
    }

    public String getaPackagePrice() {
        return aPackagePrice;
    }

    public void setaPackagePrice(String aPackagePrice) {
        this.aPackagePrice = aPackagePrice;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getaOdate() {
        return aOdate;
    }

    public void setaOdate(String aOdate) {
        this.aOdate = aOdate;
    }

    public String getaExpaierDate() {
        return aExpaierDate;
    }

    public void setaExpaierDate(String aExpaierDate) {
        this.aExpaierDate = aExpaierDate;
    }

    @Override
    public String toString() {
        return "SellerAccount{" +
                "aNic='" + aNic + '\'' +
                ", aName='" + aName + '\'' +
                ", aPackageType='" + aPackageType + '\'' +
                ", aPackagePrice='" + aPackagePrice + '\'' +
                ", apassword='" + apassword + '\'' +
                ", aOdate='" + aOdate + '\'' +
                ", aExpaierDate='" + aExpaierDate + '\'' +
                '}';
    }
}

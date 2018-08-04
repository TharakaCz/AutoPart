package lk.ijse.autopart.rest.dto;

public class SellerAccountDTO  {

    private String aNic;
    private String aName;
    private String aPackageType;
    private String apassword;
    private String aOdate;
    private String aExpaierDate;


    public SellerAccountDTO() {
    }

    public SellerAccountDTO(String aNic) {
        this.setaNic(aNic);
    }

    public SellerAccountDTO(String aNic, String apassword) {
        this.setaNic(aNic);
        this.setApassword(apassword);
    }

    public SellerAccountDTO(String aNic, String aName, String aPackageType, String apassword, String aOdate, String aExpaierDate) {
        this.setaNic(aNic);
        this.setaName(aName);
        this.setaPackageType(aPackageType);
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
        return "SellerAccountDTO{" +
                "aNic='" + aNic + '\'' +
                ", aName='" + aName + '\'' +
                ", aPackageType='" + aPackageType + '\'' +
                ", apassword='" + apassword + '\'' +
                ", aOdate='" + aOdate + '\'' +
                ", aExpaierDate='" + aExpaierDate + '\'' +
                '}';
    }
}

package lk.ijse.autopart.rest.dto;

public class PaymentsDTO {

    private String nIc;

    private String pName;

    private String pEmail;

    private String pContactNo;

    private String packageType;

    private String cost;

    public PaymentsDTO() {
    }

    public PaymentsDTO(String nIc) {
        this.nIc = nIc;
    }

    public PaymentsDTO(String nIc, String pName, String pEmail, String pContactNo, String packageType, String cost) {
        this.nIc = nIc;
        this.pName = pName;
        this.pEmail = pEmail;
        this.pContactNo = pContactNo;
        this.packageType = packageType;
        this.cost = cost;
    }

    public String getnIc() {
        return nIc;
    }

    public void setnIc(String nIc) {
        this.nIc = nIc;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public String getpContactNo() {
        return pContactNo;
    }

    public void setpContactNo(String pContactNo) {
        this.pContactNo = pContactNo;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "PaymentsDTO{" +
                "nIc='" + nIc + '\'' +
                ", pName='" + pName + '\'' +
                ", pEmail='" + pEmail + '\'' +
                ", pContactNo='" + pContactNo + '\'' +
                ", packageType='" + packageType + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}

package lk.ijse.autopart.rest.dto;

public class PaymentsDTO {

    private int id;
    private String pakageName;
    private String date;

    private SellerDTO sellerDTO;



    public PaymentsDTO() {
    }

    public PaymentsDTO(int id) {
        this.id = id;
    }

    public PaymentsDTO(String pakageName, String date, SellerDTO sellerDTO) {
        this.pakageName = pakageName;
        this.date = date;
        this.sellerDTO = sellerDTO;
    }

    public PaymentsDTO(int id, String pakageName, String date, SellerDTO sellerDTO) {
        this.id = id;
        this.pakageName = pakageName;
        this.date = date;
        this.sellerDTO = sellerDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPakageName() {
        return pakageName;
    }

    public void setPakageName(String pakageName) {
        this.pakageName = pakageName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }

    @Override
    public String toString() {
        return "PaymentsDTO{" +
                "id=" + id +
                ", pakageName='" + pakageName + '\'' +
                ", date='" + date + '\'' +
                ", sellerDTO=" + sellerDTO +
                '}';
    }
}

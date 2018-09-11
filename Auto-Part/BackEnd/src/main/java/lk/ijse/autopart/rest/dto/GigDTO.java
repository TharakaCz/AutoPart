package lk.ijse.autopart.rest.dto;

public class GigDTO {

    private int gId;
    private String gQty;
    private String available;

    private SellerDTO sellerDTO;

    public GigDTO() {
    }

    public GigDTO(int gId, String gQty, String available, SellerDTO sellerDTO) {
        this.gId = gId;
        this.gQty = gQty;
        this.available = available;
        this.sellerDTO = sellerDTO;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgQty() {
        return gQty;
    }

    public void setgQty(String gQty) {
        this.gQty = gQty;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }

    @Override
    public String toString() {
        return "GigDTO{" +
                "gId=" + gId +
                ", gQty='" + gQty + '\'' +
                ", available='" + available + '\'' +
                ", sellerDTO=" + sellerDTO +
                '}';
    }
}

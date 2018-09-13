package lk.ijse.autopart.rest.dto;

import java.util.Date;

public class PaymentsDTO {

    private int id;
    private Date date;

    private SellerDTO sellerDTO;

    private PakagesDTO pakagesDTO;

    public PaymentsDTO() {
    }

    public PaymentsDTO(int id) {
        this.id = id;
    }

    public PaymentsDTO(Date date, SellerDTO sellerDTO, PakagesDTO pakagesDTO) {
        this.date = date;
        this.sellerDTO = sellerDTO;
        this.pakagesDTO = pakagesDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }

    public PakagesDTO getPakagesDTO() {
        return pakagesDTO;
    }

    public void setPakagesDTO(PakagesDTO pakagesDTO) {
        this.pakagesDTO = pakagesDTO;
    }

    @Override
    public String toString() {
        return "PaymentsDTO{" +
                "id=" + id +
                ", date=" + date +
                ", sellerDTO=" + sellerDTO +
                ", pakagesDTO=" + pakagesDTO +
                '}';
    }
}

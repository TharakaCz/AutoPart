package lk.ijse.autopart.rest.dto;

public class PakagesDTO {

    private int id;

    private String pakageTitel;

    private double pakagePrice;

    private String pakageDuration;

    public PakagesDTO() {
    }

    public PakagesDTO(int id) {
        this.id = id;
    }

    public PakagesDTO(String pakageTitel, double pakagePrice, String pakageDuration) {
        this.pakageTitel = pakageTitel;
        this.pakagePrice = pakagePrice;
        this.pakageDuration = pakageDuration;
    }

    public PakagesDTO(int id, String pakageTitel, double pakagePrice, String pakageDuration) {
        this.id = id;
        this.pakageTitel = pakageTitel;
        this.pakagePrice = pakagePrice;
        this.pakageDuration = pakageDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPakageTitel() {
        return pakageTitel;
    }

    public void setPakageTitel(String pakageTitel) {
        this.pakageTitel = pakageTitel;
    }

    public double getPakagePrice() {
        return pakagePrice;
    }

    public void setPakagePrice(double pakagePrice) {
        this.pakagePrice = pakagePrice;
    }

    public String getPakageDuration() {
        return pakageDuration;
    }

    public void setPakageDuration(String pakageDuration) {
        this.pakageDuration = pakageDuration;
    }

    @Override
    public String toString() {
        return "PakagesDTO{" +
                "id=" + id +
                ", pakageTitel='" + pakageTitel + '\'' +
                ", pakagePrice=" + pakagePrice +
                ", pakageDuration='" + pakageDuration + '\'' +
                '}';
    }
}

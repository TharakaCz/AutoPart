package lk.ijse.autopart.rest.dto;


public class OrderDetails_PKDTO {

    private int gId;
    private int oId;

    public OrderDetails_PKDTO() {
    }

    public OrderDetails_PKDTO(int gId, int oId) {
        this.gId = gId;
        this.oId = oId;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    @Override
    public String toString() {
        return "OrderDetails_PKDTO{" +
                "gId=" + gId +
                ", oId=" + oId +
                '}';
    }


}

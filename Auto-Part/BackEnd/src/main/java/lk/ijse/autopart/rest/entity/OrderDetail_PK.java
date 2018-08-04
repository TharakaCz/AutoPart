package lk.ijse.autopart.rest.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetail_PK implements Serializable {

    private int gId;
    private int oId;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int gId, int oId) {
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
        return "OrderDetail_PK{" +
                "gId=" + gId +
                ", oId=" + oId +
                '}';
    }
}

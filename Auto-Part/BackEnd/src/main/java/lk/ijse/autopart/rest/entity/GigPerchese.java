package lk.ijse.autopart.rest.entity;

import javax.persistence.*;

@Entity
public class GigPerchese {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gigPid;

    @OneToOne
    private Gig gig;
    @OneToOne
    private GigDetails gigDetails;

    public GigPerchese() {
    }

    public GigPerchese(Gig gig) {
        this.setGig(gig);
    }

    public GigPerchese(Gig gig, GigDetails gigDetails) {
        this.setGig(gig);
        this.setGigDetails(gigDetails);
    }


    public int getGigPid() {
        return gigPid;
    }

    public void setGigPid(int gigPid) {
        this.gigPid = gigPid;
    }

    public Gig getGig() {
        return gig;
    }

    public void setGig(Gig gig) {
        this.gig = gig;
    }

    public GigDetails getGigDetails() {
        return gigDetails;
    }

    public void setGigDetails(GigDetails gigDetails) {
        this.gigDetails = gigDetails;
    }

    @Override
    public String toString() {
        return "GigPerchese{" +
                "gigPid=" + gigPid +
                ", gig=" + gig +
                ", gigDetails=" + gigDetails +
                '}';
    }
}

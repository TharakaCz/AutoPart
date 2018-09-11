package lk.ijse.autopart.rest.entity;

import javax.persistence.*;

@Entity
public class GigDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String gTitel;
    private String gPic;
    private String gDiscription;
    private String gPrice;
    private String gContact;
    private String gEmail;

    @ManyToOne(cascade = CascadeType.ALL)
    private Gig gig;

    public GigDetails() {
    }

    public GigDetails(String gTitel, String gPic, String gDiscription, String gPrice, String gContact, String gEmail, Gig gig) {
        this.setgTitel(gTitel);
        this.setgPic(gPic);
        this.setgDiscription(gDiscription);
        this.setgPrice(gPrice);
        this.setgContact(gContact);
        this.setgEmail(gEmail);
        this.setGig(gig);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getgTitel() {
        return gTitel;
    }

    public void setgTitel(String gTitel) {
        this.gTitel = gTitel;
    }

    public String getgPic() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic;
    }

    public String getgDiscription() {
        return gDiscription;
    }

    public void setgDiscription(String gDiscription) {
        this.gDiscription = gDiscription;
    }

    public String getgPrice() {
        return gPrice;
    }

    public void setgPrice(String gPrice) {
        this.gPrice = gPrice;
    }

    public String getgContact() {
        return gContact;
    }

    public void setgContact(String gContact) {
        this.gContact = gContact;
    }

    public String getgEmail() {
        return gEmail;
    }

    public void setgEmail(String gEmail) {
        this.gEmail = gEmail;
    }

    public Gig getGig() {
        return gig;
    }

    public void setGig(Gig gig) {
        this.gig = gig;
    }

    @Override
    public String toString() {
        return "GigDetails{" +
                "id=" + id +
                ", gTitel='" + gTitel + '\'' +
                ", gPic='" + gPic + '\'' +
                ", gDiscription='" + gDiscription + '\'' +
                ", gPrice='" + gPrice + '\'' +
                ", gContact='" + gContact + '\'' +
                ", gEmail='" + gEmail + '\'' +
                ", gig=" + gig +
                '}';
    }
}

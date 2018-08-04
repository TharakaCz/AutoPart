package lk.ijse.autopart.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gId;

    private String gTitle;

    private String gSearchTag;

    private String gPic;

    private String gCatogary;

    private String gCoust;

    private String gSellerName;

    private String gSellerCompanny;

    private int qty;

    private double unitPrice;

    private double bonus;

    private String gScontact;

    private String gSemail;


    public Gig() {
    }

    public Gig(int gId) {
        this.setgId(gId);
    }

    public Gig(String gTitle, String gSearchTag, String gPic, String gCatogary, String gCoust, String gSellerName, String gSellerCompanny, int qty, double unitPrice, double bonus, String gScontact, String gSemail) {

        this.setgTitle(gTitle);
        this.setgSearchTag(gSearchTag);
        this.setgPic(gPic);
        this.setgCatogary(gCatogary);
        this.setgCoust(gCoust);
        this.setgSellerName(gSellerName);
        this.setgSellerCompanny(gSellerCompanny);
        this.setQty(qty);
        this.setUnitPrice(unitPrice);
        this.setBonus(bonus);
        this.setgScontact(gScontact);
        this.setgSemail(gSemail);
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgTitle() {
        return gTitle;
    }

    public void setgTitle(String gTitle) {
        this.gTitle = gTitle;
    }

    public String getgSearchTag() {
        return gSearchTag;
    }

    public void setgSearchTag(String gSearchTag) {
        this.gSearchTag = gSearchTag;
    }

    public String getgPic() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic;
    }

    public String getgCatogary() {
        return gCatogary;
    }

    public void setgCatogary(String gCatogary) {
        this.gCatogary = gCatogary;
    }

    public String getgCoust() {
        return gCoust;
    }

    public void setgCoust(String gCoust) {
        this.gCoust = gCoust;
    }

    public String getgSellerName() {
        return gSellerName;
    }

    public void setgSellerName(String gSellerName) {
        this.gSellerName = gSellerName;
    }

    public String getgSellerCompanny() {
        return gSellerCompanny;
    }

    public void setgSellerCompanny(String gSellerCompanny) {
        this.gSellerCompanny = gSellerCompanny;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getgScontact() {
        return gScontact;
    }

    public void setgScontact(String gScontact) {
        this.gScontact = gScontact;
    }

    public String getgSemail() {
        return gSemail;
    }

    public void setgSemail(String gSemail) {
        this.gSemail = gSemail;
    }

    @Override
    public String toString() {
        return "Gig{" +
                "gId=" + gId +
                ", gTitle='" + gTitle + '\'' +
                ", gSearchTag='" + gSearchTag + '\'' +
                ", gPic='" + gPic + '\'' +
                ", gCatogary='" + gCatogary + '\'' +
                ", gCoust='" + gCoust + '\'' +
                ", gSellerName='" + gSellerName + '\'' +
                ", gSellerCompanny='" + gSellerCompanny + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", bonus=" + bonus +
                ", gScontact='" + gScontact + '\'' +
                ", gSemail='" + gSemail + '\'' +
                '}';
    }
}

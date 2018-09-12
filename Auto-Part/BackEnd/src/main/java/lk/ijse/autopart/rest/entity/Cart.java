package lk.ijse.autopart.rest.entity;

import lk.ijse.autopart.rest.dto.GigDetailsDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Gig>gigList;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<GigDetails>gigDetails;

    @OneToOne(cascade = CascadeType.MERGE)
    private Customer customer;

    public Cart() {
    }

    public Cart(List<Gig> gigList, List<GigDetails> gigDetails, Customer customer) {
        this.gigList = gigList;
        this.gigDetails = gigDetails;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Gig> getGigList() {
        return gigList;
    }

    public void setGigList(List<Gig> gigList) {
        this.gigList = gigList;
    }

    public List<GigDetails> getGigDetails() {
        return gigDetails;
    }

    public void setGigDetails(List<GigDetails> gigDetails) {
        this.gigDetails = gigDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", gigList=" + gigList +
                ", gigDetails=" + gigDetails +
                ", customer=" + customer +
                '}';
    }
}

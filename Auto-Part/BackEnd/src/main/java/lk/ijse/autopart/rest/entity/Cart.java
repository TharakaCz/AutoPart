package lk.ijse.autopart.rest.entity;

import lk.ijse.autopart.rest.dto.GigDetailsDTO;

import javax.persistence.*;
import java.util.List;


public class Cart {


    private int id;

    private List<Gig>gigList;

    private List<GigDetailsDTO>gigDetailsDTOS;


    private Customer customer;


    public Cart() {
    }

    public Cart(List<Gig> gigList, List<GigDetailsDTO> gigDetailsDTOS, Customer customer) {
        this.gigList = gigList;
        this.gigDetailsDTOS = gigDetailsDTOS;
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

    public List<GigDetailsDTO> getGigDetailsDTOS() {
        return gigDetailsDTOS;
    }

    public void setGigDetailsDTOS(List<GigDetailsDTO> gigDetailsDTOS) {
        this.gigDetailsDTOS = gigDetailsDTOS;
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
                ", gigDetailsDTOS=" + gigDetailsDTOS +
                ", customer=" + customer +
                '}';
    }
}

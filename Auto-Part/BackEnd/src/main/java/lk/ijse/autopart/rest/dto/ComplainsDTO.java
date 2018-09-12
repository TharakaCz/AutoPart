package lk.ijse.autopart.rest.dto;

import java.util.Date;

public class ComplainsDTO {

    private int id;
    private String titel;
    private String disciption;
    private Date date;
    private CustomerDTO customerDTO;


    public ComplainsDTO() {
    }

    public ComplainsDTO(int id) {
        this.id = id;
    }

    public ComplainsDTO(String titel, String disciption, Date date) {
        this.titel = titel;
        this.disciption = disciption;
        this.date = date;
    }

    public ComplainsDTO(int id, String titel, String disciption, Date date, CustomerDTO customerDTO) {
        this.id = id;
        this.titel = titel;
        this.disciption = disciption;
        this.date = date;
        this.customerDTO = customerDTO;
    }

    public ComplainsDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDisciption() {
        return disciption;
    }

    public void setDisciption(String disciption) {
        this.disciption = disciption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "ComplainsDTO{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", disciption='" + disciption + '\'' +
                ", date=" + date +
                ", customerDTO=" + customerDTO +
                '}';
    }
}

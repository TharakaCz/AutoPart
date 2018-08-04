package lk.ijse.autopart.rest.dto;

public class OrdersDTO {

    private int oId;

    private String oDate;

    private CustomerDTO customer;


    public OrdersDTO() {
    }

    public OrdersDTO(int oId) {
        this.setoId(oId);
    }

    public OrdersDTO(int oId, String oDate, CustomerDTO customer) {
        this.setoId(oId);
        this.setoDate(oDate);
        this.setCustomer(customer);
    }


    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "oId=" + oId +
                ", oDate='" + oDate + '\'' +
                ", customer=" + customer +
                '}';
    }
}

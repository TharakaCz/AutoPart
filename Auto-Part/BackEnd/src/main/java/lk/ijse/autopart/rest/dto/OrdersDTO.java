package lk.ijse.autopart.rest.dto;


public class OrdersDTO {

    private int oId;
    private String oDate;
    private  double totalPrice;

    private CustomerDTO customerDTO;

    public OrdersDTO() {
    }

    public OrdersDTO(int oId, String oDate, double totalPrice, CustomerDTO customerDTO) {
        this.oId = oId;
        this.oDate = oDate;
        this.totalPrice = totalPrice;
        this.customerDTO = customerDTO;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "oId=" + oId +
                ", oDate='" + oDate + '\'' +
                ", totalPrice=" + totalPrice +
                ", customerDTO=" + customerDTO +
                '}';
    }

}

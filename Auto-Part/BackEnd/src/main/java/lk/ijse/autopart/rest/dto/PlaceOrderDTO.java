package lk.ijse.autopart.rest.dto;

import java.util.List;

public class PlaceOrderDTO {

    private GigDTO gigDTO;
    private OrdersDTO ordersDTO;
    private CustomerDTO customerDTO;
    private SellerDTO sellerDTO;
    private GigDetailsDTO gigDetailsDTO;
    private List<OrderDetailsDTO>orderDetailsDTOS;



    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(GigDTO gigDTO, OrdersDTO ordersDTO, CustomerDTO customerDTO, SellerDTO sellerDTO, GigDetailsDTO gigDetailsDTO, List<OrderDetailsDTO> orderDetailsDTOS) {
        this.gigDTO = gigDTO;
        this.ordersDTO = ordersDTO;
        this.customerDTO = customerDTO;
        this.sellerDTO = sellerDTO;
        this.gigDetailsDTO = gigDetailsDTO;
        this.orderDetailsDTOS = orderDetailsDTOS;
    }

    public GigDTO getGigDTO() {
        return gigDTO;
    }

    public void setGigDTO(GigDTO gigDTO) {
        this.gigDTO = gigDTO;
    }

    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }

    public GigDetailsDTO getGigDetailsDTO() {
        return gigDetailsDTO;
    }

    public void setGigDetailsDTO(GigDetailsDTO gigDetailsDTO) {
        this.gigDetailsDTO = gigDetailsDTO;
    }

    public List<OrderDetailsDTO> getOrderDetailsDTOS() {
        return orderDetailsDTOS;
    }

    public void setOrderDetailsDTOS(List<OrderDetailsDTO> orderDetailsDTOS) {
        this.orderDetailsDTOS = orderDetailsDTOS;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "gigDTO=" + gigDTO +
                ", ordersDTO=" + ordersDTO +
                ", customerDTO=" + customerDTO +
                ", sellerDTO=" + sellerDTO +
                ", gigDetailsDTO=" + gigDetailsDTO +
                ", orderDetailsDTOS=" + orderDetailsDTOS +
                '}';
    }
}

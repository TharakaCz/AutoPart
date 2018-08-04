package lk.ijse.autopart.rest.dto;

import java.util.List;

public class PlaceOrdersDTO {

    private GigDTO gigDTO;
    private OrdersDTO ordersDTO;
    private List<OrderDetailsDTO> orderDetailsDTOS;

    public PlaceOrdersDTO() {
    }

    public PlaceOrdersDTO(GigDTO gigDTO, OrdersDTO ordersDTO, List<OrderDetailsDTO> orderDetailsDTOS) {
        this.gigDTO = gigDTO;
        this.ordersDTO = ordersDTO;
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

    public List<OrderDetailsDTO> getOrderDetailsDTOS() {
        return orderDetailsDTOS;
    }

    public void setOrderDetailsDTOS(List<OrderDetailsDTO> orderDetailsDTOS) {
        this.orderDetailsDTOS = orderDetailsDTOS;
    }

    @Override
    public String toString() {
        return "PlaceOrdersDTO{" +
                "gigDTO=" + gigDTO +
                ", ordersDTO=" + ordersDTO +
                ", orderDetailsDTOS=" + orderDetailsDTOS +
                '}';
    }
}

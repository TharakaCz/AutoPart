package lk.ijse.autopart.rest.dto;

public class OrderDetailsDTO {

    private int id;
    private int qty;
    private double tot;
    private OrdersDTO ordersDTO;
    private  GigDTO gigDTO;
    private GigDetailsDTO gigDetailsDTO;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(int id) {
        this.id = id;
    }

    public OrderDetailsDTO(int id, int qty, double tot, OrdersDTO ordersDTO, GigDTO gigDTO, GigDetailsDTO gigDetailsDTO) {
        this.id = id;
        this.qty = qty;
        this.tot = tot;
        this.ordersDTO = ordersDTO;
        this.gigDTO = gigDTO;
        this.gigDetailsDTO = gigDetailsDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    public GigDTO getGigDTO() {
        return gigDTO;
    }

    public void setGigDTO(GigDTO gigDTO) {
        this.gigDTO = gigDTO;
    }

    public GigDetailsDTO getGigDetailsDTO() {
        return gigDetailsDTO;
    }

    public void setGigDetailsDTO(GigDetailsDTO gigDetailsDTO) {
        this.gigDetailsDTO = gigDetailsDTO;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "id=" + id +
                ", qty=" + qty +
                ", tot=" + tot +
                ", ordersDTO=" + ordersDTO +
                ", gigDTO=" + gigDTO +
                ", gigDetailsDTO=" + gigDetailsDTO +
                '}';
    }
}

package lk.ijse.autopart.rest.dto;

public class OrderDetailsDTO {

    private int qty;

    private double unitprice;

    private GigDTO gig;

    private OrdersDTO orders;

    private OrderDetails_PKDTO orderDetailsPkdto;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(int qty, double unitprice, GigDTO gig, OrdersDTO orders, OrderDetails_PKDTO orderDetailsPkdto) {
        this.setQty(qty);
        this.setUnitprice(unitprice);
        this.setGig(gig);
        this.setOrders(orders);
        this.setOrderDetailsPkdto(orderDetailsPkdto);
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public GigDTO getGig() {
        return gig;
    }

    public void setGig(GigDTO gig) {
        this.gig = gig;
    }

    public OrdersDTO getOrders() {
        return orders;
    }

    public void setOrders(OrdersDTO orders) {
        this.orders = orders;
    }

    public OrderDetails_PKDTO getOrderDetailsPkdto() {
        return orderDetailsPkdto;
    }

    public void setOrderDetailsPkdto(OrderDetails_PKDTO orderDetailsPkdto) {
        this.orderDetailsPkdto = orderDetailsPkdto;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "qty=" + qty +
                ", unitprice=" + unitprice +
                ", gig=" + gig +
                ", orders=" + orders +
                ", orderDetailsPkdto=" + orderDetailsPkdto +
                '}';
    }
}

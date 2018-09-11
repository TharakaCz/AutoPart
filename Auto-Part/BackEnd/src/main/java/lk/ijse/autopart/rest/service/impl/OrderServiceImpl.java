package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.*;

import lk.ijse.autopart.rest.entity.*;
import lk.ijse.autopart.rest.repository.OrderDetailsRepository;
import lk.ijse.autopart.rest.repository.OrderRepository;

import lk.ijse.autopart.rest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private OrderDetailsRepository detailsRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(PlaceOrderDTO placeOrderDTO) {

        CustomerDTO customerDTO = placeOrderDTO.getCustomerDTO();
        SellerDTO sellerDTO = placeOrderDTO.getSellerDTO();
        OrdersDTO ordersDTO = placeOrderDTO.getOrdersDTO();
        GigDTO gigDTO = placeOrderDTO.getGigDTO();
        GigDetailsDTO gigDetailsDTO = placeOrderDTO.getGigDetailsDTO();

        Customer customer = new Customer(customerDTO.getcNic(),
                customerDTO.getcName(),
                customerDTO.getcEmail(),
                customerDTO.getcAddress(),
                customerDTO.getcContact(),
                customerDTO.getcPassword());

        Seller seller = new Seller(sellerDTO.getsNic(),
                sellerDTO.getsName(),
                sellerDTO.getsEmail(),
                sellerDTO.getsAddress(),
                sellerDTO.getsCompany(),
                sellerDTO.getsContactNo());

        Orders orders = new Orders(ordersDTO.getoDate(),
                ordersDTO.getTotalPrice(),
                customer);


        Gig gig = new Gig(gigDTO.getgQty(),
                gigDTO.getAvailable(),
                seller);

        GigDetails gigDetails = new GigDetails(gigDetailsDTO.getgTitel(),
                gigDetailsDTO.getgPic(),
                gigDetailsDTO.getgDiscription(),
                gigDetailsDTO.getgPrice(),
                gigDetailsDTO.getgContact(),
                gigDetailsDTO.getgEmail(),
                gig);

        List<OrderDetailsDTO>orderDetailsDTOS = placeOrderDTO.getOrderDetailsDTOS();

        for (OrderDetailsDTO orderDetailsDTO: orderDetailsDTOS){

            OrderDetails orderDetails = new OrderDetails(
                    orderDetailsDTO.getQty(),
                    orderDetailsDTO.getTot(),
                    orders,
                    gig,
                    gigDetails

            );
            detailsRepository.save(orderDetails);
        }

        repository.save(orders);
        return true;
    }

//    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//    public boolean save(OrdersDTO ordersDTO) {
//
//        Orders orders = new Orders();
//        Customer customer = new Customer();
//        Gig gig = new Gig();
//        GigDetails gigDetails = new GigDetails();
//
//
//        orders.setoDate(ordersDTO.getoDate());
//        orders.setTotalPrice(ordersDTO.getTotalPrice());
//        orders.setCustomer(customer);
//
//        CustomerDTO customerDTO = ordersDTO.getCustomerDTO();
//        customer.setcNic(customerDTO.getcNic());
////        customer.setcName(customerDTO.getcName());
////        customer.setcEmail(customerDTO.getcEmail());
////        customer.setcContact(customerDTO.getcContact());
////        customer.setcAddress(customerDTO.getcAddress());
////        customer.setcPassword(customerDTO.getcPassword());
//
//        orders.setCustomer(customer);
//
//
//        boolean isAdd = false;
//
//        List<OrderDetails>orderDetails = new ArrayList<>();
//        List<OrderDetailsDTO>orderDetailsDTOList = ordersDTO.getOrdersDTO();
//
////        for (OrderDetailsDTO orderDetailsDTO : orderDetailsDTOList){
////            OrderDetails details = new OrderDetails();
////            details.setQty(orderDetailsDTO.getQty());
////            gig.setgId(orderDetailsDTO.getGigDTO().getgId());
////            gig.setgQty("45");
////            gig.setAvailable(orderDetailsDTO.);
////            details.setGig(gig);
////            details.setTot(orderDetailsDTO.getTot());
////            details.setOrders(orders);
////            orderDetails.add(details);
//
//
//
////        }
//
//        return false;
//    }
}

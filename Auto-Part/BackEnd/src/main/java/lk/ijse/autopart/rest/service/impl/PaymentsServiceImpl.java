package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.PakagesDTO;
import lk.ijse.autopart.rest.dto.PaymentsDTO;
import lk.ijse.autopart.rest.dto.SellerDTO;
import lk.ijse.autopart.rest.entity.Pakages;
import lk.ijse.autopart.rest.entity.Payments;
import lk.ijse.autopart.rest.entity.Seller;
import lk.ijse.autopart.rest.repository.PaymentsRepository;

import lk.ijse.autopart.rest.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
public class PaymentsServiceImpl implements PaymentsService {

    @Autowired
    private PaymentsRepository repository;




    @Override
    public boolean save(PaymentsDTO paymentsDTO) {

        SellerDTO sellerDTO = paymentsDTO.getSellerDTO();

        Seller seller = new Seller();
        seller.setsNic(sellerDTO.getsNic());
        seller.setsName(sellerDTO.getsName());
        seller.setsEmail(sellerDTO.getsEmail());
        seller.setsAddress(sellerDTO.getsAddress());
        seller.setsContactNo(sellerDTO.getsContactNo());
        seller.setsCompany(sellerDTO.getsCompany());

       Payments payments = new Payments(
               paymentsDTO.getPakageName(),
               paymentsDTO.getDate(),
               seller
       );


       repository.save(payments);
        return true;
    }

    @Override
    public boolean delete(int id) {

        repository.deleteById(id);
        return true;
    }

    @Override
    public ArrayList<PaymentsDTO> getAllPayments() {


        return null;
    }

    @Override
    public PaymentsDTO getPayments(int id) {

        return null;
    }
}

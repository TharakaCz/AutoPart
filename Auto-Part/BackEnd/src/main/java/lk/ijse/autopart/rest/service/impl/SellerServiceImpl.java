package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.SellerDTO;
import lk.ijse.autopart.rest.entity.Seller;
import lk.ijse.autopart.rest.repository.SellerRepository;
import lk.ijse.autopart.rest.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository repository;

    @Override
    public ArrayList<SellerDTO> getAllSellers() {
        List<Seller> sellers=repository.findAll();

        ArrayList<SellerDTO>alSellers = new ArrayList<>();

        for (Seller seller : sellers){
            SellerDTO sellerDTO = new SellerDTO(seller.getsNic(),
                    seller.getsName(),
                    seller.getsEmail(),
                    seller.getsAddress(),
                    seller.getsContactNo(),
                    seller.getsCompany());
            alSellers.add(sellerDTO);
        }
        return alSellers;
    }

    @Override
    public SellerDTO getSellers(String sNic) {
        Seller seller = repository.findById(sNic).get();
        SellerDTO sellerDTO = new SellerDTO(seller.getsNic(),seller.getsName(),seller.getsEmail(),seller.getsAddress(),seller.getsContactNo(),seller.getsCompany());
        return sellerDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteSellers(String sNic) {
        repository.deleteById(sNic);
        return  true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveSellers(SellerDTO seller) {
        Seller seller1 = new Seller(seller.getsNic(),
                seller.getsName(),
                seller.getsEmail(),
                seller.getsAddress(),
                seller.getsContactNo(),
                seller.getsCompany());
        repository.save(seller1);

        return true;
    }

    @Override
    public long getTotalSellers() {
        return repository.getTotalSellers();
    }
}

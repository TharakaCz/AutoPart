package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.GigDTO;
import lk.ijse.autopart.rest.dto.GigDetailsDTO;
import lk.ijse.autopart.rest.dto.PlaceGig;
import lk.ijse.autopart.rest.dto.SellerDTO;
import lk.ijse.autopart.rest.entity.Gig;
import lk.ijse.autopart.rest.entity.GigDetails;
import lk.ijse.autopart.rest.entity.Seller;
import lk.ijse.autopart.rest.repository.GigDetailRepository;
import lk.ijse.autopart.rest.repository.GigRepository;
import lk.ijse.autopart.rest.service.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class GigServiceImpl implements GigService {
    @Autowired
    private GigRepository repository;

    @Autowired
    private GigDetailRepository gigDetailRepository;
    @Override
    public boolean save(PlaceGig placeGig)  {

        SellerDTO sellerDTO = placeGig.getSeller();
        GigDTO gigDTO=placeGig.getGigDTO();
        Seller seller=new Seller(sellerDTO.getsNic(),sellerDTO.getsName(),sellerDTO.getsEmail(),sellerDTO.getsAddress(),sellerDTO.getsContactNo(),sellerDTO.getsCompany());
        Gig gig=new Gig(gigDTO.getgQty(),gigDTO.getAvailable(),seller);

        List<GigDetailsDTO> gigDetailsDTOS = placeGig.getGigDetailsDTO();

        for (GigDetailsDTO gigDetails:gigDetailsDTOS
             ) {
            GigDetails gigDet=new GigDetails(
                    gigDetails.getgTitel(),gigDetails.getgPic(),gigDetails.getgDiscription(),gigDetails.getgPrice(),gigDetails.getgContact(),gigDetails.getgEmail(),gig
            );

            gigDetailRepository.save(gigDet);
        }

        repository.save(gig);
        return  true;
    }
}

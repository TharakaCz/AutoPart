package lk.ijse.autopart.rest.dto;

import lk.ijse.autopart.rest.entity.Seller;

import java.util.List;

public class PlaceGig {
    private GigDTO gigDTO;
    private SellerDTO seller;
    private List<GigDetailsDTO> gigDetailsDTO;

    public PlaceGig() {
    }

    public PlaceGig(GigDTO gigDTO, SellerDTO seller, List<GigDetailsDTO> gigDetailsDTO) {
        this.gigDTO = gigDTO;
        this.seller = seller;
        this.gigDetailsDTO = gigDetailsDTO;
    }

    public GigDTO getGigDTO() {
        return gigDTO;
    }

    public void setGigDTO(GigDTO gigDTO) {
        this.gigDTO = gigDTO;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }

    public List<GigDetailsDTO> getGigDetailsDTO() {
        return gigDetailsDTO;
    }

    public void setGigDetailsDTO(List<GigDetailsDTO> gigDetailsDTO) {
        this.gigDetailsDTO = gigDetailsDTO;
    }

    @Override
    public String toString() {
        return "PlaceGig{" +
                "gigDTO=" + gigDTO +
                ", seller=" + seller +
                ", gigDetailsDTO=" + gigDetailsDTO +
                '}';
    }
}

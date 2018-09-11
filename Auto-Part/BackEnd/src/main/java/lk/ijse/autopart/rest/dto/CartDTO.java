package lk.ijse.autopart.rest.dto;


import java.util.List;

public class CartDTO {

    private int id;

    private List<GigDTO> gigDTOList;

    private List<GigDetailsDTO>gigDetailsDTOS;

    private CustomerDTO customerDTO;

    public CartDTO() {
    }

    public CartDTO(int id) {
        this.id = id;
    }

    public CartDTO(List<GigDTO> gigDTOList, List<GigDetailsDTO> gigDetailsDTOS, CustomerDTO customerDTO) {
        this.gigDTOList = gigDTOList;
        this.gigDetailsDTOS = gigDetailsDTOS;
        this.customerDTO = customerDTO;
    }

    public CartDTO(int id, List<GigDTO> gigDTOList, List<GigDetailsDTO> gigDetailsDTOS, CustomerDTO customerDTO) {
        this.id = id;
        this.gigDTOList = gigDTOList;
        this.gigDetailsDTOS = gigDetailsDTOS;
        this.customerDTO = customerDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<GigDTO> getGigDTOList() {
        return gigDTOList;
    }

    public void setGigDTOList(List<GigDTO> gigDTOList) {
        this.gigDTOList = gigDTOList;
    }

    public List<GigDetailsDTO> getGigDetailsDTOS() {
        return gigDetailsDTOS;
    }

    public void setGigDetailsDTOS(List<GigDetailsDTO> gigDetailsDTOS) {
        this.gigDetailsDTOS = gigDetailsDTOS;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "id=" + id +
                ", gigDTOList=" + gigDTOList +
                ", gigDetailsDTOS=" + gigDetailsDTOS +
                ", customerDTO=" + customerDTO +
                '}';
    }
}

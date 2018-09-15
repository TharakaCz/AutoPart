package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.ComplainsDTO;
import lk.ijse.autopart.rest.dto.CustomerDTO;
import lk.ijse.autopart.rest.entity.Complains;
import lk.ijse.autopart.rest.entity.Customer;
import lk.ijse.autopart.rest.repository.ComplainsRepository;
import lk.ijse.autopart.rest.repository.CustomerRepository;
import lk.ijse.autopart.rest.service.ComplainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ComplainsServiceImpl implements ComplainsService {

    @Autowired
    private ComplainsRepository repository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(ComplainsDTO complainsDTO) {

        System.out.println("click");
        CustomerDTO customerDTO = complainsDTO.getCustomerDTO();

        Customer customer = new Customer(
                customerDTO.getcNic(),
                customerDTO.getcName(),
                customerDTO.getcEmail(),
                customerDTO.getcAddress(),
                customerDTO.getcContact(),
                customerDTO.getcPassword()
        );

        Complains complains = new Complains(
                complainsDTO.getTitel(),
                complainsDTO.getDisciption(),
                complainsDTO.getDate(),
                customer
        );

        repository.save(complains);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(int id) {

        repository.deleteById(id);
        return true;
    }

    @Override
    public ComplainsDTO getComplains(int id) {
        return null;
    }

    @Override
    public ArrayList<ComplainsDTO> getAllComplains() {



        return null;
    }

    @Override
    public long TotalComplains() {
        return 0;
    }
}

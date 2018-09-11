package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.DiliverDTO;
import lk.ijse.autopart.rest.entity.Diliver;
import lk.ijse.autopart.rest.repository.DiliverRepository;
import lk.ijse.autopart.rest.service.DiliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class DiliverServiceImpl implements DiliverService {

    @Autowired
    private DiliverRepository repository;

    @Override
    @Transactional(propagation =  Propagation.REQUIRED)
    public boolean save(DiliverDTO diliverDTO) {

        Diliver diliver = new Diliver(diliverDTO.getdNic(),
                diliverDTO.getdName(),
                diliverDTO.getdAddress(),
                diliverDTO.getdEmail(),
                diliverDTO.getdContact());

        repository.save(diliver);

        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(String dNic) {
        repository.deleteById(dNic);
        return true;
    }

    @Override
    public ArrayList<DiliverDTO> getAllDiliver() {

        List<Diliver>dilivers = repository.findAll();

        ArrayList<DiliverDTO>diliverDTOS = new ArrayList<>();

        for (Diliver diliver : dilivers){
            DiliverDTO diliverDTO = new DiliverDTO(
                    diliver.getdNic(),
                    diliver.getdName(),
                    diliver.getdAddress(),
                    diliver.getdEmail(),
                    diliver.getdContact()
            );

            diliverDTOS.add(diliverDTO);


        }

        return diliverDTOS;
    }




    @Override
    public DiliverDTO getDiliver(String dNic) {
        return null;
    }

    @Override
    public long getAllDilivers() {
        return repository.getAllDilivers();
    }
}

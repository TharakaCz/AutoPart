package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.PakagesDTO;
import lk.ijse.autopart.rest.entity.Pakages;
import lk.ijse.autopart.rest.repository.PakagesRepository;
import lk.ijse.autopart.rest.service.PakagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class PakagesServiceImpl implements PakagesService {


    @Autowired
    private PakagesRepository repository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(PakagesDTO pakagesDTO) {

        Pakages pakages = new Pakages(
                pakagesDTO.getPakageTitel(),
                pakagesDTO.getPakagePrice(),
                pakagesDTO.getPakageDuration()
        );

        repository.save(pakages);

        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(int id) {
        repository.deleteById(id);

        return true;
    }

    @Override
    public PakagesDTO getPakage(int id) {

        Pakages pakages = repository.findById(id).get();

        PakagesDTO pakagesDTO = new PakagesDTO(
                pakages.getId(),
                pakages.getPakageTitel(),
                pakages.getPakagePrice(),
                pakages.getPakageDuration()
        );


        return pakagesDTO;
    }

    @Override
    public ArrayList<PakagesDTO> getAllPakage() {

        List<Pakages>pakagesList = repository.findAll();

        ArrayList<PakagesDTO>pakagesDTOArrayList = new ArrayList<>();

        for (Pakages pakages : pakagesList){
            PakagesDTO pakagesDTO = new PakagesDTO(
                    pakages.getId(),
                    pakages.getPakageTitel(),
                    pakages.getPakagePrice(),
                    pakages.getPakageDuration()
            );

            pakagesDTOArrayList.add(pakagesDTO);
        }
        return pakagesDTOArrayList;
    }


    @Override
    public long TotalPakages() {
        return repository.TotalPakages();
    }
}

package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.DiliverDTO;

import java.util.ArrayList;

public interface DiliverService {

    public boolean save(DiliverDTO diliverDTO);

    public boolean delete(String dNic);

    public ArrayList<DiliverDTO>getAllDiliver();

    public DiliverDTO getDiliver(String dNic);

    public long getAllDilivers();
}

package lk.ijse.autopart.rest.service;


import lk.ijse.autopart.rest.dto.PakagesDTO;

import java.util.ArrayList;

public interface PakagesService {

    public boolean save(PakagesDTO pakagesDTO);

    public boolean delete(int id);

    public PakagesDTO getPakage(int id);

    public ArrayList<PakagesDTO>getAllPakage();

    public long TotalPakages();

}

package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.ComplainsDTO;

import java.util.ArrayList;

public interface ComplainsService {

    public boolean save(ComplainsDTO complainsDTO);

    public boolean delete(int id);

    public ComplainsDTO getComplains(int id);

    public ArrayList<ComplainsDTO>getAllComplains();

    public long TotalComplains();
}

package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.PaymentsDTO;


import java.util.ArrayList;

public interface PaymentsService {

    public boolean save(PaymentsDTO paymentsDTO);

    public boolean delete(int id);

    public ArrayList<PaymentsDTO>getAllPayments();

    public PaymentsDTO getPayments(int id);


}

package lk.ijse.autopart.rest.service;

import lk.ijse.autopart.rest.dto.PaymentsDTO;

import java.util.ArrayList;

public interface PaymentsService {

    public ArrayList<PaymentsDTO> loardAllPayments();

    public boolean deletePayments(String nIc);

    public boolean puchesePayment(PaymentsDTO paymentsDTO);

    public PaymentsDTO getPayments(String nIc);

    public long getTotelPayments();
}

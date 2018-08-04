package lk.ijse.autopart.rest.service.impl;

import lk.ijse.autopart.rest.dto.PaymentsDTO;
import lk.ijse.autopart.rest.entity.Payments;
import lk.ijse.autopart.rest.repository.PaymentsRepository;
import lk.ijse.autopart.rest.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class PaymentsServiceImpl implements PaymentsService {

    @Autowired
    private PaymentsRepository repository;

    @Override
    public ArrayList<PaymentsDTO> loardAllPayments() {

        List<Payments>payments = repository.findAll();

        ArrayList<PaymentsDTO> alPayments = new ArrayList<>();

        for (Payments payment :payments ){
            PaymentsDTO paymentsDTO = new PaymentsDTO(payment.getnIc(),
                    payment.getpName(),
                    payment.getpEmail(),
                    payment.getpContactNo(),
                    payment.getPackageType(),
                    payment.getCost());
            alPayments.add(paymentsDTO);
        }
        return alPayments;

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deletePayments(String nIc) {
        repository.deleteById(nIc);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean puchesePayment(PaymentsDTO paymentsDTO) {

        Payments payments = new Payments(paymentsDTO.getnIc(),
                paymentsDTO.getpName(),
                paymentsDTO.getpEmail(),
                paymentsDTO.getpContactNo(),
                paymentsDTO.getPackageType(),
                paymentsDTO.getCost());
        repository.save(payments);
        return true;
    }

    @Override
    public PaymentsDTO getPayments(String nIc) {

        Payments payments = repository.findById(nIc).get();
        PaymentsDTO paymentsDTO = new PaymentsDTO(payments.getnIc(),
                payments.getpName(),
                payments.getpEmail(),
                payments.getpContactNo(),
                payments.getPackageType(),
                payments.getCost());

        return paymentsDTO;
    }

    @Override
    public long getTotelPayments() {
        return repository.getTotelPayments();
    }
}

package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaymentsRepository extends JpaRepository<Payments,String> {

    @Query("select count (p.nIc) from Payments p")
    long getTotelPayments();

}

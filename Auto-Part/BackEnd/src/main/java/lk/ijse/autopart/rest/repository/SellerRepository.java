package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SellerRepository  extends JpaRepository<Seller,String> {

    @Query("SELECT count (s.sNic) FROM Seller s")
    long getTotalSellers();
}

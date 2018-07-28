package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.SellerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SellerAccountRepository  extends JpaRepository<SellerAccount,String> {

    @Query("SELECT count (sa.email) FROM SellerAccount sa")
    long getAllSellerAccount();
}

package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.SellerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SellerLoginRepository extends JpaRepository<SellerAccount,String> {



}

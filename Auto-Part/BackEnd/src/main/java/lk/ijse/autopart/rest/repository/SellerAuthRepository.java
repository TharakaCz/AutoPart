package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.SellerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerAuthRepository extends JpaRepository<SellerAccount,String> {

}

package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer> {
}

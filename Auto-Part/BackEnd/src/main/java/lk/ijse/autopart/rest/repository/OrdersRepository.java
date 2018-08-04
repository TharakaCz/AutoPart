package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}

package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
}

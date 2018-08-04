package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.OrderDelatil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDelatil,Integer> {
}

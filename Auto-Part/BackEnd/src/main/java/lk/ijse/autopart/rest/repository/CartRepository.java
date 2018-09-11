package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}

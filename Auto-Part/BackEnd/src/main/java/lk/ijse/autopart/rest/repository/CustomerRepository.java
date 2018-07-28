package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}

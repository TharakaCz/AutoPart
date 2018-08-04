package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,String> {

    @Query("SELECT COUNT (c.cNic) from Customer c")
    long getTotelCustomers();
}

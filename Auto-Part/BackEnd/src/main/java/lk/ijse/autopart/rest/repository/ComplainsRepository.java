package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Complains;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComplainsRepository extends JpaRepository<Complains,Integer> {

    @Query("SELECT count (cp.id) from Complains cp")
    public long TotalComplains();
}

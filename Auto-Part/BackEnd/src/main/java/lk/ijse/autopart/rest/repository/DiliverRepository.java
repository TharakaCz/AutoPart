package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Diliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DiliverRepository extends JpaRepository<Diliver,String> {

    @Query("SELECT  COUNT (d.dNic) FROM Diliver d")
    long getAllDilivers();

}

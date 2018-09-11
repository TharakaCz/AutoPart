package lk.ijse.autopart.rest.repository;

import lk.ijse.autopart.rest.entity.Pakages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PakagesRepository extends JpaRepository<Pakages,Integer> {

    @Query("SELECT count (pa.id) from Pakages pa")
    long TotalPakages();
}

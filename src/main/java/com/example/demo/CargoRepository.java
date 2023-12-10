package com.example.demo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    @Query("SELECT p FROM Cargo p WHERE CONCAT(p.id, '',  p.first, '',  p.content, '', p.dc, '', p.dd, '', p.ac, '', p.ad) LIKE %?1%")
    List<Cargo> search(String keyword);


}

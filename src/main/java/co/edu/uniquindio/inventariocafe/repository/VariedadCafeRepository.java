package co.edu.uniquindio.inventariocafe.repository;

import co.edu.uniquindio.inventariocafe.entity.VariedadCafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariedadCafeRepository extends JpaRepository<VariedadCafe, Long> {
}
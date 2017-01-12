package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import mx.utng.practice.model.Specie;

public interface SpecieRepository extends JpaRepository<Specie,Long> {
	@Query("select specie from Specie specie")
	public List<Specie> finAll();
}












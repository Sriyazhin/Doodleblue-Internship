package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Batch;
@Repository
public interface Batchrepository extends JpaRepository<Batch,Integer>{

	Optional<Batch> findByName(String name);

}

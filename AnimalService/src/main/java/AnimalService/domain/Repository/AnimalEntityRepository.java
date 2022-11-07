package AnimalService.domain.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AnimalService.domain.Animal;

public interface AnimalEntityRepository extends JpaRepository<Animal, Long> {

		List<Animal> findByTypeAndBreed(String type, String breed);
		
		List<Animal> findByType(String type);

	
	
}
 

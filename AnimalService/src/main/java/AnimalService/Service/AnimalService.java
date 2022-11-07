package AnimalService.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.commons.lang3.StringUtils;

import AnimalService.Resources.AnimalResources;
import AnimalService.Resources.AnimalOperationResponse;
import AnimalService.domain.Animal;
import AnimalService.domain.Repository.AnimalEntityRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AnimalService {

	@Autowired
	AnimalEntityRepository animalEntityRepository;

	public List<Animal> getAllAnimals() {
		try {
			return animalEntityRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;

	}

	public Animal getAnimalById(long animalId) {
		try {
			Optional<Animal> optionalAnimal = animalEntityRepository.findById(animalId);
			return optionalAnimal.isPresent() ? optionalAnimal.get() : null;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public List<Animal> getAnimalByType(String type, String breed) {

		try {
			if (StringUtils.isBlank(breed))
				return animalEntityRepository.findByType(type);
			else
				return animalEntityRepository.findByTypeAndBreed(type, breed);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public AnimalOperationResponse addAnimals(List<AnimalResources> animals) {
		try {
			animals.stream().forEach(a -> {
				Animal animal = Animal.builder().breed(a.getBreed()).type(a.getType()).color(a.getColor())
						.name(a.getName()).createDate(new Date()).updateDate(new Date()).build();
				animalEntityRepository.save(animal);
			});
			return AnimalOperationResponse.builder().errorCode(0).errorMessage("Sucess").build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return AnimalOperationResponse.builder().errorCode(1).errorMessage(e.getMessage()).build();
		}

	}

	public AnimalOperationResponse updateAnimal(long animalId, AnimalResources animalResources) {
		try {
			Optional<Animal> animal = animalEntityRepository.findById(animalId);
			if (animal.isPresent()) {
				Animal existingAnimal = animal.get();
				UpdateAnimalObject(animalResources, existingAnimal);
				animalEntityRepository.save(existingAnimal);
				return AnimalOperationResponse.builder().errorCode(0).errorMessage("Success").build();
			}
			return AnimalOperationResponse.builder().errorCode(0).errorMessage("Animal not found ").build();
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return AnimalOperationResponse.builder().errorCode(1).errorMessage(e.getMessage()).build();
		}
	}

	
	public AnimalOperationResponse deleteAnimal(long animalId) {
		try {
			Optional<Animal> animal = animalEntityRepository.findById(animalId);
			if (animal.isPresent()) {

				animalEntityRepository.deleteById(animalId);
				return AnimalOperationResponse.builder().errorCode(0).errorMessage("Success").build();
			}

			return AnimalOperationResponse.builder().errorCode(0).errorMessage("Animal does not exists").build();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return AnimalOperationResponse.builder().errorCode(1).errorMessage(e.getMessage()).build();
		}

	}

	private void UpdateAnimalObject(AnimalResources singleAnimalResource, Animal existingAnimal) {
		if (StringUtils.isNotBlank(singleAnimalResource.getBreed())) {
			existingAnimal.setBreed(singleAnimalResource.getBreed());
		}
		if (StringUtils.isNotBlank(singleAnimalResource.getName())) {
			existingAnimal.setName(singleAnimalResource.getName());
		}
		if (StringUtils.isNotBlank(singleAnimalResource.getType())) {
			existingAnimal.setName(singleAnimalResource.getType());
		}
		if (StringUtils.isNotBlank(singleAnimalResource.getColor())) {
			existingAnimal.setName(singleAnimalResource.getColor());
		}
	}

	
}

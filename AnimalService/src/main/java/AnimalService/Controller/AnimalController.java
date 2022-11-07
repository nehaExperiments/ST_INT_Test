package AnimalService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import AnimalService.Resources.AnimalResources;
import AnimalService.Resources.AnimalOperationResponse;
import AnimalService.Service.AnimalService;
import AnimalService.domain.Animal;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/animalService")
@Slf4j
public class AnimalController {
	@Autowired
	AnimalService animalService;
	
	
	
	@RequestMapping(value = "/getAnimals", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Animal>> getAllAnimal()
	{
		log.info("getAllAnimals");
		List<Animal> animalList = animalService.getAllAnimals();
		return new ResponseEntity<List<Animal>>(animalList, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/getAnimalsByType", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Animal>> getAnimalByType(@RequestParam String type, @RequestParam(required = false) String breed )
	{
		log.info(" getAnimal for type : "+type +"breed :"+breed);
		List<Animal> animalList= animalService.getAnimalByType(type, breed);
		return new ResponseEntity<List<Animal>>(animalList, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/createAnimals", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AnimalOperationResponse> createAnimals(@RequestBody  List<AnimalResources> animals)
	{
		log.info(" create Animals ");
		AnimalOperationResponse updateAnimalResponse= animalService.addAnimals(animals);
		return new ResponseEntity<AnimalOperationResponse>(updateAnimalResponse, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/getAnimal/{animalId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Animal> getAnimalById(@PathVariable long animalId)
	{
		log.info(" getAnimal for id : "+animalId);
		Animal animal= animalService.getAnimalById(animalId);
		return new ResponseEntity<Animal>(animal, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/updateAnimal/{animalId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AnimalOperationResponse> updateAnimal(@PathVariable long animalId , @RequestBody  AnimalResources animalResources)
	{
		log.info(" updateAnimal by Id : " +animalId);
		AnimalOperationResponse updateAnimalResponse= animalService.updateAnimal(animalId ,  animalResources);
		return new ResponseEntity<AnimalOperationResponse>(updateAnimalResponse, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/deleteAnimal/{animalId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AnimalOperationResponse> deleteAnimal(@PathVariable long animalId )
	{
		AnimalOperationResponse updateAnimalResponse= animalService.deleteAnimal(animalId );
		return new ResponseEntity<AnimalOperationResponse>(updateAnimalResponse, HttpStatus.OK);
		
		
	}
	

}

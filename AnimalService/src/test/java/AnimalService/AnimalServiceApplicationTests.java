package AnimalService;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import AnimalService.Controller.AnimalController;
import AnimalService.domain.Animal;
import AnimalService.domain.Repository.AnimalEntityRepository;



@EnableAutoConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AnimalServiceApplicationTests {
	
	@Autowired
	  AnimalEntityRepository animalRepo;
	 
	@Test
	public void testCreate () {
		Animal p = new Animal();
		p.setName("julie");
		p.setBreed("german");
		p.setType("dog");
		p.setColor("yellow");
		animalRepo.save(p);
		assertNotNull(animalRepo.findByType("dog").get(0));
	}
	
	
}

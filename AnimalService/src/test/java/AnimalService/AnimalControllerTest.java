package AnimalService;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.client.RestTemplate;

import AnimalService.Controller.AnimalController;

@WebMvcTest(AnimalController.class)
@ExtendWith(SpringExtension.class)
public class AnimalControllerTest {
	
	
	@Autowired
	private MockMvc mvc;

	@Test
	public void getAllAnimalTest()
	{
		RequestBuilder req = MockMvcRequestBuilders.get("/AnimalService/getAnimals");
		try {
			MvcResult result = mvc.perform(req).andReturn();
			assertNotNull(result.getResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package AnimalService.Resources;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimalResources implements Serializable  {
	String type;
	String name;
	String color;
	String breed;
	

}
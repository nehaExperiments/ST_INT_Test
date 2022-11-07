package AnimalService.Resources;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimalOperationResponse {
	
	String errorMessage;
	Integer errorCode;
	
}

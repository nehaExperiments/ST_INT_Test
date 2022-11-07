package gateway.security;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class GatewayValidator {
	
	public static final List<String> openApiEndpoints = Arrays.asList(
            "/auth/*",
            "/api-docs"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

}

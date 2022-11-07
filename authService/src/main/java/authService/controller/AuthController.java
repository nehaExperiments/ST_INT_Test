package authService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import authService.jwtSecurity.JwtUtil;

@RestController
public class AuthController {
	
	@Autowired
	JwtUtil jwtUtil;
	@GetMapping("/auth/getToken")
	public ResponseEntity<String> getToken(@RequestParam String userName) {
		// check if the userName exists in the db
		String token = jwtUtil.generateToken(userName);

		return new ResponseEntity<String>(token, HttpStatus.OK);
	}


}

1) AnimalService --> which has the real implementation for the following
   a) APIS 
   - getAnimals
   - getAnimalsById
   - createAnimals
   - updateAnimals
   - deleteAnimals
	  Have chosen only four attributes for Animal class
	   - type --> example dog , cat , elephant
	   - breed --> further categorization of animals
	   - color --> characteristic
	   - name --> for pets
   b) Database --> Postgres 
   c) No JWT implementaion assuming that it will protected by TLS and firewall.
   d) Tired the unit test using mockMvc, facing some issues.

 2)AuthService --> this service is authenticating the user and generate token.

 3) Eureka service --> for service discovery.

 4) gateway --> API gateway service

 5) SecondAnimalTest --> has the implementation for the Second question.



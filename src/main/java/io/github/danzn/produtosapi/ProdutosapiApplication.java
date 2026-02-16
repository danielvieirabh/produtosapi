package io.github.danzn.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@RestController
public class ProdutosapiApplication {

//	@GetMapping("/hello-world") //chamada para trazer o helloWorld
//	public String helloWorld() {
//		return "Hello World! ";
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}

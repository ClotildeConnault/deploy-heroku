package be.technifutur.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployApplication {

	public static void main(String[] args) {
		System.out.println("test git 2");
		SpringApplication.run(DeployApplication.class, args);
	}

}

package pl.abc.faktury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakturyApplication {

	public static void main(String[] args) {

		SpringApplication.run(FakturyApplication.class, args);
		System.out.println("Test");
	}

}

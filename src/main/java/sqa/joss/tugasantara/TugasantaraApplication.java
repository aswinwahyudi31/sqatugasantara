package sqa.joss.tugasantara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TugasantaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(TugasantaraApplication.class, args);
		Dadu dadu = new Dadu(5);
//		dadu.toString();
	}
}

package sqa.joss.tugasantara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class TugasantaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(TugasantaraApplication.class, args);
		Dadu dadu = new Dadu(2);
		dadu.lempar();

		dadu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

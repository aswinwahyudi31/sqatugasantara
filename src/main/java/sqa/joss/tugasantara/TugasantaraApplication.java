package sqa.joss.tugasantara;

import javax.swing.JFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TugasantaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(TugasantaraApplication.class, args);
		
		Dadu dadu = new Dadu(8);
		dadu.lempar();
		
		dadu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	Nurse jackie = new Nurse("Jackie", "2222", 5, 50000);
	
	@Test
	public void calculateSalarayShouldReturnSalary() {
		// Arrange
		
		// Act
		int nurseSalary = jackie.calculatePay();
		
		// Assert
		assertThat(nurseSalary, is(equalTo(50000)));
	}
	
	@Test
	public void careForPatientsShouldIncreasePatientHealth() {
		// Arrange
		Patient patient = new Patient();
		
		// Act
		int patientHealthBeforeCare = patient.getHealthLevel();
		jackie.careForPatient(patient);
		int patientHealthAfterCare = patient.getHealthLevel();
		
		// Assert
		assertThat(patientHealthAfterCare, is(equalTo(patientHealthBeforeCare + 5)));
	}
}

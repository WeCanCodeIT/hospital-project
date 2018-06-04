import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {
	
	Patient patient = new Patient();

	@Test
	public void healShouldIncreasePatientHealth() {
		// Arrange
		int patientHealthBeforeHealing = patient.getHealthLevel();
		
		// Act
		patient.heal(5);
		int patientHealthAfterHealing = patient.getHealthLevel();
		
		// Assert
		assertThat(patientHealthAfterHealing, is(equalTo(patientHealthBeforeHealing + 5)));
	}
	
	@Test
	public void bleedShouldDecreaseAmountOfBloodInPatient() {
		int patientBloodLevelBeforeBleeding = patient.getBloodLevel();
		
		patient.bleed(5);
		int patientBloodLevelAfterBleeding = patient.getBloodLevel();
		
		assertThat(patientBloodLevelAfterBleeding, is(equalTo(patientBloodLevelBeforeBleeding - 5)));
	}
}

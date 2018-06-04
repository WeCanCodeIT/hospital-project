import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VampireJanitorTest {
	VampireJanitor donferatu = new VampireJanitor("Donferatu", "666", false, 200000, 10);
	
	@Test
	public void feedShouldSatiateBloodThirst() {
		Patient patient = new Patient("Patient 0", "1111", 25, 25);
		int bloodThirstBeforeFeeding = donferatu.getBloodThirst();
		
		donferatu.feed(patient, 5);
		int bloodThirstAfterFeeding = donferatu.getBloodThirst();
		
		assertThat(bloodThirstAfterFeeding, is(equalTo(bloodThirstBeforeFeeding - 5)));
	}
}

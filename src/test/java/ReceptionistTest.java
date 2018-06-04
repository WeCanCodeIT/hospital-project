import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {
	Receptionist derrick = new Receptionist("Derrick", "4444", false, 45000);
	
	@Test
	public void toggleIsOnPhoneShouldSetValueToOpposite() {
		boolean valueOfIsOnPhoneBeforeToggle = derrick.isOnPhone();
		
		derrick.toggleOnPhone();
		boolean valueOfIsOnPhoneAfterToggle = derrick.isOnPhone();
		
		assertThat(valueOfIsOnPhoneAfterToggle, is(equalTo(!valueOfIsOnPhoneBeforeToggle)));
	}
}

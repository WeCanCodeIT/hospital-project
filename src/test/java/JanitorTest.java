import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	Janitor jess = new Janitor("Jess", "5555", false, 40000);
	
	@Test
	public void toggleIsOnPhoneShouldSetValueToOpposite() {
		boolean valueOfIsSweepingBeforeToggle = jess.isSweeping();

		jess.toggleSweeping();
		boolean valueOfIsSweepingAfterToggle = jess.isSweeping();
		
		assertThat(valueOfIsSweepingAfterToggle, is(equalTo(!valueOfIsSweepingBeforeToggle)));
	}
}

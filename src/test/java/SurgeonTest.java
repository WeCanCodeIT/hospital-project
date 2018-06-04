import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	Surgeon edward = new Surgeon("Edward", "3333", "Cutting", 120000, false);
	
	@Test
	public void toggleOperatingShouldChangeTheValueOfIsOperatingToOpposite() {
		boolean valueOfIsoperatingBeforeToggle = edward.isOperating();
		
		edward.toggleOperating();
		boolean valueOfIsoperatingAfterToggle = edward.isOperating();
		
		assertThat(valueOfIsoperatingAfterToggle, is(equalTo(!valueOfIsoperatingBeforeToggle)));
	}
}

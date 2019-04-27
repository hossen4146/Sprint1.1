package SprintImplimetation;

import org.testng.annotations.Test;

import Utilities.CoreUtil;

public class SmokeTest extends CoreUtil {
	@Test
	public void smokeTest() {
		OpenBrowser();
		GoToWebapp();
		CloseBroser();
		
		
		
	}
	

}

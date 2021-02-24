package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setup_browser(Scenario sc) {
		System.out.println("launch chrome browser");
		System.out.println(sc.getName());
	}
	
	//@Before(order = 2)
	//public void setup_url() {
		//System.out.println("launch url");
//	}
	
	//@After(order = 2)
	//public void tearDown_close(Scenario sc) {
	//	System.out.println("close the browser");
		//System.out.println(sc.getName());
	//}
	
	@After("@Smoke")
	public void tearDown_logout() {
		System.out.println("logout from application");
	}
	
	@BeforeStep
	public void screenshot() {
		System.out.println("take the screenshot");
	}
	
	@AfterStep
	public void RefreshPage() {
		System.out.println("refresh the page");
	}
	
}

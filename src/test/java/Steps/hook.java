package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class hook 
{
	WebDriver driver;
	@Before
	public void Start()
	{
	System.out.println("Program started");
	}

	@After
	public void tearDown()
	{
		System.out.println("Program Ended");
	}
}

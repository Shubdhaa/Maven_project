package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class login2step_defination extends baseclass
{
WebDriver driver;
	
	@Given("the user is on {string}")
	public void the_user_is_on(String website) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chede appliances\\eclipse-workspace\\logical\\ChromeDriver\\chromedriver.exe");
		  driver=new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get(website);
	}

	@Given("the user input UserId as {string}")
	public void the_user_input_user_id_as(String UserId) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(UserId);	
		}

	@Given("the user input Password as {string}")
	public void the_user_input_password_as(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	@When("the user click on the login button")
	public void the_user_click_on_the_login_button() {
		 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}
}

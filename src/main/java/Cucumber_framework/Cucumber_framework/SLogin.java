package Cucumber_framework.Cucumber_framework;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class SLogin {
	WebDriver driver;
	@Given("the user is on website")
	public void the_user_is_on_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chede appliances\\eclipse-workspace\\logical\\ChromeDriver\\chromedriver.exe");	
		
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://demo.guru99.com/V4/index.php");
	}

	@Given("the user input userID")
	public void the_user_input_user_id() 
	{
		
	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr506580");
	}

	@Given("the user input password")
	public void the_user_input_password() 
	{
	    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("tYrumyp");
		
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() 
	{
	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}

	@Then("the user is on profile page")
	public void the_user_is_on_profile_page() {
	    String title = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
	    if(title.contains("mngr506580"))
	    {
	    	System.out.println("Logged In Succesfully");
	    }
	    else
	    {
	    	System.out.println("LoggeIn Failed");
	    }
	}

	@Given("the user selects New Customer tab")
	public void the_user_selects_new_customer_tab()
	{
	  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("the user adds all details")
	public void the_user_adds_all_details() {
	   driver.findElement(By.name("name")).sendKeys("Alston Mackey");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
	   driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("05-09-1972");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("Wakad");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Pune");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("Maharashtra");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("411086");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys("9860027887");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("AlstonM@gmail.com");
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("Alstonmackey@123");
	    
	}

	@When("the user clicks on Submit button")
	public void the_user_clicks_on_submit_button() 
	{
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
			    
	}
	
public void screenshot(String str) throws IOException
	
	{
	
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\chede appliances\\eclipse-workspace\\Cucumber_framework\\screenshot"+str+".png");
		
		FileHandler.copy(source, Dest);
		
	}
			
	
			
}

package Cucumber_framework.Cucumber_framework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sample 
{
	@Given("print Hi")
	public void print_hi() {
	    
System.out.println("Hi");
	}

	@When("print Hello")
	public void print_hello() {
	   
	   System.out.println("Hello");
	}

	@Then("print Hey")
	public void print_hey() {
	    
	 System.out.println("Hey");   
	}

	
	
	
	
	
	
	
	
	
}

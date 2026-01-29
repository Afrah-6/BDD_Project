package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SAMPLE {
	WebDriver driver;
	@Given("jggv")
	public void jggv() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Given("HUYHUJ")
	public void huyhuj() {
		driver.get("https://www.google.com/");
	   
	}

	@When("mjhv")
	public void mjhv() {
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   
	}

	@Then("gc")
	public void gc() {
		driver.quit();
	   
	}


}

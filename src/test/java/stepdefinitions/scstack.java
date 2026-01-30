package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scstack {
	WebDriver driver;

@Given("User is on link")
public void user_is_on_link() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

@When("User is diverted to login")
public void user_is_diverted_to_login() {
   driver.get("https://www.scrollstack.com");
}

@Then("User quits")
public void user_quits() {
	driver.quit();
   
}

}

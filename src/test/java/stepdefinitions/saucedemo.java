package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saucedemo {
	WebDriver driver;

@Given("Chrome browser is open")
public void chrome_browser_is_open() {
   driver=new ChromeDriver();
   driver.manage().window().maximize();
}

@Given("user is on login page")
public void user_is_on_login_page() {
	driver.navigate().to("https://www.saucedemo.com/");
   
}

@When("^user enters (.*) and (.*)")
public void user_clicks_standard_user_and_secret_sauce(String username, String password) throws InterruptedException {
	driver.findElement(By.id("user-name")).sendKeys(username);
	Thread.sleep(900);
	driver.findElement(By.id("password")).sendKeys(password);
	Thread.sleep(900);
   
}

@When("user clicks on login")
public void user_clicks_on_login() {
	driver.findElement(By.id("login-button")).click();
   
}

@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() {
   driver.quit();
}



}

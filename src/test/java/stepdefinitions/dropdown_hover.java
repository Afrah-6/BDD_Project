package stepdefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import capstone.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class dropdown_hover {
	WebDriver driver;
    HomePage homePage;

@Given("User is on home page")
public void user_is_on_home_page() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.bookswagon.com"); 
    homePage = new HomePage(driver);
  
}

@When("User clicks on Books")
public void user_clicks_on_books(String books) {
	        homePage.clickBooks();
	    }

@Then("User clicks on BW Best Sellers under Best Sellers")
public void user_clicks_on_bw_best_sellers_under_best_sellers(String BWBestSellers, String BestSellers) {
	 homePage.selectBooks_BWBestSellers();
     driver.quit();	
  
}

@When("User clicks on Fiction")
public void user_clicks_on_fiction() {
	 homePage.clickFiction();
   
}

@Then("User clicks on Fiction-BestSellers under Best-Sellers")
public void user_clicks_on_fiction_best_sellers_under_best_sellers() {
	  homePage.clickFictionBestSellers();
      driver.quit();
}

@When("User clicks on Non-Fiction")
public void user_clicks_on_non_fiction() {
	 homePage.clickNonFiction();
}

@Then("User clicks on Best Books Of The Year under Browse")
public void user_clicks_on_best_books_of_the_year_under_browse() {
	homePage.clickBestBooksOfYear();
    driver.quit();
}

@When("User clicks on Teens& Ya")
public void user_clicks_on_teens_ya() {
	 homePage.clickTeens();  
}

@Then("User clicks on RelationShip Stories Under Top Subjects")
public void user_clicks_on_relation_ship_stories_under_top_subjects() {
	 homePage.clickRelationshipStories();
     driver.quit();
}

@When("User clicks on Kids")
public void user_clicks_on_kids() {
	homePage.clickKids();
}

@Then("User clicks on Akbar and Birbal  under Popular Series")
public void user_clicks_on_akbar_and_birbal_under_popular_series() {
	 homePage.clickAkbarBirbal();
     driver.quit();
}

@When("User clicks on Exams")
public void user_clicks_on_exams() {
	 homePage.clickExams();
}

@Then("User clicks on Gate  under Engineering&Techical")
public void user_clicks_on_gate_under_engineering_techical() {
	homePage.clickGateExam();
    driver.quit();
}
}


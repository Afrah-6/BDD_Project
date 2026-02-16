package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	    WebDriver driver;
	    Actions actions;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        actions = new Actions(driver);
	    }

	    // ================= LOCATORS =================

	    // Main Menu
	    By booksMenu = By.linkText("Books");
	    By fictionMenu = By.linkText("Fiction");
	    By nonFictionMenu = By.linkText("Non-Fiction");
	    By teensMenu = By.linkText("Teens & Ya");
	    By kidsMenu = By.linkText("Kids");
	    By examsMenu = By.linkText("Exams");

	    // Sub Menu
	    By bwBestSellers = By.linkText("BW Best Sellers");
	    By fictionBestSellers = By.linkText("Fiction-BestSellers");
	    By bestBooksOfYear = By.linkText("Best Books Of The Year");
	    By relationshipStories = By.linkText("RelationShip Stories");
	    By akbarBirbal = By.linkText("Akbar and Birbal");
	    By gateExam = By.linkText("Gate");


	    // ================= GENERIC HOVER METHOD =================

	    public void hoverOnElement(By locator) {
	        WebElement element = driver.findElement(locator);
	        actions.moveToElement(element).perform();
	    }

	    public void clickElement(By locator) {
	        driver.findElement(locator).click();
	    }

	    // ================= TEST CASE METHODS =================

	    public void selectBooks_BWBestSellers() {
	        hoverOnElement(booksMenu);
	        clickElement(bwBestSellers);
	    }

	    public void selectFiction_BestSellers() {
	        hoverOnElement(fictionMenu);
	        clickElement(fictionBestSellers);
	    }

	    public void selectNonFiction_BestBooksOfYear() {
	        hoverOnElement(nonFictionMenu);
	        clickElement(bestBooksOfYear);
	    }

	    public void selectTeens_RelationshipStories() {
	        hoverOnElement(teensMenu);
	        clickElement(relationshipStories);
	    }

	    public void selectKids_AkbarBirbal() {
	        hoverOnElement(kidsMenu);
	        clickElement(akbarBirbal);
	    }

	    public void selectExams_Gate() {
	        hoverOnElement(examsMenu);
	        clickElement(gateExam);
	    }
	}

package extent_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class extentreport_ex {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest(){
		extent= new ExtentReports();
		spark=new ExtentSparkReporter("target/Spark.html");
		
	}
	
	
	@Test
	public void extenttest() {
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Report Demo");
		
		extent.attachReporter(spark);
		
		//create a test node in the report
		ExtentTest test=extent.createTest("login Test").assignAuthor("Noor")
				.assignCategory("regression").assignDevice("chrome");
		test.pass("Login Successful");
		test.info("URL Loaded");
		test.pass("Login Test Completed Successfully");
		
		
		ExtentTest test1=extent.createTest("login Test").assignAuthor("Noor")
				.assignCategory("run").assignDevice("chrome");
		test1.pass("Home page Successfull");
		test1.info("Value Entered");
		test1.fail("Test Case Fails");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equals("Google"))
		{
			test.log(Status.PASS,"Navigated to specified URL");
		}
		else {
			test.log(Status.FAIL,"test Failed");
		}
		driver.quit();
	}
	
	@AfterMethod
	public void teardown() {
		extent.flush();
	}
}

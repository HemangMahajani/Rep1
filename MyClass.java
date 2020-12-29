import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

		public static void main(String[] args) {
		
		// Opening Chrome browser or any other browser using webdriver
		
		System.setProperty("webdriver.Chrome.driver.Driver", "C:\\Users\\HP\\eclipse-workspace\\Test Automation");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		
		//Initializing variables for username and password
	//	String user = "user";
	//	String pass = "Password";
	//	String path = "C:\\\\Users\\\\HP\\\\Downloads\\\\CV";
		
		driver.findElement(By.id("identifierId")).sendKeys("user");							 // username/email for Gmail account
		driver.findElementByXPath("//*[@id=\"identifierNext\"]/div/button/div[2]").click();
		driver.findElementById("password").sendKeys("pass"); 									// Password for Gmail account
		driver.findElementByXPath("//*[@id=\"passwordNext\"]/div/button/div[2]").click();
		driver.findElementByXPath("//*[@id=\":l9\"]/div/div").click();
		driver.findElementByXPath("//*[@id=\":r6\"]").sendKeys("karishma@incubyte.co");
		driver.findElementByXPath("//*[@id=\":rx\"]").sendKeys("Automation Case Test");
		driver.findElementByXPath("//*[@id=\":w9\"]").click();
		driver.findElementByXPath("//*[@id=\":rx\"]").sendKeys("Automation Case Test");
		
		WebElement uploadElement = driver.findElement(By.id(":w9"));						// Uploading file using absolute path from Loacal
		uploadElement.sendKeys("path");
		
		driver.findElementByXPath("//*[@id=\":o6\"]").click();
		driver.findElementByXPath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img").click();
		driver.findElementById("gb_71").click();
		driver.close();
		
	}

}

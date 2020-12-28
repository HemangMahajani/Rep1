import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	//String user = "hemangmahajani09@gmail.com" ;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver.Driver", "C:\\Users\\HP\\eclipse-workspace\\Test Automation");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		
	//	driver.findElement(By.id("identifierId")).sendKeys("hemangmahajani09");
	//	driver.findElementByXPath("//*[@id=\"identifierNext\"]/div/button/div[2]").click();
	//	driver.findElementById("password").sendKeys("IAMTHEONELOADEDFLY1");
	//	driver.findElementByXPath("//*[@id=\"passwordNext\"]/div/button/div[2]").click();
	//	driver.findElementByXPath("//*[@id=\":l9\"]/div/div").click();
	//	driver.findElementByXPath("//*[@id=\":r6\"]").sendKeys("karishma@incubyte.co");
	//	driver.findElementByXPath("//*[@id=\":rx\"]").sendKeys("Automation Case Test");
	//	driver.findElementByXPath("//*[@id=\":w9\"]").click();
	//	driver.findElementByXPath("//*[@id=\":rx\"]").sendKeys("Automation Case Test");
		WebElement uploadElement = driver.findElement(By.id(":w9"));
		uploadElement.sendKeys("C:\\Users\\HP\\Downloads\\CV");
		driver.findElementByXPath("//*[@id=\":o6\"]").click();
		//driver.close();
		
	}

}

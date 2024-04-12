package comm.automation.demoproject;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class testing {

	public WebDriver driver;

	@BeforeMethod
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arun\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
@Test
	public void Test1() {
		driver.get("https://www.Automationtalks.com");
		System.out.println("This is for title 1 : " + driver.getTitle());

	}
@Test
	public void Test2() {
		driver.get("https://www.Automationtalks.com");
		System.out.println("This is fpr title 2 : " + driver.getTitle());

	}
@Test
	public void Test3() {
		driver.get("https://www.Automationtalks.com");
		System.out.println("This is fpr title 3 : " + driver.getTitle());

	}

@AfterMethod
public void close() {
	driver.close();
}
}

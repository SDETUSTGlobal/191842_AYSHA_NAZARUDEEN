package Sel1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
			driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
			driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
			driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
	}

}

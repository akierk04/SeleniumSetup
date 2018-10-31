import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	String url = "C:\\Users\\Akhil Radhakrishnan\\Desktop\\chromedriver_win32\\chromedriver.exe";
  @Test
  public void fM() {
	  
	System.out.println("You are in 1st method");  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil Radhakrishnan\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	
	
	String expectedTitle = "Login | Salesforce";
	String actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.close();
  }
  
  
}

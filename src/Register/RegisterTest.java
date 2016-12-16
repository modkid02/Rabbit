package Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegisterTest {
  @Test
  public void NameValidation() {
	  String dir = System.getProperty("user.dir");
	  System.setProperty("webdriver.gecko.driver", dir + "\\lib\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  System.out.println(driver.getTitle());
  }
}

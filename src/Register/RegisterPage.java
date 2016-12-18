package Register;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage{
	private static WebElement element = null;
	
	public static WebElement tbx_Firstname(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[2]/td/input"));
		return element;
	}
	public static WebElement tbx_Lastname(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[3]/td/input"));
		return element;
	}
	public static WebElement tbx_Phone(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[4]/td/input"));
		return element;
	}
	public static WebElement tbx_Email(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[5]/td/input"));
		return element;
	}
	public static WebElement tbx_Address(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[7]/td/input"));
		return element;
	}
	public static WebElement tbx_Address2(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[8]/td/input"));
		return element;
	}
	public static WebElement tbx_City(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[9]/td/input"));
		return element;
	}
	public static WebElement tbx_State(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[10]/td/input"));
		return element;
	}
	public static WebElement tbx_PostalCode(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[11]/td/input"));
		return element;
	}
	public static Select ddl_Country(WebDriver driver){
		Select droplist = new Select(driver.findElement(By.xpath(".//tr[12]/td[2]/select")));
		//element = driver.findElement(By.xpath(".//tr[12]/td[2]/select"));
		return droplist;
	}
	public static WebElement tbx_Username(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[14]/td/input"));
		return element;
	}
	public static WebElement tbx_Password(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[15]/td/input"));
		return element;
	}
	public static WebElement tbx_ConPassword(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[16]/td/input"));
		return element;
	}
	public static WebElement btn_Submit(WebDriver driver){
		element = driver.findElement(By.xpath(".//tr[18]/td/input"));
		return element;
	}
	
	public static void enterFirstname(WebDriver driver, String firstname){
		tbx_Firstname(driver).clear();
		tbx_Firstname(driver).sendKeys(firstname);
	}
	public static void enterLastname(WebDriver driver, String lastname){
		tbx_Lastname(driver).clear();
		tbx_Lastname(driver).sendKeys(lastname);
	}
	public static void enterPhone(WebDriver driver, String phone){
		tbx_Phone(driver).clear();
		tbx_Phone(driver).sendKeys(phone);
	}
	public static void enterEmail(WebDriver driver, String email){
		tbx_Email(driver).clear();
		tbx_Email(driver).sendKeys(email);
	}
	public static void enterAddress(WebDriver driver, String address){
		tbx_Address(driver).clear();
		tbx_Address(driver).sendKeys(address);
	}
	public static void enterAddress2(WebDriver driver, String address2){
		tbx_Address2(driver).clear();
		tbx_Address2(driver).sendKeys(address2);
	}
	public static void enterCity(WebDriver driver, String city){
		tbx_City(driver).clear();
		tbx_City(driver).sendKeys(city);
	}
	public static void enterState(WebDriver driver, String state){
		tbx_State(driver).clear();
		tbx_State(driver).sendKeys(state);
	}
	public static void enterPostalCode(WebDriver driver, String postal){
		tbx_PostalCode(driver).clear();
		tbx_PostalCode(driver).sendKeys(postal);
	}
	public static void enterCountry(WebDriver driver, String country){
		ddl_Country(driver).selectByVisibleText(country);
	}
	public static void enterUsername(WebDriver driver, String username){
		tbx_Username(driver).clear();
		tbx_Username(driver).sendKeys(username);
	}
	public static void enterPassword(WebDriver driver, String password){
		tbx_Password(driver).clear();
		tbx_Password(driver).sendKeys(password);
	}
	public static void enterConfirmPassword(WebDriver driver, String password){
		tbx_ConPassword(driver).clear();
		tbx_ConPassword(driver).sendKeys(password);
	}
	public static void SubmitForm(WebDriver driver){
		btn_Submit(driver).click();
	}
	public static String getCurrentValue(WebDriver driver){
		return ddl_Country(driver).getFirstSelectedOption().getText().toString();
	}
}

package Register;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Register.RegisterPage;

public class RegisterTest {
	private static WebDriver driver = null;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	@Test
	public void FirstNameRequire() {
		initTesting();
		try{
			//RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[2]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void LastNameRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			//RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[3]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PhoneRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			//RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[4]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void EmailRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			//RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void AddressRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
//			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[7]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void Address2Require() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
//			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertEquals(driver.getCurrentUrl().substring(0, 54).toString(), "http://newtours.demoaut.com/create_account_success.php");
			Reporter.log("Pass: Address2 is not require");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Address2 is require");
		    Assert.fail("Fail: Address2 is require");
		}
		driver.quit();
	}
	@Test
	public void CityRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
//			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[9]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void StateRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
//			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[10]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PostalCodeRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
//			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[11]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void UsernameRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
//			RegisterPage.enterUsername(driver, "username");
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[14]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PasswordRequire() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"firstname");
			RegisterPage.enterLastname(driver, "lastname");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "address");
			RegisterPage.enterAddress2(driver, "address2");
			RegisterPage.enterCity(driver, "City");
			RegisterPage.enterState(driver, "State");
			RegisterPage.enterPostalCode(driver, "10000");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username" + dateFormat.format(date));
//			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: Require field message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Require field message doesn't show");
		    Assert.fail("Fail: Require field message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void CountryDefaultValue() {
		initTesting();
		try{
			Assert.assertEquals(RegisterPage.getCurrentValue(driver), "UNITED STATES");
			Reporter.log("Pass: Correct default value");
		}
		catch(AssertionError e){
			driver.quit();
			Reporter.log("Fail: Wrong default value");
		    Assert.fail("Fail: Wrong default value");
		}
		driver.quit();
	}
	@Test
	public void FirstnameExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"1234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[2]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void LastnameExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterLastname(driver, "1234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[3]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PhoneExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterPhone(driver, "01234567891");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[4]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void EmailExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "012345678901234567890123456789012345678901@mail.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void AddressExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterAddress(driver, "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[7]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void Address2ExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterAddress2(driver, "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[8]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void CityExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterCity(driver, "1234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[9]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void StateExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterState(driver, "1234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[10]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PostalCodeExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterPostalCode(driver, "12345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[11]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void UsernameExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterUsername(driver, "1234567890123456789012345678901");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[14]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PasswordExceedMaxlength() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "testtesttt1234567");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: Max length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length error message doesn't show");
		    Assert.fail("Fail: Max length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void PasswordLowerThanMinlength() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "test123");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: Min length error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Min length error message doesn't show");
		    Assert.fail("Fail: Min length error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void FieldMaxlength() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"123456789012345678901234567890");
			RegisterPage.enterLastname(driver, "123456789012345678901234567890");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "01234567890123456789012345678901234567890@mail.com");
			RegisterPage.enterAddress(driver, "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			RegisterPage.enterAddress2(driver, "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
			RegisterPage.enterCity(driver, "123456789012345678901234567890");
			RegisterPage.enterState(driver, "123456789012345678901234567890");
			RegisterPage.enterPostalCode(driver, "0123456789");
			RegisterPage.enterCountry(driver, "ANDORRA");
			Date date = new Date();
			RegisterPage.enterUsername(driver, "username123" + dateFormat.format(date));
			RegisterPage.enterPassword(driver, "pass1234pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(2000);
			Assert.assertEquals(driver.getCurrentUrl().substring(0, 54).toString(), "http://newtours.demoaut.com/create_account_success.php");
			Reporter.log("Pass: Max length data can submit to system");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Max length data can not submit to system");
		    Assert.fail("Fail: Max length data can not submit to system");
		}
		driver.quit();
	}
	@Test
	public void FieldMinlength() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass1234");
			Thread.sleep(2000);
			Assert.assertFalse(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: No error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Error message show");
		    Assert.fail("Fail: Error message show");
		}
		driver.quit();
	}
	@Test
	public void FieldMiddlelength() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass123456");
			Thread.sleep(2000);
			Assert.assertFalse(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: No error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Error message show");
		    Assert.fail("Fail: Error message show");
		}
		driver.quit();
	}
	@Test
	public void SpecialCharacterInput() {
		initTesting();
		try{
			RegisterPage.enterFirstname(driver,"!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterLastname(driver, "!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterPhone(driver, "0123456789");
			RegisterPage.enterEmail(driver, "test@mail.com");
			RegisterPage.enterAddress(driver, "!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterAddress2(driver, "!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterCity(driver, "!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterState(driver, "!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterPostalCode(driver, "0123456789");
			RegisterPage.enterCountry(driver, "ANDORRA");
			RegisterPage.enterUsername(driver, "!@#$%^&*()_+-=[]{};':\",.<>/?\\|");
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			RegisterPage.SubmitForm(driver);
			Thread.sleep(5000);
			Assert.assertEquals(driver.getCurrentUrl().substring(0, 54).toString(), "http://newtours.demoaut.com/create_account_success.php");
			Reporter.log("Pass: Special character can submit to system");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Special character can not submit to system");
		    Assert.fail("Fail: Special character can not submit to system");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat1() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "testemail.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat2() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "test@email");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat3() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "test@mail..com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat4() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "@email.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat5() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "Test @email.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat6() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "Test@.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat7() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "Test@email.");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat8() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "T$e's\"t@email.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongEmailFormat9() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "Test@mail@email.com");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: Wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message doesn't show");
		    Assert.fail("Fail: Wrong email format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void CorrectEmailFormat() {
		initTesting();
		try{
			RegisterPage.enterEmail(driver, "T_e-s.t@email.co.org.th");
			Thread.sleep(2000);
			Assert.assertFalse(isElementDisplayByXpath(".//tr[5]/td/label"));
			Reporter.log("Pass: No wrong email format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong email format error message show");
		    Assert.fail("Fail: Wrong email format error message show");
		}
		driver.quit();
	}
	@Test
	public void WrongPasswordFormat1() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "Password");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: Wrong password format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong password format error message doesn't show");
		    Assert.fail("Fail: Wrong password format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongPasswordFormat2() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "12345678");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: Wrong password format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong password format error message doesn't show");
		    Assert.fail("Fail: Wrong password format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongPasswordFormat3() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "!@#$test");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: Wrong password format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong password format error message doesn't show");
		    Assert.fail("Fail: Wrong password format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void CorrectPasswordFormat() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass1234!@#");
			Thread.sleep(2000);
			Assert.assertFalse(isElementDisplayByXpath(".//tr[15]/td/label"));
			Reporter.log("Pass: No password format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong password format error message show");
		    Assert.fail("Fail: Wrong password format error message show");
		}
		driver.quit();
	}
	@Test
	public void WrongConfirmPassword1() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "testtest");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[16]/td/label"));
			Reporter.log("Pass: Wrong confirm password error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong confirm password error message doesn't show");
		    Assert.fail("Fail: Wrong confirm password error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongConfirmPassword2() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[16]/td/label"));
			Reporter.log("Pass: Wrong confirm password error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong confirm password error message doesn't show");
		    Assert.fail("Fail: Wrong confirm password error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void WrongConfirmPassword3() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "Pass1234");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[16]/td/label"));
			Reporter.log("Pass: Wrong confirm password error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong confirm password error message doesn't show");
		    Assert.fail("Fail: Wrong confirm password error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void CorrectConfirmPassword() {
		initTesting();
		try{
			RegisterPage.enterPassword(driver, "pass1234");
			RegisterPage.enterConfirmPassword(driver, "pass1234");
			Thread.sleep(2000);
			Assert.assertFalse(isElementDisplayByXpath(".//tr[16]/td/label"));
			Reporter.log("Pass: No wrong confirm password error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong confirm password error message show");
		    Assert.fail("Fail: Wrong confirm password error message show");
		}
		driver.quit();
	}
	@Test
	public void WrongPhoneFormat() {
		initTesting();
		try{
			RegisterPage.enterPhone(driver, "test!@#$%^");
			Thread.sleep(2000);
			Assert.assertTrue(isElementDisplayByXpath(".//tr[4]/td/label"));
			Reporter.log("Pass: Wrong phone format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong phone format error message doesn't show");
		    Assert.fail("Fail: Wrong phone format error message doesn't show");
		}
		driver.quit();
	}
	@Test
	public void CorrectPhoneFormat() {
		initTesting();
		try{
			RegisterPage.enterPhone(driver, "1234567890");
			Thread.sleep(2000);
			Assert.assertFalse(isElementDisplayByXpath(".//tr[4]/td/label"));
			Reporter.log("Pass: No wrong phone format error message show");
		}
		catch(AssertionError | InterruptedException e){
			driver.quit();
			Reporter.log("Fail: Wrong phone format error message show");
		    Assert.fail("Fail: Wrong phone format error message show");
		}
		driver.quit();
	}
	private static boolean isElementDisplayByXpath(String path){
		try{
			driver.findElement(By.xpath(path)).isDisplayed();
			return true;
		}
		catch(NoSuchElementException e){
			return false;
		}
	}
	private static void initTesting(){
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", dir + "\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	}
}
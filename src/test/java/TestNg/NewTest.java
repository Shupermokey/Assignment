package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HtmlPackage.HtmlForm;
import junit.framework.Assert;

public class NewTest {
	
	WebDriver wd;
	HtmlForm gm;

	
	@BeforeTest
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asobiera\\Downloads\\chromedriver.exe");
    	wd = new ChromeDriver();
    	gm = new HtmlForm(wd);
    	wd.get("C:\\Users\\asobiera\\Documents\\workspace-sts-3.9.9.RELEASE\\HTMLFORM\\src\\main\\resource\\static\\VehicleRegistrationForm.html");
        
	}
	
	
  @Test(priority=1)
  public void checkTitle() {
	  String titleOfPage = wd.getTitle();
	  Assert.assertTrue(titleOfPage.equals("Welcome to VehicleRegistration")); 
  }
  
  @Test(priority=2)
  public void checkTitleAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Select title from the list");
	  gm.acceptAlert();
  }
  @Test(priority=3)
  public void changeTitle() throws InterruptedException {
	  gm.Title().selectByVisibleText("Mr."); 
  }
  @Test(priority=4)
  public void checkeOwnerNameAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Owner Name should not be empty and must contain alphabets with in the range of 5 to 20");
	  gm.acceptAlert();
  }
  @Test(priority=5)
  public void changeOwnerName() throws InterruptedException {
	  gm.OwnerName().sendKeys("abcdefg");
  }
  @Test(priority=6)
  public void checkeGenderAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Please Select gender");
	  gm.acceptAlert();
  }
  
  @Test(priority=7)
  public void changeGender() {
		 gm.Gender().click();
	 }
  
  @Test(priority=8)
  public void checkeAddressAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "address should not be empty and must be alphanumeric with in the range of 5 to 20");
	  gm.acceptAlert();
  }
  @Test(priority=9)
  public void changeAddress() {
	  gm.Address().sendKeys("abcdefg");
	 }
  
  @Test(priority=10)
  public void checkeCityAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "city should not be empty and must have alphabet characters only");
	  gm.acceptAlert();
  }
  @Test(priority=11)
  public void changeCity() {
	  gm.City().sendKeys("abcdefg");
	 }
  @Test(priority=12)
  public void checkeStateAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "State should not be empty and must have alphabet characters only");
	  gm.acceptAlert();
  }
  @Test(priority=13)
  public void changeState() {
	  gm.State().sendKeys("abcdefg");
	 }
  @Test(priority=14)
  public void checkeCountryAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Select the country from the list");
	  gm.acceptAlert();
  }
  @Test(priority=15)
  public void changeCountry() {
	  gm.Country().selectByIndex(1);
	 }
  @Test(priority=16)
  public void checkeZipAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "ZIP code should not be empty and must have 6 numeric characters only");
	  gm.acceptAlert();
  }
  @Test(priority=17)
  public void changeZip() {
	  gm.ZIP().sendKeys("123445");
	 }
  @Test(priority=18)
  public void checkeVehicalAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Please Select Vehicle type");
	  gm.acceptAlert();
  }
  @Test(priority=19)
  public void changeVehical() {
	  gm.Vehicle_Type().click();
	 }
  @Test(priority=20)
  public void checkeFuelAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Please Select fuel type");
	  gm.acceptAlert();
  }
  @Test(priority=21)
  public void changeFuel() {
	  gm.Fuel_Type().click();
	 }
  @Test(priority=22)
  public void checkeMFGAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "Select mfg year from the list");
	  gm.acceptAlert();
  }
  @Test(priority=23)
  public void changeMFG() {
	  gm.Year_Mfg().selectByVisibleText("2015");
	 }
  
  @Test(priority=24)
  public void checkeSuccessAlert() throws InterruptedException {
	  gm.Submit().click();
	  Assert.assertEquals(wd.switchTo().alert().getText(), "You are Succesfully registered your vehicle");
	  gm.acceptAlert();
  }
  
  @AfterTest
  public void afterTests() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.close();
  }
}

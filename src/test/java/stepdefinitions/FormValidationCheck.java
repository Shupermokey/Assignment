//package stepdefinitions; 
//
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import HtmlPackage.HtmlForm;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class FormValidationCheck {
//	
//	WebDriver wd;
//	HtmlForm gm;
//
//	
//	
//	 @Given("^The user opened the file in a browser$")
//	    public void open_file() throws Throwable {
//	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asobiera\\Downloads\\chromedriver.exe");
//	    	wd = new ChromeDriver();
//	    	gm = new HtmlForm(wd);
//	    	wd.get("C:\\Users\\asobiera\\Documents\\workspace-sts-3.9.9.RELEASE\\HTMLFORM\\src\\main\\resource\\static\\VehicleRegistrationForm.html");
//	        
//	    }
//	 
//	 @Then("^Verify the title$") 
//	 public void check_title() throws Throwable{
//			 String titleOfPage = wd.getTitle();
//			// Assert.assertTrue(titleOfPage.equals("Welcome to VehicleRegistration")); 
//	 }
//	 @When("^No data is entered$")
//	 public void no_title_data_entered() {
//		
//	 }
//	 @And("^Submit is clicked$")
//	 public void click_submit_with_no_title(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for title$")
//	 public void check_title_alert() throws Throwable{
//		 gm.acceptAlert();
//		 
//	 }
//	 @When("^Title form has correct data$")
//	 public void change_title() throws Throwable{
//		 gm.Title().selectByVisibleText("Mr."); 
//		  
//	 }
//	 @Then("^Click submit with no ownername$")
//	 public void click_submit_with_no_owndername(){
//		 gm.Submit().click();
//		 
//	 }
//	 @And("^Close ownername alert$")
//	 public void close_owndername_alert() throws InterruptedException{
//		 gm.acceptAlert();
//	 }
//	 @Then("^Enter valid ownername$")
//	 public void change_owner() throws Throwable{
//		 gm.OwnerName().sendKeys("abcdefg");
//	 }
//	 
//	 @And("^Click submit with ownername$")
//	 public void click_submit_with_ownername(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for gender$")
//		 public void click_alert_for_gender() throws InterruptedException {
//		 gm.acceptAlert();
//		 }
//	 
//	 @When("^Valid gender is clicked$")
//	 public void valid_gender_clicked() {
//		 gm.Gender().click();
//	 }
//	 
//	 @And("^Submit is clicked with valid gender$")
//	 public void submit_with_valid_gender(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for Address$")
//	 public void close_alert_for_address() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 
//	 
//	 @When("^Valid address is entered$")
//	 public void valid_address_entered() {
//		 gm.Address().sendKeys("abcdefg");
//	 }
//	 
//	 @And("^Submit is clicked with valid address$")
//	 public void submit_with_valid_address(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for City$")
//	 public void close_alert_for_city() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 
//	 @When("^Valid city is entered$")
//	 public void valid_city_entered() {
//		 gm.City().sendKeys("abcdefg");
//	 }
//	 
//	 @And("^Submit is clicked with valid City$")
//	 public void submit_with_valid_city(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for state$")
//	 public void close_alert_for_state() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 
//	 @When("^Valid state is entered$")
//	 public void valid_state_entered() {
//		 gm.State().sendKeys("abcdefg");
//	 }
//	 
//	 @And("^Submit is clicked with valid state$")
//	 public void submit_with_valid_state(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for country$")
//	 public void close_alert_for_country() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 @When("^Valid country is clicked$")
//	 public void valid_country_clicked() {
//		 gm.Country().selectByIndex(1);
//	 }
//	
//	 @And("^Submit is clicked with valid country$")
//	 public void submit_with_valid_country(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for zip$")
//	 public void close_alert_for_zip() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 @When("^Valid zip is entered$")
//	 public void valid_zip_entered() {
//		 gm.ZIP().sendKeys("123456");
//	 }
//	 
//	 @And("^Submit is clicked with valid ZIP$")
//	 public void submit_with_valid_zip(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for VehicalType$")
//	 public void close_alert_for_vehicalTypes() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 
//	 @When("^Valid vehicalType is clicked$")
//	 public void valid_vehical_clicked() {
//		 gm.Vehicle_Type().click();
//	 }
//	 
//	 @And("^Submit is clicked with valid Vehical$")
//	 public void submit_with_valid_vehicalTypes(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for fuelTypes$")
//	 public void close_alert_for_fuelTypes() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 
//	 @When("^Valid fuelType is clicked$")
//	 public void valid_fuel_clicked() {
//		 gm.Fuel_Type().click();
//	 }
//	 
//	 @And("^Submit is clicked with valid fuel$")
//	 public void submit_with_valid_fuelTypes(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for MFG$")
//	 public void close_alert_for_mfgTypes() throws InterruptedException {
//		 gm.acceptAlert();
//	 }
//	 
//	 @When("^Valid mfg is clicked$")
//	 public void valid_mfg_clicked() {
//		 gm.Year_Mfg().selectByVisibleText("2015");
//	 }
//	 
//	 @And("^Submit is clicked with valid mfg$")
//	 public void submit_with_valid_mfg(){
//		 gm.Submit().click();
//	 }
//	 
//	 @Then("^Close alert for Success$")
//	 public void close_alert_for_sucess() throws InterruptedException {
//		 Thread.sleep(2000);
//		 gm.acceptAlert();
//	 }
//	
//}
 
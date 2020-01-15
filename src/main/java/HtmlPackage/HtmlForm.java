package HtmlPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HtmlForm {
	
	
	WebDriver driver;
	public HtmlForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

		@FindBy(name="submit")
		WebElement submit;
		
		@FindBy(name="title")
		WebElement title;
		
		@FindBy(name="ownername")
		WebElement ownername;
		
		@FindBy(name="gender")
		WebElement gender;
		
		@FindBy(name="address")
		WebElement address;
		
		@FindBy(name="city")
		WebElement city;
		
		@FindBy(name="state")
		WebElement state;
		
		@FindBy(name="country")
		WebElement country;
		
		@FindBy(name="zip")
		WebElement zip;
		
		@FindBy(name="vehicletype")
		WebElement vehicletype;
		
		@FindBy(name="fueltype")
		WebElement fueltype;
		
		@FindBy(name="mfg")
		WebElement mfg;
		
		
		public WebElement Submit() {
			return submit;
		}
		
		public Select Title() {
			return new Select(title);
		}
		
		public WebElement OwnerName() {
			return ownername;
		}
		
		public WebElement Gender() {
			return gender;
		}
		
		public WebElement Address() {
			return address;
		}
		
		public WebElement City() {
			return city;
		}
		public WebElement State() {
			return state;
		}
		public Select Country() {
			return new Select(country);
		}
		public WebElement ZIP() {
			return zip;
		}
		public WebElement Vehicle_Type() {
			return vehicletype;
		}
		public WebElement Fuel_Type() {
			return fueltype;
		}
		public Select Year_Mfg() {
			return new Select(mfg);
		}
		
		
		public void acceptAlert() throws InterruptedException {
			driver.switchTo().alert().accept();
		}
}

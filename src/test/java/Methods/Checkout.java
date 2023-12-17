package Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Repository.App_POM;
import utils.LibDriver;

public class Checkout {
	WebDriver driver;
	public String checkoutPage(){
		this.driver = LibDriver.driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.txt_checkout));
		String msg = driver.findElement(App_POM.txt_checkout).getText();
		return msg;
	}
	public boolean online_payment() {
		this.driver = LibDriver.driver;
		Boolean ele = driver.findElement(App_POM.radio_online_payment).isEnabled();
		System.out.println("the selction of online payment is : "+ele);
		return ele;
		
	}
	public void cash_payment() {
		this.driver = LibDriver.driver;
		driver.findElement(App_POM.radio_cash).click();
	}
	
	public boolean agreeCheck() {
		this.driver = LibDriver.driver;
		Boolean ele = driver.findElement(App_POM.chkbox_agree).isSelected();
		return ele;
	}
	public void checkoutDetails() {
		this.driver = LibDriver.driver;
		driver.findElement(App_POM.chkout_name).sendKeys("Nikitha");
		driver.findElement(App_POM.chkout_mobile).sendKeys("9845098450");
		driver.findElement(App_POM.chkout_email).sendKeys("nikiumesh24@gmail.com");
		driver.findElement(App_POM.chkout_lnk_apply).click();
	}
}

package Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Repository.App_POM;
import utils.LibDriver;

public class Giftcard_Popup {
	WebDriver driver;
	public String GiftCardPage(){
		this.driver = LibDriver.driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.txt_applyGift));
		String msg = driver.findElement(App_POM.txt_applyGift).getText();
		return msg;
	}
	public String couponEntry(){
		this.driver = LibDriver.driver;
		
		driver.findElement(App_POM.tab_coupon).click();
		driver.findElement(App_POM.txt_coupon).sendKeys("12345");
		driver.findElement(App_POM.btn_couponApply).click();
		String actErrorMsg = driver.findElement(App_POM.txt_invalidCoupon).getText();
		return actErrorMsg;
	}
	public void closePopUp(){
		this.driver = LibDriver.driver;
		
		driver.findElement(App_POM.lnk_closePopUp).click();
	}
	

}

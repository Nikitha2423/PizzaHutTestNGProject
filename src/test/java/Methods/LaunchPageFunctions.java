package Methods;




import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Repository.App_POM;

import utils.LibDriver;

public class LaunchPageFunctions extends LibDriver{
	
	WebDriver driver;
	public String Launchapp(String URL) {
		this.driver = LibDriver.driver;
		driver.get(URL);
		driver.manage().deleteAllCookies();
		String launchStatus = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.btn_location));
		} catch (Exception e) {	
			launchStatus = "Fail";
		}
		
		
		return launchStatus;
		
		
	}
	
		public boolean blackPopUpCheck() {
		this.driver = LibDriver.driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.txt_sorry));
				return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
		public void blackPopUpClose() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.txt_sorry));
			driver.findElement(App_POM.link_close).click();
			
			
		}
		public String Location(String Location) throws InterruptedException {
			this.driver = LibDriver.driver;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.txt_location));
			driver.findElement(App_POM.txt_location).sendKeys(Location);
			driver.findElement(App_POM.txt_location).sendKeys(Keys.BACK_SPACE);
			
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
			wait2.until(ExpectedConditions.visibilityOfElementLocated(App_POM.select_location));
			driver.findElement(App_POM.txt_location).sendKeys(Keys.ENTER);
			String actLocation = driver.findElement(App_POM.select_location).getText();
			System.out.println(actLocation);
			
			return actLocation;
			}
}



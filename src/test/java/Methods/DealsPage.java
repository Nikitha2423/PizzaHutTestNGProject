package Methods;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Repository.App_POM;
import utils.LibDriver;

public class DealsPage {
	WebDriver driver;
	public void DetailsPage(){
		this.driver = LibDriver.driver;	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.tab_Deals));
		} catch (Exception e) {	
			
		}
		
		String URL = driver.getCurrentUrl();
		boolean extResult = true;
		
		boolean actResult = URL.endsWith("deals/");
		if (extResult==actResult) {
			System.out.println("deals on the URL pass");
		}
		else {
			System.out.println("deals on the URL fail");
		}		
	}
	
	public void selectSides() {
		this.driver = LibDriver.driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.tab_sides));
		} catch (Exception e) {	
			
		}
		driver.findElement(App_POM.tab_sides).click();			
				
	}
	public void addSide() {
		this.driver = LibDriver.driver;
		driver.findElement(App_POM.select_sides).click();				
	}

	public void basketCheck() {
		this.driver = LibDriver.driver;
		String basketItem = driver.findElement(App_POM.basket_item).getText();
	//	String trim_basketItem = basketItem.trim();
		//driver.findElement(App_POM.cart_img).click();
		
//		String cartItem = driver.findElement(App_POM.cart_imgText).getText();
//		String trim_cartItem = cartItem.trim();
//		
//		System.out.println("basket item text = "+basketItem +"cart item text = "+cartItem);
//		
//		if(trim_basketItem==trim_cartItem) {
//			System.out.println("item verified in basket successfully");
//		}
//		else {
//			System.out.println("incorrect item added");
//		}
	}
	
	public void selectDrinks() {
		this.driver = LibDriver.driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(App_POM.tab_drinks));
		} catch (Exception e) {	
			
		}
		driver.findElement(App_POM.tab_drinks).click();			
				
	}
	public void addDrinks() {
		this.driver = LibDriver.driver;
		driver.findElement(App_POM.select_drinks_mirinda).click();	
		driver.findElement(App_POM.select_drinks_7up).click();	
	}
	
	public void checkout() {
		this.driver = LibDriver.driver;
		driver.findElement(App_POM.btn_checkout).click();	
	}
	
	public String basketPage() {
		this.driver = LibDriver.driver;
		String actPageText = driver.findElement(App_POM.txt_basketPage).getText();
		return actPageText;
	}
}

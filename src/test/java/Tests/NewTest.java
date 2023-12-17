package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import Listeners.MyListener;
import Methods.Checkout;
import Methods.DealsPage;
import Methods.Giftcard_Popup;
import Methods.LaunchPageFunctions;
import Repository.LibExcel;
import utils.LibDriver;

@Listeners(MyListener.class)

public class NewTest extends LibDriver {
  LaunchPageFunctions functions = new LaunchPageFunctions();
  DealsPage dealFunctions = new DealsPage();
  Checkout checkoutFunctions = new Checkout();
  Giftcard_Popup giftcardFunctions = new Giftcard_Popup();
  LibExcel exl = new LibExcel();
  
  @Test(priority=1)
  public void LaunchURL() {
	 
	  String pageLaunched = functions.Launchapp(LibExcel.getURL());
	  Assert.assertEquals("Pass", pageLaunched);	  
  }
  
  @Test(priority=2)
  public void blackScreenCheck() {
	  boolean exp_status = true;
	  boolean act_status = functions.blackPopUpCheck();
	  Assert.assertEquals(exp_status,act_status);	  
  }
  
  @Test(priority=2 , dependsOnMethods = { "blackScreenCheck" } )
  public void CloseBlackScreen() {
	  	functions.blackPopUpClose();
		
  }
  @Test(priority=3)
  public void Location() throws InterruptedException {
	  	String actLocation = functions.Location("Lulu mall Hyderabad");
	  	String expLocation = "ROAD NUMBER 3";
	  	Assert.assertEquals(actLocation, expLocation);
	  
  }
  @Test(priority=4)
  public void verifyURLDeals(){
	  dealFunctions.DetailsPage();
  }
  @Test(priority=5)
  public void selectSidesTab(){
	  dealFunctions.selectSides();
	  dealFunctions.addSide();
  }
  //@Test(priority=6)
  public void basketVerify(){
	  dealFunctions.basketCheck();  
  }
  @Test(priority=7)
  public void selectDrinksTab(){
	  dealFunctions.selectDrinks();
	  dealFunctions.addDrinks();
	  dealFunctions.checkout();
  }
  @Test(priority=8)
  public void checkout(){
	String Actualmsg = checkoutFunctions.checkoutPage();
	String ExpectMsg = "Secure Checkout";
	Assert.assertEquals(Actualmsg,ExpectMsg);	
  }
  
  @Test(priority=9)
  public void onlinePayment(){
	boolean selected = true;
	boolean result = checkoutFunctions.online_payment();
	Assert.assertEquals(selected,result);
  }
  
  @Test(priority=10)
  public void cashPayment(){
	checkoutFunctions.cash_payment();
  }

  @Test(priority=11)
  public void agreeCheck(){
	boolean selected = true;
	boolean result = checkoutFunctions.agreeCheck();
	Assert.assertEquals(selected,result);
  }
  @Test(priority=12)
  public void checkoutDetails(){
	  checkoutFunctions.checkoutDetails();
  }
	
  @Test(priority=13)
  public void GiftcardPopUp(){
	String Actualmsg = giftcardFunctions.GiftCardPage();
	String ExpectMsg = "Apply a Gift Card";
	Assert.assertEquals(Actualmsg,ExpectMsg);	
  }
  @Test(priority=14)
  public void Voucher(){
	String Actualmsg = giftcardFunctions.couponEntry();
	String ExpectMsg = "Sorry, we don’t currently support that coupon code.";
	Assert.assertEquals(Actualmsg,ExpectMsg);	
  }
  @Test(priority=15)
  public void closePopUp(){
	  giftcardFunctions.closePopUp();
  }
  
  @Test(priority=16)
  public void verifyBasketPage(){
	  String Actualmsg = dealFunctions.basketPage();
	  String ExpectMsg = "Your Basket";
	  Assert.assertEquals(Actualmsg,ExpectMsg);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
			getDriver();
			
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }
}

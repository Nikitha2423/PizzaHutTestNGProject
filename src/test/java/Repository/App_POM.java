package Repository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class App_POM {
	
	WebDriver driver;

	public static final  By btn_location = By.xpath("//div[text()='Find my current location']");
	public static final  By txt_sorry = By.xpath("//span[contains(text(),'Sorry')]");
	public static final  By link_close = By.xpath("//div[@class='ReactModal__Overlay ReactModal__Overlay--after-open']");
	
	public static final  By txt_location = By.xpath("//input[@placeholder='Enter your location for delivery']");
	public static final  By select_location = By.xpath("//span[@class='semi-bold uppercase']");
	public static final  By tab_Deals= By.xpath("//a[@data-synth='link--deals--side']//span[contains(text(),'Deals')]");
	
	public static final  By tab_sides = By.xpath("//a[contains(@class,'capitalize lg:border-r')]//span[contains(text(),'Sides')]");
	public static final  By select_sides = By.xpath("//button[@data-synth='button--exotica-veggie-garlic-bread-single--one-tap']");
	public static final  By cart_img = By.xpath("//img[contains(@title,'Exotica Veggie Garlic Bread')]");
	public static final  By cart_imgText = By.xpath("//h2[normalize-space()='Exotica Veggie Garlic Bread']");
	
	public static final  By basket_item = By.xpath("//div[contains(@class,'leading-tight typography-4 basket-item-product-title leading-tight mb-5 flex-1 mr-5 font-bold text-black')]");
	
	public static final  By tab_drinks = By.xpath("//a[@data-synth='link--drinks--side']//span[contains(text(),'Drinks')]");
	public static final  By select_drinks_mirinda = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/span[1]/div[1]/a[3]/div[3]/div[1]/button[1]");
	public static final  By select_drinks_7up = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/span[1]/div[1]/a[4]/div[3]/div[1]/button[1]/span[1]/span[1]");

	public static final  By btn_checkout = By.xpath("//span[contains(text(),'Checkout')]");
	public static final  By txt_checkout = By.xpath("//span[contains(text(),'Secure Checkout')]");
	
	public static final  By radio_online_payment = By.xpath("//label[@for='payment-method--razorpay']//i[@class='mt-4']");
	public static final  By radio_cash = By.xpath("//body/div[@id='app']/div[@class='app en-IN app-bg']/div[@class='order']/div[@class='checkout-container']/form[@id='checkout-form']/div[@class='form-section']/div[@class='mt-20']/label[@for='payment-method--cash']/i[1]");
	public static final  By chkbox_agree = By.xpath("//input[@id='marketingOptIn']");
	public static final  By chkout_name = By.xpath("//input[@id='checkout__name']");
	public static final  By chkout_mobile = By.xpath("//input[@id='checkout__phone']");
	public static final  By chkout_email = By.xpath("//input[@id='checkout__email']");
	public static final  By chkout_lnk_apply = By.xpath("//span[normalize-space()='Apply Gift Card']");
	
	public static final  By txt_applyGift = By.xpath("//span[normalize-space()='Apply a Gift Card']");
	public static final  By tab_coupon = By.xpath("//span[normalize-space()='Coupon']");
	public static final  By txt_coupon = By.xpath("//input[@placeholder='e.g. ABC1234']");
	public static final  By btn_couponApply = By.xpath("//span[normalize-space()='Apply']");
	public static final  By txt_invalidCoupon = By.xpath("//span[contains(text(),'Sorry, we don’t currently support that coupon code')]");
	public static final  By lnk_closePopUp = By.xpath("//button[@class='icon-remove-3 absolute top-0 right-0 mr-20 mt-20']");
	
	public static final  By txt_basketPage = By.xpath("//span[normalize-space()='Your Basket']");

}


	
		
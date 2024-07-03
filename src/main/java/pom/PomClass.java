package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//button[text()='ORDER ONLINE NOW']")
	private WebElement orderonline;
	
	
	@FindBy(xpath = "//input[@placeholder='Enter your delivery address']")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Area / Locality']")
	private WebElement delivery;
	
	@FindBy(xpath = "//button[@id='optInText']")
	private WebElement popup;
	
	@FindBy(xpath = "(//button[@class='btn--grn'])[1]")
	private WebElement locateme;
	
	@FindBy(xpath = "//span[text()='VEG PIZZA']")
	private WebElement vegpizz;
	
	@FindBy(xpath = "(//span[text()='Margherita'])[2]")
	private WebElement marghettia;
	
	@FindBy(xpath = "(//button[@data-label='addTocart'])[24]")
	private WebElement addmarghetia;
	
	@FindBy(xpath = "//span[text()='NO THANKS']")
	private WebElement nothanks;
	
	@FindBy(xpath = "(//button[@data-label='addTocart'])[23]")
	private WebElement gourmetpizza;
	
	@FindBy(xpath = "(//button[@data-label='addTocart'])[22]")
	private WebElement peppypanner;
	
	@FindBy(xpath = "//span[text()='BEVERAGES']")
	private WebElement beverage;
	
	@FindBy(xpath = "(//button[@data-label='addTocart'])[49]")
	private WebElement pepsi;
	
	
	@FindBy(xpath = "(//div[@data-label='increase'])[1]")
	private WebElement plusmargeta;
	
	@FindBy(xpath = "(//div[@data-label='increase'])[2]")
	private WebElement plusgourmetpiza;
	
	@FindBy(xpath = "(//div[@data-label='increase'])[3]")
	private WebElement pluspanner;
	
	@FindBy(xpath = "(//div[@data-label='increase'])[4]")
	private WebElement pluspepsi;
	
	@FindBy(xpath = "//span[text()='Price Details']")
	private WebElement scrolldown;
	
	@FindBy(xpath = "//span[@class='hdng']")
	private WebElement scrollup;
	
	@FindBy(xpath = "(//div[@data-label='decrease'])[1]")
	private WebElement removemarghettia;
	
	@FindBy(xpath = "(//div[@data-label='decrease'])[2]")
	private WebElement removegaurmetpizza;
	
	@FindBy(xpath = "(//div[@data-label='decrease'])[3]")
	private WebElement removepanner;

	@FindBy(xpath="(//div[@data-label='decrease'])[4]")
	private WebElement removepepsi;
	
	@FindBy(xpath = "(//button[@class='btn--grn'])[1]")
	private WebElement yes;


	
	public WebElement getYes() {
		return yes;
	}

	public WebElement getRemovegaurmetpizza() {
		return removegaurmetpizza;
	}

	public WebElement getRemovepanner() {
		return removepanner;
	}

	public WebElement getScrollup() {
		return scrollup;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getPluspepsi() {
		return pluspepsi;
	}

	@FindBy(xpath = "//button[@data-label='miniCartCheckout']")
	private WebElement checkout;
		
	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getPlusgourmetpiza() {
		return plusgourmetpiza;
	}

	public WebElement getPluspanner() {
		return pluspanner;
	}

	public WebElement getPlusmargeta() {
		return plusmargeta;
	}

	public WebElement getRemovemarghettia() {
		return removemarghettia;
	}

	public WebElement getRemovepepsi() {
		return removepepsi;
	}

	public WebElement getPepsi() {
		return pepsi;
	}

	public WebElement getBeverage() {
		return beverage;
	} 

	public WebElement getPeppypanner() {
		return peppypanner;
	}

	public WebElement getGourmetpizza() {
		return gourmetpizza;
	}

	public WebElement getNothanks() {
		return nothanks;
	}

	public WebElement getAddmarghetia() {
		return addmarghetia;
	}

	public WebElement getMarghettia() {
		return marghettia;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getVegpizz() {
		return vegpizz;
	}

	public WebElement getLocateme() {
		return locateme;
	}

	public WebElement getPopup() {
		return popup;
	}

	public PomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderonline() {
		return orderonline;
	}

	public WebElement getDelivery() {
		return delivery;
	}




}

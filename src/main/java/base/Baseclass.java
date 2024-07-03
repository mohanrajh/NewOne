package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Baseclass {
	
	public static WebDriver driver;
	
//	public static Actions ac;
	
	public static void url(WebDriver driver, String txt) {
		driver.get(txt);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void sendkeys(WebElement element,String txt) {
		element.sendKeys(txt);
	}
	
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void waits(WebDriver driver,int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
	}
	
	public static void toBackward(WebDriver driver) {
		driver.navigate().back();
	}
	
		
	public static void explicitwait(WebDriver driver, int seconds) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert myalert = driver.switchTo().alert();
		
		myalert.dismiss();
	 
	}
	public static void toAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public static void todismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public static void screenshot(WebDriver driver, String pizza) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("F:\\mohanseleniumproject\\DominosProject\\screenshot"+pizza+".png");
		FileUtils.copyFile(source, destination);
		
		
	}
	
	public static void scroll(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
	
//	public static void mousemove(WebElement element) {
//		ac.moveToElement(element).perform();
//		
//	}
	
	public static void popup(WebDriver driver) {
		ChromeOptions popup=new ChromeOptions();
		popup.addArguments("--disable-notification");
	}
     


	

}


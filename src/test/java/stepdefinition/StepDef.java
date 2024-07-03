package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.PomClass;
import runner.RunClass;

public class StepDef extends Baseclass {
	
	public static WebDriver driver=RunClass.driver;
	
	PomClass p=new PomClass(driver);
	
	@Given("Enter the url")
	public void enter_the_url(){
		url(driver, "https://www.dominos.co.in/");
		maximize(driver);
		
	}

	@Given("click the order online now")
	public void click_the_order_online_now() throws InterruptedException, IOException {
		click(p.getOrderonline());	
		Thread.sleep(2000);
		screenshot(driver,"online");

	}

	@Given("enter the adress and pincode")
	public void enter_the_adress_and_pincode() throws InterruptedException, IOException {
		Thread.sleep(4000);
		click(p.getPopup());
		click(p.getLocation());
		waits(driver,10);
		click(p.getDelivery());
		waits(driver,10);
		sendkeys(p.getDelivery(),"Alwarpet chennai");
		waits(driver,10);
		click(p.getLocateme());
		Thread.sleep(2000);
		 popup(driver);
		Thread.sleep(2000);
		screenshot(driver,"location");
		
	}

	@Given("select the veg pizza")
	public void select_the_veg_pizza() throws InterruptedException, IOException {
		waits(driver,10);
		click(p.getVegpizz());
		Thread.sleep(5000);
		click(p.getAddmarghetia());			
		click(p.getNothanks());
		Thread.sleep(2000);
		click(p.getGourmetpizza());
		Thread.sleep(2000);
		click(p.getPeppypanner());
		waits(driver,10);
		click(p.getCheckout());
		Thread.sleep(5000);
		click(p.getPlusmargeta());
		Thread.sleep(3000);
		click(p.getPlusgourmetpiza());
		Thread.sleep(2000);
		click(p.getPluspanner());
		Thread.sleep(2000);
		screenshot(driver,"add to cart");
		toBackward(driver);
		Thread.sleep(2000);
	}
	
	@Given("select the Beverages to add to cart")
	public void select_the_beverages_to_add_to_cart() throws InterruptedException, IOException {
		Thread.sleep(7000);
		click(p.getBeverage());
		Thread.sleep(2000);
		click(p.getPepsi());
		Thread.sleep(2000);
		click(p.getCheckout());
		waits(driver,10);
		for(int i = 0;i<=12;i++) {
			click(p.getPluspepsi());
					
		}
		Thread.sleep(2000);
		scroll(driver,p.getScrolldown());
		Thread.sleep(2000);
		screenshot(driver,"list of add to cart" );		
		scroll(driver,p.getScrollup());
	}
	
	@Then("Remove item from add to cart")
	public void remove_item_from_add_to_cart() throws InterruptedException {
		click(p.getRemovemarghettia());
		Thread.sleep(2000);
		click(p.getRemovepepsi());
		click(p.getRemovegaurmetpizza());
		click(p.getYes());
		click(p.getRemovepanner());
		
		
	}

	

	

}

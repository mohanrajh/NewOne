package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\mohanseleniumproject\\DominosProject\\src\\test\\java\\feature\\dominos.feature",glue="stepdefinition")
public class RunClass {
	
	public static WebDriver driver;

	@BeforeClass
	public static void run() {
		driver=new ChromeDriver();
	}
}


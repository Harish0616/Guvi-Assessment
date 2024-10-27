package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class SimpleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the driver
		WebDriver driver = new FirefoxDriver();	
		
		//Loading the URL
		driver.get("http://google.com");
		
		//maximize the page
		driver.manage().window().maximize();
		
		//close the element
		driver.close();		
		
		
	}

}

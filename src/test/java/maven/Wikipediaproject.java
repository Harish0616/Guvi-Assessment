package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipediaproject {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		try {
			
		
		driver.get("https://www.wikipedia.org/ ");
		
		driver.manage().window().maximize();
		
		
		//Find the search box
		
		WebElement searchbox = driver.findElement(By.name("search"));
		
		searchbox.sendKeys("Artifical Intelligence");
		
		searchbox.submit();
		
		Thread.sleep(1000);
		
		WebElement HistorySection = driver.findElement(By.linkText("History"));
		
		HistorySection.click();
		
		//wait for section for load
		Thread.sleep(2000);
		
		//print the title of the section
		
		String SectionTitle = driver.getTitle();
		System.out.println("SectionTitle");
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			driver.close();
		}
		
		
		


	}

}

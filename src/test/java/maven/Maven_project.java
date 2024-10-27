package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Maven_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//get the Maximize the driver
		driver.get("https://www.demoblaze.com/");
		
		//maximize the windows
		driver.manage().window().maximize();
		
		//verify the title of store
		String PageTitle = driver.getTitle();
		
		//equal the title
		if(PageTitle.equals("Stores")) {
			System.out.println("page landed on correct web site");
			}
		else {
			System.out.println("page landed on correct web site");
		}
		
		//close the browser
		driver.close();
	}

}

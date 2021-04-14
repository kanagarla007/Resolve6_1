package MavenProject.MavenProjectTEst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorr1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver(); 
		obj.get("https://www.selenium.dev/");
	obj.findElement(By.id("gsc-i-id1")).sendKeys("Test");	    
	
	}

}

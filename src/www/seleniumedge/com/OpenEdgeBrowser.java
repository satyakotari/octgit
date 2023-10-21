package www.seleniumedge.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\java selenium\\eclipseworkspace2\\javaprograms\\Drivers\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();		
		driver.get("https://www.google.com");		
		WebElement search = driver.findElement(By.ById.id("APjFqb"));
		search.sendKeys("https://www.gmail.com");		
		search.submit();		
		//WebElement username= driver.findElementById("identifier id");
		//username.sendKeys("kotarisathya@gmail.com");		
		//WebElement link = driver.findElementByClassName("LC20lb MBeuO DKV0Md");
		//link.submit();
		Thread.sleep(3000);
		driver.close();
	}

}

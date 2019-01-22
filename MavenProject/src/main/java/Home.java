

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	ChromeDriver driver;
	By myacc=By.linkText("My Account");
	
	public Home(ChromeDriver driver) {
		super();
		this.driver = driver;
	}
		public void clickOnMyAcc()
		{
			driver.findElement(myacc).click();	
			}
}

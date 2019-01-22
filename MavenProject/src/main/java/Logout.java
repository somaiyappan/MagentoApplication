

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	ChromeDriver driver;
	By logout =By.linkText("Log Out");
	public Logout(ChromeDriver driver) {
		super();
		this.driver = driver;
	}
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
	

}

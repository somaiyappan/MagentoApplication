

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	ChromeDriver driver;
	By email=By.id("email");
	By pass=By.id("pass");	
	By login=By.id("send2");
	
	public Login(ChromeDriver driver) {
		super();
		this.driver = driver;
	}
	public void typeEmail(String username)
	{
		driver.findElement(email).sendKeys(username);
	}
	public void typePassword(String pwd)
	{
		driver.findElement(pass).sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}

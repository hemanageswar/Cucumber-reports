package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void launch(String s) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Oxygen WorkSpace\\Data\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(s);

	}

	public void login(WebElement list, WebElement list2, String s, String s1) {

		list.sendKeys(s);
		list2.sendKeys(s1);

	}

	public void buttonClick(WebElement list) {
		list.click();
	}

	
}

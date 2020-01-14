package pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(id = "email")
	private List<WebElement> user;

	@FindBy(id = "pass")
	private List<WebElement> pass;

	@FindBy(id = "loginbutton")
	private List<WebElement> btn;
	
	@FindBy(xpath="//a[text()='Create a Page']")
	private WebElement New;

	public WebElement getNew() {
		return New;
	}

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getBtn() {
		return btn;
	}

	
	
	
}

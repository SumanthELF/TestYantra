package san;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username") 
	private WebElement usernameTextField ;
	
	@FindBy(name="pwd") 
	private WebElement passwordTextField;
	
	@FindBy(id="loginButton") 
	private WebElement loginButton ;
	
	@FindBy(id="")
	private WebElement dummyElement;

	
	public WebElement getDummyElement() {
		return dummyElement;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
}

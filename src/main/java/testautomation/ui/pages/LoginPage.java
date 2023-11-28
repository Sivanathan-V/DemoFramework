package testautomation.ui.pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testautomation.ui.uibase.UI_Base;
@Data
public class LoginPage extends UI_Base {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[@id='login-link']")
    private WebElement btnLoginLink;
    @FindBy(xpath="//input[@type='text']")
    private WebElement txtUserName;
    @FindBy(xpath="//input[@type='password']")
    private WebElement txtPassword;
    @FindBy(xpath="//span[text()='Submit']")
    private WebElement btnLogin;
    @FindBy(xpath="//div[text()='  Demo user ']")
    private WebElement txtUserVerification;
    @FindBy(xpath="//div[text()='The given name / password are incorrect. Please, try again.']")
    private WebElement txtLoginErrorMsg;

}

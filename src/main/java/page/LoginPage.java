package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id = "email")
    private WebElement emailTxtBox;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTxtBox;

    @FindBy(id = "loginBtn")
    private WebElement loginbtn;

    public void enterUsername(String s)
    {
        emailTxtBox.sendKeys(s);
    }

    public void enterpassword(String s)
    {
        passwordTxtBox.sendKeys(s);
    }

    public void clickOnloginBtn()
    {
        loginbtn.click();
    }
}

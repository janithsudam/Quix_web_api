package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='New User']")
    private WebElement qut_btn_new_user;

    @FindBy(xpath = "//button[normalize-space()='New User']")
    private WebElement loader;

    public void clickbtn_user() {
        waitUntilElementDissapear(loader);
        qut_btn_new_user.click();
    }
}

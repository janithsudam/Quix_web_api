package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public static WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Users']")
    private WebElement User_menu_element;


    public void ClickonUserMenu()
    {
        User_menu_element.click();
    }

public void VerifyLogin(){
    String Actual = driver.getTitle();
    String Expected = "https://qut.azurewebsites.net/Reports";

    if (Actual.equals(Expected)) {
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
}

}

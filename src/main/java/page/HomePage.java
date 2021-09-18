package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class HomePage extends BasePage {
    public static WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Users']")
    private WebElement User_menu_element;

    @FindBy(xpath = "//a[normalize-space()='Customers']")
    private WebElement Customer_menu_element;

    @FindBy(xpath = "//a[normalize-space()='Plotter']")
    private WebElement Plotter_menu_element;

    //@FindBy(xpath = "//td[normalize-space()='1511']")
    //public WebElement Userid;

    public void ClickonUserMenu() {
        driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, 50);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='1511']")));
        User_menu_element.click();

    }


    public void ClickonCustomerMenu() {
        Customer_menu_element.click();
    }

    public void ClickonPlotterMenu() {
        Plotter_menu_element.click();
    }


    public void VerifyLogin() {
        String Actual = driver.getTitle();
        String Expected = "https://qut.azurewebsites.net/Reports";

        if (Actual.equals(Expected)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }

}

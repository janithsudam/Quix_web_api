package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerManagementPage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    private WebElement btnNewCustomer;

    public void clickOnAddCustomer() {
        btnNewCustomer.click();
    }
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlotterPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='Add Plotter']")
    private WebElement btnNewPlotter;

    public void clickOnAddPlotter() {
        btnNewPlotter.click();
    }
}

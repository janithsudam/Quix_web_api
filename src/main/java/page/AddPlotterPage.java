package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddPlotterPage extends BasePage {


    @FindBy(xpath = "//input[@placeholder='Mac Address']")
    public WebElement macaadresstxtbox;

    @FindBy(xpath = "//input[@placeholder='Plotter Id']")
    public WebElement ploteridtxtbox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[3]/div/div/div/div[1]/div[1]")
    public WebElement rstoredrpdown;

    @FindBy(xpath = "//select[@name='cutterStatus']")
    public WebElement statusdrpdown;

    @FindBy(xpath = "//html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[2]")
    public WebElement addplottersavebtn;

    public void setmacaddress(String s) {
        macaadresstxtbox.sendKeys(s);
    }
    public void setploteridtxtbox(String s) {
        ploteridtxtbox.sendKeys(s);
    }
    public void setrstoredrpdown(String s) {
        Select rstoredropdown = new Select(rstoredrpdown);
        rstoredropdown.selectByVisibleText(s);
    }
    public void setstatusdrpdown(String s) {
        Select statusdrpdowndropdown = new Select(statusdrpdown);
        statusdrpdowndropdown.selectByVisibleText(s);
    }
    public void setCusSaveBtn() {
        addplottersavebtn.click();
    }
}

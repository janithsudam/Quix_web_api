package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegNewUserPage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='isAdmin']/parent::label")
    //private WebElement AdminRdb;
    public List<WebElement> AdminRdb;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement FirstnameTxtBox;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement LastnameTxtBox;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement UserEmailTxtBox;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement Usercountrydrpdwn;

    @FindBy(xpath = "//div[contains(@class,'row')]//div[1]//select[1]")
    private WebElement channelDrpdwn;

    @FindBy(xpath = "//select[@name='clientId']")
    private WebElement EntityDrpdwn;

//    @FindBy(xpath = "//select[@name='clientId']")
//    private WebElement TimezoneDrpdwn;
//
//    @FindBy(xpath = "//select[@name='clientId']")
//    private WebElement weekStartDate;

    @FindBy(xpath = "//input[@name='menu']/parent::label")
    public List<WebElement> Accesschkbox;

    @FindBy(xpath = "//button[@id='save changesBtn']")
    private WebElement savebtn;

    public void setuserrdb(List<WebElement> element, String valuetobeselected) {
        for (WebElement ref : AdminRdb) {
            if (ref.getText().equalsIgnoreCase(valuetobeselected)) {
                ref.click();
                break;
            }
        }
    }

    public void setFirstname(String s) {
        FirstnameTxtBox.sendKeys(s);
    }

    public void setLastname(String s) {
        LastnameTxtBox.sendKeys(s);
    }

    public void setEmail(String s) {
        UserEmailTxtBox.sendKeys(s);
    }

    public void setcountry(String country) {
        Select channelDropDown = new Select(Usercountrydrpdwn);
        channelDropDown.selectByVisibleText(country);
    }

    public void setChannelDrpdwnn(String channel) {
        Select channelDropDown = new Select(channelDrpdwn);
        channelDropDown.selectByVisibleText(channel);
    }

    public void Setentity(String entitity) {
        Select entitylDropDown = new Select(EntityDrpdwn);
        entitylDropDown.selectByVisibleText(entitity);
    }

//    public void SetTimeZone(String timezone) {
//        Select entitylDropDown = new Select(TimezoneDrpdwn);
//        entitylDropDown.selectByVisibleText(timezone);
//    }
//
//    public void SetWeekstartdate(String wstrtdate) {
//        Select entitylDropDown = new Select(TimezoneDrpdwn);
//        entitylDropDown.selectByVisibleText(wstrtdate);
//    }

    public void setAccesschkbox(List<WebElement> element, String check) {
        String[] checkarray = check.split(",");
        for (String str : checkarray) {
            for (WebElement ele : element) {
                if (ele.getText().equalsIgnoreCase(str)) {
                    ele.click();
                    break;
                }
            }
        }
    }

    public void setsavebtn() {
        savebtn.click();
    }
}

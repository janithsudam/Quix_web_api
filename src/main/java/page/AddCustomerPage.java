package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {

    @FindBy (xpath = "//select[@name='channelId']")
    public WebElement channeldrpdown;

    @FindBy (xpath = "//input[@placeholder='Company Name']")
    public WebElement companynametxtbox;

    @FindBy (xpath = "//select[@name='country']")
    public WebElement Countrydrpdown;

    @FindBy (xpath = "(//div[contains(text(),'Please select Province')])[1]")
    public WebElement provincedrpdown;

    @FindBy (xpath = "//div[contains(text(),'Please select City')]")
    public WebElement citydrpdown;

    @FindBy (xpath = "//div[contains(text(),'Please Select district')]")
    public WebElement districtdrpdown;

    @FindBy(xpath = "//div[@class='modal-dialog modal-xl']//button[@type='button'][normalize-space()='Save changes']")
    public WebElement cusSaveBtn;

    public void setChannelDrpDwn(String channel) {
        Select channelDropDown = new Select(channeldrpdown);
        channelDropDown.selectByVisibleText(channel);
    }

    public void setCusCompanyName(String s){
        companynametxtbox.sendKeys(s);
    }
    public void setcusCountryDropDwn(String country){
        Select countrydropdown = new Select(Countrydrpdown);
        countrydropdown.selectByVisibleText(country);
    }

    public void setcusProvinceDropDwn(String province){
        Select provincedropdown = new Select(provincedrpdown);
        provincedropdown.selectByVisibleText(province);
    }

    public void setcusCityDropDwn(String city){
        Select citydropdown = new Select(citydrpdown);
        citydropdown.selectByVisibleText(city);
    }

    public void setcusDistrictDropDwn(String district){
        Select districtdropdown = new Select(districtdrpdown);
        districtdropdown.selectByVisibleText(district);
    }

    public void setCusSaveBtn(){
        cusSaveBtn.click();
    }



}

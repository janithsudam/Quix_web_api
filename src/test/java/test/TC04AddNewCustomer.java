package test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AddCustomerPage;
import page.CustomerManagementPage;
import page.HomePage;

public class TC04AddNewCustomer extends BaseTest {

    @BeforeMethod(description = "This method is to create click on customer menu on home page")
    public void user_login() throws InterruptedException {
        TC01UserLogin obj = new TC01UserLogin();
        obj.ValiedUserLogin();
    }

    @Test(priority = '1', description = "This method is used to add new importer ")
    public void addNewImporter() throws InterruptedException {
        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        CustomerManagementPage customerpg = PageFactory.initElements(driver, CustomerManagementPage.class);
        AddCustomerPage newCustomer = PageFactory.initElements(driver, AddCustomerPage.class);

        hompg.ClickonCustomerMenu();
        customerpg.clickOnAddCustomer();
        newCustomer.setChannelDrpDwn("Importer");
        newCustomer.setCusCompanyName("tets2 tradex");
        newCustomer.setcusCountryDropDwn("India");
        newCustomer.setcusProvinceDropDwn("Kerala");
        newCustomer.setcusCityDropDwn("Alappuzha");
        newCustomer.setcusDistrictDropDwn("CHENGANNUR");
        newCustomer.setCusSaveBtn();
    }

    @Test(priority = '2', description = "This method is used to add new distributor ")
    public void addNewDistributor() throws InterruptedException {
        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        CustomerManagementPage customerpg = PageFactory.initElements(driver, CustomerManagementPage.class);
        AddCustomerPage newCustomer = PageFactory.initElements(driver, AddCustomerPage.class);

        hompg.ClickonCustomerMenu();
        customerpg.clickOnAddCustomer();
        newCustomer.setChannelDrpDwn("Distributor");
        newCustomer.setCusCompanyName("tets3 tradex");
        newCustomer.setcusCountryDropDwn("India");
        newCustomer.setcusProvinceDropDwn("Kerala");
        newCustomer.setcusCityDropDwn("Alappuzha");
        newCustomer.setcusDistrictDropDwn("CHENGANNUR");
        newCustomer.setCusSaveBtn();
    }

    @Test(priority = '3', description = "This method is used to add new RetailChain ")
    public void addNewRetailChain() throws InterruptedException {
        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        CustomerManagementPage customerpg = PageFactory.initElements(driver, CustomerManagementPage.class);
        AddCustomerPage newCustomer = PageFactory.initElements(driver, AddCustomerPage.class);

        hompg.ClickonCustomerMenu();
        customerpg.clickOnAddCustomer();
        newCustomer.setChannelDrpDwn("Distributor");
        newCustomer.setCusCompanyName("tets4 tradex");
        newCustomer.setcusCountryDropDwn("India");
        newCustomer.setcusProvinceDropDwn("Kerala");
        newCustomer.setcusCityDropDwn("Alappuzha");
        newCustomer.setcusDistrictDropDwn("CHENGANNUR");
        newCustomer.setCusSaveBtn();
    }

    @Test(priority = '4', description = "This method is used to add new RetailStore ")
    public void addNewRetailStore() throws InterruptedException {
        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        CustomerManagementPage customerpg = PageFactory.initElements(driver, CustomerManagementPage.class);
        AddCustomerPage newCustomer = PageFactory.initElements(driver, AddCustomerPage.class);

        hompg.ClickonCustomerMenu();
        customerpg.clickOnAddCustomer();
        newCustomer.setChannelDrpDwn("RetailStore");
        newCustomer.setCusCompanyName("tets5 tradex");
        newCustomer.setcusCountryDropDwn("India");
        newCustomer.setcusProvinceDropDwn("Kerala");
        newCustomer.setcusCityDropDwn("Alappuzha");
        newCustomer.setcusDistrictDropDwn("CHENGANNUR");
        newCustomer.setCusSaveBtn();
    }
}

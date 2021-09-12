package test;

import base.BaseTest;
import page.HomePage;
import page.RegNewUserPage;
import page.UserPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03RegNewUserAdmin extends BaseTest {

    @BeforeMethod(description = "This method is to create, click on user menu on home page")
    public void user_login() throws InterruptedException {
        TC01UserLogin obj = new TC01UserLogin();
        obj.ValiedUserLogin();
    }

    @Test(priority = '2', description = "This method is used to create register new user with Admin privilege ")
    public void register_new_user_admin() throws InterruptedException {
        RegNewUserPage newUser = PageFactory.initElements(driver, RegNewUserPage.class);
        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        UserPage userpg = PageFactory.initElements(driver, UserPage.class);

        hompg.ClickonUserMenu();
        userpg.clickbtn_user();
        newUser.setuserrdb(newUser.AdminRdb, "Admin");
        newUser.setFirstname("Geoorgee");
        newUser.setLastname("aleex");
        newUser.setEmail("alexx_0112@gmail.com");
        newUser.setcountry("India");
        newUser.setChannelDrpdwnn("Importer");
        newUser.Setentity("TRADE X ME LLC");
        newUser.setAccesschkbox(newUser.Accesschkbox,"Reports,Customers,Promoters,Users,Plotter,Designs,QRCodes,Languages,Library,Warranty,Firmware");
        newUser.setsavebtn();
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}

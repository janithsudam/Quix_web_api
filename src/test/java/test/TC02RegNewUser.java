package test;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.RegNewUserPage;
import page.UserPage;

public class TC02RegNewUser {

    private WebDriver driver;

    @BeforeMethod(description = "This method is to create, click on user menu on home page")
    public void user_login() throws InterruptedException {
        TC01UserLogin obj = new TC01UserLogin();
        obj.ValiedUserLogin();
    }
    @Test(priority = '1', description = "This method is used to create register new user with User privilege ")
    public void register_new_user() throws InterruptedException {

        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        UserPage userpg = PageFactory.initElements(driver, UserPage.class);
        RegNewUserPage newUser = PageFactory.initElements(driver, RegNewUserPage.class);
        hompg.ClickonUserMenu();
        userpg.clickbtn_user();
        newUser.setuserrdb(newUser.AdminRdb, "User");
        newUser.setFirstname("saddeessha");
        newUser.setLastname("Desilva");
        newUser.setEmail("janithsudhham11212@gmail.com");
        newUser.setcountry("India");
        newUser.setChannelDrpdwnn("Importer");
        newUser.Setentity("TRADE X ME LLC");
        newUser.setAccesschkbox(newUser.Accesschkbox,"Reports,Customers,Promoters,Warranty");
        newUser.setsavebtn();
    }
}

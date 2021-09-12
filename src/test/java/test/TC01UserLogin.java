package test;

import base.BaseTest;
import page.HomePage;
import page.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC01UserLogin extends BaseTest {
    @Test(priority = '1', description = "This method is used to verify valid username and valied password login")
    public void ValiedUserLogin() throws InterruptedException {
        LoginPage login_obj = PageFactory.initElements(driver, LoginPage.class);
        login_obj.enterUsername("janith@elementx.dev");
        login_obj.enterpassword("[l!5g9H");
        login_obj.clickOnloginBtn();
        HomePage verifylogin = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(5000);
    }

    @Test(priority = '2', description = "This method is used to verify invalid username and valied password")
    public void inValiedUserLogin() {
        LoginPage login_obj = PageFactory.initElements(driver, LoginPage.class);
        login_obj.enterUsername("janithh@elementx.dev");
        login_obj.enterpassword("[l!5g9H");
        login_obj.clickOnloginBtn();
    }

    @Test(priority = '3', description = "This method is used to verify valid username and invalied password")
    public void inValiedUserLogin2() {
        LoginPage login_obj = PageFactory.initElements(driver, LoginPage.class);
        login_obj.enterUsername("janith@elementx.dev");
        login_obj.enterpassword("};60OYj");
        login_obj.clickOnloginBtn();
    }

    @Test(priority = '4', description = "This method is used to verify invalid username and invalied password")
    public void inValiedUserLogin3() {
        LoginPage login_obj = PageFactory.initElements(driver, LoginPage.class);
        login_obj.enterUsername("janithh@elementx.dev");
        login_obj.enterpassword("};6O0Yj");
        login_obj.clickOnloginBtn();
    }

}

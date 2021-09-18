package test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AddPlotterPage;
import page.HomePage;
import page.PlotterPage;

public class TC05AddNewPlotter extends BaseTest {

    public class TC04AddNewCustomer extends BaseTest {
        @BeforeMethod(description = "This method is to create click on customer menu on home page")
        public void user_login() throws InterruptedException {
            TC01UserLogin obj = new TC01UserLogin();
            obj.ValiedUserLogin();
        }
    }

    @Test(priority = '1', description = "This method is used to add new plotter ")
    public void addNewPlotter() throws InterruptedException {
        HomePage hompg = PageFactory.initElements(driver, HomePage.class);
        PlotterPage plotterpg = PageFactory.initElements(driver, PlotterPage.class);
        AddPlotterPage newplotter = PageFactory.initElements(driver, AddPlotterPage.class);

        hompg.ClickonPlotterMenu();
        plotterpg.clickOnAddPlotter();
        newplotter.setmacaddress("00:15:A6:01:45:30");
        newplotter.setploteridtxtbox("QUIX TEST12");
        newplotter.setrstoredrpdown("Linnoll R&D - Test");
        newplotter.setstatusdrpdown("Active");
        newplotter.setCusSaveBtn();
    }

}

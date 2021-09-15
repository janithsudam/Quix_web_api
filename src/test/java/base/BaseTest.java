package base;

import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    @Parameters("browser_name")
    public  void before()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        driver =new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.navigate().to(Constants.Base_Url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void after(){
        driver.quit();
    }
}

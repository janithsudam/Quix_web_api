package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;

    public BasePage (){
        this.driver = driver;
    }

    public void waitUntilElementVisible(By by){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilElementDissapear(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}

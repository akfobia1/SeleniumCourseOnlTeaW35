package taskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {


    public static void main(String[] args) {
     System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement acceptAll = driver.findElement(By.id("L2AGLb"));
        acceptAll.click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
//        driver.quit();
    }
}

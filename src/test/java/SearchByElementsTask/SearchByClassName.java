package SearchByElementsTask;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchByClassName {
    @Test
    public void searchByClassName(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement searchSignIn = driver.findElement(By.className("hidden-xs"));
        searchSignIn.click();
        WebElement searchEmail = driver.findElement(By.className("account_input"));
        searchEmail.sendKeys("mamam@lka.pl");

        WebElement searchCreateAccount = driver.findElement(By.className("icon-user"));
        searchCreateAccount.submit();



      ;
    }


}

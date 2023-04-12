package SearchByElementsTask;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchById {

    @Test
   public void searchById() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get(" https://hotel-testlab.coderslab.pl/en/ ");
       WebElement searchHotelLocation =  driver.findElement(By.id("hotel_location"));
//
        searchHotelLocation.sendKeys("Warsaw");
        WebElement searchButton = driver.findElement(By.id("search_room_submit"));
        searchButton.click();

        WebElement searchEmali =driver.findElement(By.id("newsletter-input"));
        searchEmali.sendKeys("test@test.com");

        driver.quit();

    }

}

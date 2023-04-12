package SearchByElementsTask;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SearchByName {

    @Test
    public void searchByName(){
//        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get("https://hotel-testlab.coderslab.pl/en/" );

        WebElement searchHotelLocation = driver.findElement(By.name("hotel_location"));
        searchHotelLocation.sendKeys("Warsaw");

        WebElement searchSearchButton = driver.findElement(By.name("search_room_submit"));
        searchSearchButton.submit();

        WebElement searchEmail = driver.findElement(By.name("email"));
        searchEmail.sendKeys("test@test.com");

        WebElement searchSubscribebutton = driver.findElement(By.name("submitNewsletter"));

    }
}

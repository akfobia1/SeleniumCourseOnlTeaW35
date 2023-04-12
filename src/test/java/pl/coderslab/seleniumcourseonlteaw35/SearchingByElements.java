package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SearchingByElements {

        @Test
        public void zad1ByIdTest() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
            //given
            driver.get(" https://hotel-testlab.coderslab.pl/en/");
            //when
            WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
            assertNotNull(hotelLocation);
            hotelLocation.sendKeys("Warsaw");


//            searchInput.sendKeys("W pustyni i w puszczy");
//            WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
//            searchButton.click();
        }
}




package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class DuckDuckGoTest {
//        @Test
//        public void searchWithDuckDuckGo() {
//            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://duckduckgo.com/");
//            WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
//            searchInput.sendKeys("W pustyni i w puszczy");
//            WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
//            searchButton.click();
//
//
//
////        driver.close();
//        }
        @Test
        public void zad2Test(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://duckduckgo.com/");
            driver.get("https://coderslab.pl/pl");
            driver.get("https://mystore-testlab.coderslab.pl/index.php");
            driver.get(" https://hotel-testlab.coderslab.pl/en/");
        }
   //     @Test
//        public void zad3Test(){
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://duckduckgo.com/");
//            driver.get("https://coderslab.pl/pl");
//            driver.navigate().back();
//            driver.get("https://mystore-testlab.coderslab.pl/index.php");
//            driver.navigate().back();
//            driver.navigate().forward();
//            driver.navigate().refresh();
//            driver.quit();
//
//        }
    }

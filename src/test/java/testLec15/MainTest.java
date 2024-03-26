package testLec15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    public void testGoogle(){




        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement text = driver.findElement(By.id("gNO89b"));
        text.sendKeys("Selenium");

        WebElement button = driver.findElement(By.className("gNO89b"));
        button.click();

    }
}

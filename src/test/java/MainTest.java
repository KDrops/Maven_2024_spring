
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.Main.getPad;
import static org.example.Main.getSum;
public class MainTest { //для классов слово тест пишется после,
    //в названиях методов перед названием


    @Test

//    public void testGetSum(){
//        System.out.println(getSum(0, 0) == 0);
//        System.out.println(getSum(5, 5) == 10);
//        System.out.println(getSum(1000, 1000) == 2000);
//        System.out.println(getSum(-5, -5) == -10);
//
//        Assert.assertEquals(getSum(0, 0), 0);
//        Assert.assertEquals(getSum(5, 5),10);
//        Assert.assertEquals(getSum(1000, 1000), 2000);
//        Assert.assertEquals(getSum(-5, -5), -10);
//    }
//      public void testGetPad(){
//          System.out.println("".equals(getPad("a", 0)));
//          System.out.println("".equals(getPad("", 3)));
//          System.out.println("AAA".equals(getPad("A", 3)));
//      }

    public void testTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

//        String title = driver.getTitle();
//        Assert.assertEquals("Web form", title);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        Assert.assertEquals("Received!", value);



        driver.quit();
    }
}

package homework_4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework_4 {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\dz\\TestSelenium\\src\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("83");
        driver.findElementByName("ht").sendKeys("181");
        driver.findElementByName("cc").click();
        driver.quit();
    }
}

















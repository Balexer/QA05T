package lesson_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Smoke_test_1 {
    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\dz\\TestSelenium\\src\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.3crkp.by/информация/полезно-знать/медицинские-калькуляторы/расчет-имт");
        WebElement weight = driver.findElement(By.name("mass"));
        weight.sendKeys("58");
        WebElement height = driver.findElement(By.name("ht"));
        height.sendKeys("183");
        WebElement calculate = driver.findElement(By.cssSelector("input[type = 'button']"));
        calculate.click();
        WebElement result = driver.findElement(By.name("result"));
        String resultValue = result.getAttribute("value");
        if (!resultValue.equals("17.32")) {
            System.out.println("is not equal to 17.32");
        } else {
            System.out.println("So good");
        }
        WebElement status = driver.findElement(By.id("resline"));
        String statusValue = status.getText();
        if (!statusValue.equals("Пониженный вес")) {
            System.out.println("fail");
        } else System.out.println("pass");
        driver.quit();

    }
}















package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Additional extends Base_Test{
    @Test
    public void test2() {
        //Открыть страницу myfin.by
        driver.get("https://myfin.by/");
        driver.manage().window().maximize();

        // Навестись на меню Курсы валют
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(By.linkText("Курсы валют"));
        action.moveToElement(elem).build().perform();

        // Перейти в меню Курс bitcoin
        WebElement elemBit = driver.findElement(By.linkText("Курс Bitcoin"));
        elemBit.click();

        //Проверить что открылась соответствующая страница
        assertTrue(driver.getTitle().contains("Курс Биткоина на сегодня, стоимость, курс BTC онлайн, график Bitcoin"));

    }
}

package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework_Task_1 extends Base_Test{

    @Test
    public void test3() {
        String weightValue = "40";
        String heightValue = "158";
        String expectedSIUnits = "16.02";
        String expectedUSUnits = "16.29";
        String expectedUKUnits = "101.73";
        String expectedStatus = "Your category is Underweight";

        //Открыть сайт https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");

        //Ввести Weight
        WebElement weight = driver.findElement(By.name("wg"));
        weight.sendKeys(weightValue);

        //Ввести Height
        WebElement height = driver.findElement(By.name("ht"));
        height.sendKeys(heightValue);

        //Нажать на кнопку ‘Calculate’
        WebElement calculate = driver.findElement(By.name("cc"));
        calculate.click();

        //Проверить значение в поле 'SI Units’
        WebElement SI_Units = driver.findElement(By.name("si"));
        Assert.assertEquals(SI_Units.getAttribute("value"), expectedSIUnits);

        //Проверить значение в поле 'US Units’
        WebElement US_Units = driver.findElement(By.name("us"));
        Assert.assertEquals(US_Units.getAttribute("value"), expectedUSUnits);

        //Проверить значение в поле ’UK Units’
        WebElement UK_Units = driver.findElement(By.name("uk"));
        Assert.assertEquals(UK_Units.getAttribute("value"), expectedUKUnits);

        //Проверить статус
        WebElement status = driver.findElement(By.name("desc"));
        Assert.assertEquals(status.getAttribute("value"), expectedStatus);

    }
}

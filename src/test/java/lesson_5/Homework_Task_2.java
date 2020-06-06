package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework_Task_2 extends Base_Test{
    @Test
    public void test3() {
        String weightValue = "70";
        String massUnit = "pounds";
        String heightValue_1 = "5";
        String heightValue_2 = "6";
        String expectedSIUnits = "11.27";
        String expectedUSUnits = "11.46";
        String expectedUKUnits = "71.58";
        String expectedStatus = "Your category is Normal";

        //Открыть сайт https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");

        //Ввести Weight = 70 pounds
        WebElement dropdownWeight = driver.findElement(By.name("opt1"));
        Select WDropDown = new Select(dropdownWeight);
        WDropDown.selectByValue(massUnit);
        WebElement weight = driver.findElement(By.name("wg"));
        weight.clear();
        weight.sendKeys(weightValue);

        //Ввести Height = 5'6"
        WebElement dropdownHeight_1 = driver.findElement(By.name("opt2"));
        Select sDropDown = new Select(dropdownHeight_1);
        sDropDown.selectByValue(heightValue_1);
        WebElement dropdownHeight_2 = driver.findElement(By.name("opt3"));
        Select HDropDown = new Select(dropdownHeight_2);
        HDropDown.selectByValue(heightValue_2);

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

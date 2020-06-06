package lesson_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Smoke_test_2 {
    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\dz\\TestSelenium\\src\\drivers\\chromedriver.exe");
       // Открыть сайт https://www.3crkp.by/информация/полезно-
        //знать/медицинские-калькуляторы/расчет-скф
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.3crkp.by/информация/полезно-знать/медицинские-калькуляторы/расчет-скф");

       // Выбрать женский пол из выпадающего списка
        WebElement dropdown = driver.findElement(By.id("oSex"));
        Select sDropDown = new Select(dropdown);
        sDropDown.selectByValue("1");

       // Ввести Креатенин = 80
        WebElement creatine = driver.findElement(By.id("oCr"));
        creatine.sendKeys("80");
        //Ввести Возраст = 38 годам
        WebElement age = driver.findElement(By.id("oAge"));
        age.sendKeys("38");

        //Ввести Вес = 55 кг
        WebElement weight = driver.findElement(By.id("oWeight"));
        weight.sendKeys("55");

        //Ввести Рост = 163 см
        WebElement height = driver.findElement(By.id("oHeight"));
        height.sendKeys("163");

        //Нажать на кнопку ‘Рассчитать’
        WebElement calculate = driver.findElement(By.cssSelector("input[type = 'button']"));
        calculate.click();

       // Проверить результаты: ‘MDRD: 74 (мл/мин/1,73кв.м)’
        WebElement resultMDRD = driver.findElement(By.id("txtMDRD"));
        String resultMDRDValue = resultMDRD.getText();
        if (!resultMDRDValue.equals("MDRD: 74 (мл/мин/1,73кв.м)")) {
            System.out.println("no good");
        } else {
            System.out.println("So good");
        }

        //Проверить результаты: ‘ХБП: 2 стадия (при наличии почечного
        //        повреждения)’
        WebElement resultHMD = driver.findElement(By.id("txtMDRD1"));
        String resultHMDValue = resultHMD.getText();
        if (!resultHMDValue.equals("ХБП: 2 стадия (при наличии почечного повреждения)")) {
            System.out.println("no good");
        } else {
            System.out.println("So good");
        }

       // Проверить результаты: ‘Cockroft-Gault: 70 (мл/мин)’
        WebElement resultCockroftGault = driver.findElement(By.id("txtCG"));
        String resultCockroftGaultValue = resultCockroftGault.getText();
        if (!resultCockroftGaultValue.equals("Cockroft-Gault: 70 (мл/мин)")) {
            System.out.println("no good");
        } else {
            System.out.println("So good");
        }

       // Проверить результаты: ‘Поверхность тела:1.58 (кв.м)’
        WebElement resultBody = driver.findElement(By.id("txtBSA"));
        String resultBodyValue = resultBody.getText();
        if (!resultBodyValue.equals("Поверхность тела:1.58 (кв.м)")) {
            System.out.println("no good");
        } else {
            System.out.println("So good");
        }

        //Закрыть окно браузера
        driver.quit();
    }
}

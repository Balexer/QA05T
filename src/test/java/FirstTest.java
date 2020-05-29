import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\dz\\TestSelenium\\src\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        driver.quit();
    }
}

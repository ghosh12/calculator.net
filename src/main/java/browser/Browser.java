package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pagaes.Homepage;

import java.util.concurrent.TimeUnit;

/**
 * Created by dipak on 12/9/2018.
 */
public class Browser {
    public static WebDriver driver = null;

    public static Homepage openbrWoser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dipak\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.calculator.net/");
        return PageFactory.initElements(driver, Homepage.class);

    }

}


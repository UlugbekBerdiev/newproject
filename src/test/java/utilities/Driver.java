package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null) {

            switch (Config.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();

            }

        }
        return driver;
    }

    public static void qute() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }}
}

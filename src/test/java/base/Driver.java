package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.ElementReader;

import java.io.File;

public class Driver {
    public static WebDriverWait wait;
    public static WebDriver driver;
    public String expectedText;
    protected ConfigReader configReader = new ConfigReader("config");
    protected ElementReader elementReader = new ElementReader("element");

    public void initializeDriver() {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        //Notifications Close
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("allow-insecure-localhost");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extentions");
        options.merge(desiredCapabilities);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.hepsiburada.com/");
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void testFailed() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("target/" + System.currentTimeMillis() + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

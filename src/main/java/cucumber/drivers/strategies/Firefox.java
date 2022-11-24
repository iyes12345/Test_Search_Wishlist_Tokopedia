package cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "E:\\Geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}

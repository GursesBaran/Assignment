package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            closePreviousDrivers();
            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.INFO);
            driver.set(new ChromeDriver());
            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.set(null);
        }
    }

    private static void closePreviousDrivers() {
        // Consider using ProcessBuilder for better platform compatibility
        try {
            ProcessBuilder builder = new ProcessBuilder("taskkill", "/F", "/IM", "chromedriver.exe", "/T");
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



































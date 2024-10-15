package BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public Properties prop;
    public static AndroidDriver driver;

    public void Initilition() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\acer\\Desktop\\java\\Bridzelabz_softwareTesting_manual_Automation_MobileTesting\\HimlayWellnessMobileAppTestingusingEmulator\\src\\main\\java\\Config\\AppConfig.properties");
            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }

        DesiredCapabilities capabilities = new DesiredCapabilities(); // Instantiates DesiredCapabilities object
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("automationName"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
        capabilities.setCapability("appPackage", prop.getProperty("appPackage"));
        capabilities.setCapability("appActivity", prop.getProperty("appActivity"));
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url, capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void WaitForElementToBeVisiable(WebElement element, int timeout) {
        if (driver != null) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOf(element));

        } else {
            throw new IllegalStateException(("Driver is not iniitilized"));
        }
    }

}

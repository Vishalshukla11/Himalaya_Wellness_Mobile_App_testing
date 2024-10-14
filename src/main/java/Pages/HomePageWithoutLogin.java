package Pages;


import BasePage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWithoutLogin extends BaseClass {
//WebDriver driver;
    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public WebElement locationPermission;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200F\u200F\u200F\u200E\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200E\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200F\u200F\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200E\u200F\u200F\u200E\u200F\u200E\u200E\u200F\u200E\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200E\u200E\u200E\u200E\u200ENavigate up\u200E\u200F\u200E\u200E\u200F\u200E\"]\n")
    public WebElement hamburgerIcon; // Simplified XPath

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.ImageView\n") // Simplified the XPath
    public WebElement signInButton;

    // Constructor for HomePageWithoutLogin, initializing the BasePage with the driver
    public HomePageWithoutLogin(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // Method to grant location permission
    public void giveLocationPermission() {
        locationPermission.click();
    }

    // Method to click the Hamburger icon
    public void clickHamburgerIcon() {
        hamburgerIcon.click();
    }

    // Method to click on the Sign In button
    public LoginPage clickSignIn() {
        signInButton.click();
        return new LoginPage();
    }
}

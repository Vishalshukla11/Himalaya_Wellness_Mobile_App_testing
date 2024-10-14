
import BasePage.BaseClass;
import Pages.HomePageWithoutLogin;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCasesHomePageWithoutLogin extends BaseClass {

    public HomePageWithoutLogin homepage;


    @BeforeClass
    public void Setup() {
       Initilition();
       homepage= new HomePageWithoutLogin(driver);

    }

    @Test(priority = 1)
    public void giveLocationPermission() {
        homepage.WaitForElementToBeVisiable(homepage.locationPermission, 20);
        homepage.giveLocationPermission();
    }


    // Test to click on the hamburger icon
    @Test(priority = 2)
    public void testClickHamburgerIcon() {
        homepage.WaitForElementToBeVisiable(homepage.hamburgerIcon, 20);
        homepage.clickHamburgerIcon();
    }

    // Test to click on the Sign In button
    @Test(priority = 3)
    public void testClickSignInButton() {
        homepage.WaitForElementToBeVisiable(homepage.signInButton, 15);
         homepage.clickSignIn();

    }
}

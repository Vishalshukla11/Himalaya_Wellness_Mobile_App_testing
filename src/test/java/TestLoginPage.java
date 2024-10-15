import BasePage.BaseClass;
import Pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseClass {

    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        // No need to call Initilition() again; it is shared.
        loginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void TestUsernametextField() {
        loginPage.EnterUseName();
    }

    @Test(priority = 2)
    public void TestPasswordtextField() {
        loginPage.EnterPassWord();
    }

    @Test(priority = 3)
    public void TestLoginBtn() {
        loginPage.EnterLoginBtn();
    }
}

import BasePage.BaseClass;
import Pages.PersonalCare;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPersonalCare extends BaseClass {
    WebDriver driver;
    PersonalCare personalCare;

    @BeforeClass
    public void Setup() {
        personalCare = new PersonalCare();
    }

    @Test(priority = 1)
    public void TestPersonalCare() {
        personalCare.clickPersonalCare();
    }
    @Test(priority = 2)
    public void TestClickProduct()
    {
        personalCare.ClickProduct();
    }

    @Test(priority = 3)
    public void AddproductIntoCart()
    {
        personalCare.addTocartbtn();
    }
    @Test(priority = 4)
    public void TestBackbtn()
    {
         personalCare.backbtn();

    }
}

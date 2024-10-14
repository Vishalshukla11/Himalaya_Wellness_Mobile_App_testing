import BasePage.BaseClass;
import Pages.PersonalCare;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPersonalCare extends BaseClass {
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
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
        personalCare.WaitForElementToBeVisiable(personalCare.addbtn,10);
        personalCare.addTocartbtn();
    }
    @Test(priority = 4)
    public void TestBackbtn()
    {
        personalCare.backbtn();
        personalCare.WaitForElementToBeVisiable(personalCare.backbtn,10);
        personalCare.backbtn();

    }
}

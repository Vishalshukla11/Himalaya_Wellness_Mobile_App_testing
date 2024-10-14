package Pages;

import BasePage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    WebElement Username;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    WebElement password;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView\n")
    WebElement loginBtn;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    public  void EnterUseName()
    {
        Username.sendKeys("Vishalshukla123@gmail.com");
    }
    public void EnterPassWord()
    {
        password.sendKeys("123456789");
    }
    public void EnterLoginBtn()
    {
        loginBtn.click();
    }
}

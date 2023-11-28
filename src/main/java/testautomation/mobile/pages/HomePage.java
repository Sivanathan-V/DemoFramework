package testautomation.mobile.pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testautomation.mobile.mobilebase.MobileBase;

@Data
public class HomePage extends MobileBase {


    public HomePage() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/chrome_search_hint_view")
    private WebElement txtSearchTab;
    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
    private WebElement txtSearchField;





    public void search(String platform) {
        mobileEnter(platform);

    }

    /*
     * By username = By.id("username"); public HomePage(AndroidDriver driver) {
     * this.driver=driver;
     *
     * }
     *
     * public void searching() { driver.findElement(username); }
     */


}

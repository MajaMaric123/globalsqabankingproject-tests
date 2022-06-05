import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerPage extends BasePage{

    private By addCustomerButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]");

    public CustomerPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isVisibleBankManagerLoginButton(){
        return getDriver().findElement(addCustomerButton).isDisplayed();
    }

    public void clickAddCustomerButton(){
        getDriver().findElement(addCustomerButton).click();
    }
}

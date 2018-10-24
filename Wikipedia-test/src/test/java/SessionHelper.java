import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void confirmLogin() {
        click(By.id("wpLoginAttempt"));
    }

    public void FillLoginForm(String user, String password) {
        type(By.cssSelector("input#wpName1"), user);
        type(By.cssSelector("input#wpPassword1"), password);
    }

    public void clickLoginButton() {
        click(By.cssSelector("li#pt-login"));
    }

    public boolean isLoggedIn() {
        return isElementPresent(By.xpath("//li[@id='pt-logout']"));
    }

    public void logout() {
        click(By.xpath("//li[@id='pt-logout']"));
    }
}


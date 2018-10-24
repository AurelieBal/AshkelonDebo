import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomeHelper extends HelperBase {
    private HelperBase sessionHelper;

    public WelcomeHelper(WebDriver driver) {
        super(driver);
    }


    public void clickOnFrenchLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-fr"));
    }

    public void clickOnEnglishLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-en"));
    }

    public void clickOnEspagnolLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-es"));
    }

    public void clickOnRussianLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-ru"));
    }

    public void clickOnChinsesLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-zh"));
    }

    public void clickOnPortuguesLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-pt"));
    }

    public void clickOnItalianLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-it"));
    }

    public void clickOnDeutchLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-de"));
    }

    public void clickOnJapaneseLink() {
        sessionHelper.click(By.cssSelector("a#js-link-box-ja"));
    }

    public void returnToPreviousPage() {
        driver.navigate().back();
    }


    public boolean onTheWelcomePage() {
        return sessionHelper.isElementPresent(By.cssSelector("a#js-link-box-en"));

    }
}

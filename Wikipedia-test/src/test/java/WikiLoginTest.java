import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiLoginTest extends TestBase
{

    @Test
    public void loginTest()
    {
        if(app.getWelcomeHelper().onTheWelcomePage())
        {
            app.getWelcomeHelper().clickOnEnglishLink();
        }

        if(app.getSessionHelper().isLoggedIn()){
            app.getSessionHelper().logout();
        }

        app.getSessionHelper().clickLoginButton();
        app.getSessionHelper().FillLoginForm("DeboTest", "Debo19!01");
        app.getSessionHelper().confirmLogin();

        Assert.assertTrue(app.getSessionHelper().isLoggedIn());
    }





}

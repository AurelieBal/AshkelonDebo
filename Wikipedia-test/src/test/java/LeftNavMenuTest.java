import org.testng.annotations.Test;

public class LeftNavMenuTest extends TestBase
{
    @Test
    public void interactionMenuTest() {
        app.getWelcomeHelper().clickOnEnglishLink();

        app.getLeftNavMenuHelper().getInteractionMenuItemsListVar1();

    }

        @Test
        public void interactionMenuTestVar1(){
        if(app.getWelcomeHelper().onTheWelcomePage())
        {
        app.getWelcomeHelper().clickOnEnglishLink();
        }
            app.getLeftNavMenuHelper().getInteractionMenuItemsListVar1();
        }









    @Test
        public void intractionMenuTestVar2(){
        if(app.getWelcomeHelper().onTheWelcomePage())
        {
        app.getWelcomeHelper().clickOnEnglishLink();
        }
            app.getLeftNavMenuHelper().getInteractionMenuItemsList();

        }


    }



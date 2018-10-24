import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLangageTests extends TestBase {
    @Test
    public void openHomepageOnEnglish() {

        app.getWelcomeHelper().clickOnEnglishLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://en.wikipedia.org/wiki/Main_Page";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

    @Test
    public void openHomepageOnJapanese() {

        app.getWelcomeHelper().clickOnJapaneseLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://ja.wikipedia.org/wiki/%E3%83%A1%E3%82%A4%E3%83%B3%E3%83%9A%E3%83%BC%E3%82%B8";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }




    @Test
    public void openHomepageOnDeutch() {

        app.getWelcomeHelper().clickOnDeutchLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://de.wikipedia.org/wiki/Wikipedia:Hauptseite";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

    @Test
    public void openHomepageOnItalian() {

        app.getWelcomeHelper().clickOnItalianLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://it.wikipedia.org/wiki/Pagina_principale";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

    @Test
    public void openHomepageOnPortugues() {

        app.getWelcomeHelper().clickOnPortuguesLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

    @Test
    public void openHomepageOnChinese() {

        app.getWelcomeHelper().clickOnChinsesLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://zh.wikipedia.org/wiki/Wikipedia:%E9%A6%96%E9%A1%B5";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

    @Test
    public void openHomepageOnRussian() {

        app.getWelcomeHelper().clickOnRussianLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

    @Test
    public void openHomepageOnEspagnol() {

        app.getWelcomeHelper().clickOnEspagnolLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://es.wikipedia.org/wiki/Wikipedia:Portada";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }


    @Test
    public void openHomepageOnFrench() {

        app.getWelcomeHelper().clickOnFrenchLink();

        String currentUrl = app.getCurrentUrl();
        String expectedURL = "https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";

        Assert.assertEquals(currentUrl, expectedURL);

        app.getWelcomeHelper().returnToPreviousPage();
    }

}

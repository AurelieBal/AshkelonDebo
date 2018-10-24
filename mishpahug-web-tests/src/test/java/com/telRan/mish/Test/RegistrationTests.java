package com.telRan.mish.Test;

import com.telRan.mish.Model.NotRegistredUserData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @BeforeMethod
    public void preCondition(){
        app.getSessionHelper().deleteCookies();
    }

    @AfterMethod
    public void postCondition() throws InterruptedException {
        app.getSessionHelper().logOut();
    }


    @Test
    public void registerFromHeaderTest() throws InterruptedException {
        String myEmail= "etr+" +System.currentTimeMillis()+"@gmail.com";
        System.out.println(myEmail);

        String password = "a123456";
        System.out.println(password);

        app.getUserHelper().clickOnCreateAccountButtonOnHeader();
        app.getUserHelper().FillCreateAccountForm(new NotRegistredUserData().setMyEmail(myEmail).setPassword("a123456").setPasswordRep("a123456"));
        app.getUserHelper().ClickOnRegistrationButton();

        Thread.sleep(2000);
        Assert.assertTrue(app.isHamburgerDisplayed());

        //Fill Account Form
        app.getUserHelper().fillPersonalInformationForm("Moshe", "Cohen", "0102030405",
                "Religious","1974","JAN","18");
        app.getUserHelper().fillAboutMyselfForm("In a relationship", "Kosher", "Female", "English");
    }





    @Test
    public void registrationFromLoginForm() throws InterruptedException {
       String myEmail= "etr+" +System.currentTimeMillis()+"@gmail.com";
       System.out.println(myEmail);

       String password = "a123456";
        System.out.println(password);

        app.getSessionHelper().clickOnLoginButtonOnHeader();
        Thread.sleep(2000);
        app.getUserHelper().OpenCreateAccountForm(); //cliquer sur alt + enter et creer
       Thread.sleep(2000);
       app.getUserHelper().FillCreateAccountForm(new NotRegistredUserData().setMyEmail(myEmail).setPassword("a123456").setPasswordRep("a123456"));
        Thread.sleep(2000);
       app.getUserHelper().ClickOnRegistrationButton();


       Assert.assertTrue(app.getUserHelper().isOnRegistrationPage());

  }



    @Test
    public void registrationFromCreateEvent(){

    }
}

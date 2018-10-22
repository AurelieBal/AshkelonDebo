package com.telRan.mish;

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
    public void postCondition(){
        app.getSessionHelper().logOut();
    }


    @Test
    public void registerFromHeaderTest(){
        String myEmail= "etr+" +System.currentTimeMillis()+"@gmail.com";
        System.out.println(myEmail);

        String password = "a123456";
        System.out.println(password);

        app.getUserHelper().clickOnCreateAccountButtonOnHeader();
        app.getUserHelper().FillCreateAccountForm(myEmail, "a123456", "a123456");
        app.getUserHelper().ClickOnRegistrationButton();

        Assert.assertTrue(app.isHamburgerDisplayed());
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
       app.getUserHelper().FillCreateAccountForm(myEmail, "a123456", "a123456");
        Thread.sleep(2000);
       app.getUserHelper().ClickOnRegistrationButton();


       Assert.assertTrue(app.getUserHelper().isOnRegistrationPage());



  }



    @Test
    public void registrationFromCreateEvent(){

    }
}

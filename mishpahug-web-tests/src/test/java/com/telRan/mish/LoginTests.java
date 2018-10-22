package com.telRan.mish;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod

    public void preconditions(){
        if(app.getSessionHelper().isLoggedIn()){
            app.getSessionHelper().logOut();
        }
    }

    @Test

    public void testLoginRegisteredUser() throws InterruptedException {
        app.getSessionHelper().clickOnLoginButtonOnHeader();
        app.getUserHelper().FillLogπinForm("qa15@bii.com", "a123456");
        app.submitLogin();

        Thread.sleep(3000);


       Assert.assertTrue(app.getSessionHelper().isLoggedIn());

    }




}

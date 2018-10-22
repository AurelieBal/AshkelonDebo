package com.telRan.mish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{

    public UserHelper(WebDriver wd) {
        super(wd);

    }

    public void ClickOnRegistrationButton() {
        wd.findElement(By.xpath("//span[contains(.,'Registration')]")).click();
    }

    public void FillCreateAccountForm(String myEmail, String password, String passwordRep) {

        type(By.cssSelector("[formcontrolname=email]"), myEmail);
        type(By.cssSelector("[formcontrolname=password]"), password);
        type(By.cssSelector("[formcontrolname=passwordRep"), passwordRep);

        // ces 3 lignes sont supprime grace a la methode type qui nous permet de reunir les 3 fonctions.

        // wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).click();
        //wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).clear();
        //wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).sendKeys(passwordRep);
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void clickOnCreateAccountButtonOnHeader() {
        wd.findElement(By.cssSelector("a.paddingLeft.hover.but.mat-button:last-child")).click();
    }

    public void OpenCreateAccountForm() {
        wd.findElement(By.xpath("//span[contains(text(),'Registration')]")).click();
    }

    public void FillLogπinForm(String email, String password) {
        type(By.cssSelector("input[formcontrolname=email]"),email);
        type(By.cssSelector("input[formcontrolname=password]"),password);
    }

    public boolean isOnRegistrationPage(){
        return isElementPresent(By.cssSelector(".avatar"));

    }

}

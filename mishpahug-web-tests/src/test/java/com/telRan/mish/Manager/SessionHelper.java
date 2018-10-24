package com.telRan.mish.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void deleteCookies() {
        wd.manage().deleteAllCookies();
    }


    public boolean isLoggedIn() {
        return isElementPresent(By.cssSelector("button [mattooltip='Menu']"));
    }

    public void clickOnLoginButtonOnHeader() {
        wd.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
    }

    public void clickOnLogOutButton() {
        wd.findElement(By.xpath("//span[contains(text(),'Log out')]")).click();

    }

    public void logOut() throws InterruptedException {
        Thread.sleep(3000);
        clickOnHamburgerButton();
        clickOnLogOutButton();
    }


    public void clickOnHamburgerButton() {
        wd.findElement(By.cssSelector("button [mattooltip='Menu']")).click();
    }


}

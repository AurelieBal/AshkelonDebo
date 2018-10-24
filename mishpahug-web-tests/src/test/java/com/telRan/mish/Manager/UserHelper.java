package com.telRan.mish.Manager;

import com.telRan.mish.Model.NotRegistredUserData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class UserHelper extends HelperBase{

    public UserHelper(WebDriver wd) {
        super(wd);

    }

    public void ClickOnRegistrationButton() {
        click(By.xpath("//span[contains(.,'Registration')]"));
    }

    public void FillCreateAccountForm(NotRegistredUserData notRegUser) {

        type(By.cssSelector("[formcontrolname=email]"), notRegUser.getMyEmail());
        type(By.cssSelector("[formcontrolname=password]"), notRegUser.getPassword());
        type(By.cssSelector("[formcontrolname=passwordRep"), notRegUser.getPasswordRep());

        // ces 3 lignes sont supprime grace a la methode type qui nous permet de reunir les 3 fonctions.

        // wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).click();
        //wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).clear();
        //wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).sendKeys(passwordRep);
    }

    public void clickOnCreateAccountButtonOnHeader() {
        click(By.cssSelector("a.paddingLeft.hover.but.mat-button:last-child"));
    }

    public void OpenCreateAccountForm() {
        click(By.xpath("//span[contains(text(),'Registration')]"));
    }

    public void FillLogπinForm(String email, String password) {
        type(By.cssSelector("input[formcontrolname=email]"),email);
        type(By.cssSelector("input[formcontrolname=password]"),password);
    }

    public boolean isOnRegistrationPage(){
        return isElementPresent(By.cssSelector(".avatar"));

    }

    public void fillPersonalInformationForm(String fName, String lName, String phone,
                                            String religious, String year, String month, String day) throws InterruptedException {
        type(By.id("inputFirstName"), fName);
        type(By.id("inputLastName"), lName);
        type(By.id("inputPhoneNumber"), phone);

        click(By.cssSelector("[placeholder=Confession]"));
        click(By.xpath("//*[contains(text(),'"+religious +"')]"));

        //date of birth
        enterDate(year, month, day);
    }

    //Status
    public void fillAboutMyselfForm(String status, String food, String gender, String languages) throws InterruptedException {
        chooseOption("Marital Status", status);
//        click(By.cssSelector("[placeholder='Marital Status']"));
//        click(By.xpath("//*[contains(text(),'"+status +"')]"));
        //Food
        chooseOption("Food Preferences",food);
//        click(By.cssSelector("[placeholder='Food Preferences']"));
//        click(By.xpath("//*[contains(text(),'"+food +"')]"));
        escape();

        //Gender
        chooseOption("Gender", gender);
//        waitAndClick(3000, By.cssSelector("[placeholder='Gender']"));
//        click(By.xpath("//*[contains(text(),'"+gender +"')]"));

        //languages
        chooseOption("Languages",languages);
        escape();

        //Message
        click(By.cssSelector("textarea"));
        type(By.cssSelector("textarea"),"string");
    }

    public void chooseOption(String field, String myChoice) {
        click(By.cssSelector("[placeholder='"+field+"']"));
        click(By.xpath("//*[contains(text(),'"+myChoice +"')]"));
    }
    public void chooseTwoOptions(String field, String myChoice, String myChoice2) {
        click(By.cssSelector("[placeholder='"+field+"']"));
        click(By.xpath("//*[contains(text(),'"+myChoice +"')]"));
        click(By.xpath("//*[contains(text(),'"+myChoice2 +"')]"));

    } public void chooseThreeOptions(String field, String myChoice, String myChoice2, String myChoice3) {
        click(By.cssSelector("[placeholder='"+field+"']"));
        click(By.xpath("//*[contains(text(),'"+myChoice +"')]"));
        click(By.xpath("//*[contains(text(),'"+myChoice2 +"')]"));
        click(By.xpath("//*[contains(text(),'"+myChoice3 +"')]"));
    }


    public void enterDate(String year, String month, String day) throws InterruptedException {
        click(By.xpath("//*[@aria-label='Open calendar']"));
        click(By.xpath("//*[@aria-label='Choose month and year']"));

        //select year
        while(!isYearPresent(year)){
            click(By.xpath("//*[@aria-label='Previous 20 years']"));
        }

        click(By.xpath("//*[contains(text(),'" + year + "')]"));

        waitAndClick(3000, By.xpath("//*[contains(text(),'" + month + "')]"));
        click(By.xpath("//div[contains(text(),'" + day + "')]"));
    }

    private boolean isYearPresent(String year) {

        return isElementPresent(By.xpath("//*[contains(text(),'" + year + "')]"));
    }

}



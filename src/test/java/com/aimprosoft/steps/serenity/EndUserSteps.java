package com.aimprosoft.steps.serenity;

import com.aimprosoft.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    SignInPage signinPage;

    //======================================================SignInPage===================================================

    @Step
    public void openSignInPage() {
        signinPage.open();
    }

    @Step
    public void loginAsuser() {
        signinPage.loginAsuser();
    }

    @Step
    public void clickOnLoginButton() {
        signinPage.clickOnLoginButton();
    }

    @Step
    public void homePageIsOpened() {
        Assert.assertTrue("False", signinPage.homePageIsOpened());
    }

    @Step
    public void userNameIsDisplayed(String arg0) {
        Assert.assertTrue("False", signinPage.userNameIsDisplayed(arg0));
    }

    @Step
    public void loginAsadmin() {
        signinPage.loginAsadmin();
    }
}
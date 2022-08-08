package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login()
    {
        PageFactory.initElements(Hooks.driver, this);
    }
    @FindBy(className = "ico-login")
    public WebElement loginLink;
    @FindBy(id = "Email")
    public WebElement validEmail;
    @FindBy(id = "Password")
    public WebElement validPassword;
    @FindBy(className = "login-button")
    public WebElement loginButton;
    @FindBy(id = "Email")
    public WebElement invalidEmail;
    @FindBy(id = "Password")
    public WebElement invalidPassword;
    @FindBy(className = "ico-account")
    public WebElement validMessage;
    @FindBy(className = "message-error")
    public WebElement invalidMessage;



}

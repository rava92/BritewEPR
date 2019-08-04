package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

        @FindBy(id = "login")
        public WebElement username;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(css = "button[type='submit']") //we ca use any locators here depends on unicness
        public WebElement submit;

        public void login (String username1,String password1){
            username.sendKeys(username1);
            password.sendKeys(password1);
            submit.click();
          WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
           wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        }


    }

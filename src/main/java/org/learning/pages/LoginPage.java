package org.learning.pages;

import org.learning.PageLocatorsLogin;
import org.learning.constants.LoginPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageLocatorsLogin {
    LoginPage loginPage ;
    
    
    
    public void init(LoginPage loginPage)
    {
    	this.loginPage = loginPage;
    }

    public  WebElement username(WebDriver driver) {
        //return driver.findElement(By.id(LoginPageConstants.username));
        return driver.findElement(loginPage.login);
    }


    public  WebElement password(WebDriver driver) {
        return driver.findElement(loginPage.password);
    }

    public  WebElement loginButton(WebDriver driver) {
        return driver.findElement(loginPage.login);
    }
}
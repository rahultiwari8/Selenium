package org.learning;

import org.learning.constants.LoginPageConstants;
import org.openqa.selenium.By;

public class PageLocatorsLogin {

    protected By username = By.id(LoginPageConstants.username);
    protected By password = By.id(LoginPageConstants.password);
    protected By login = By.id(LoginPageConstants.loginButton);
}

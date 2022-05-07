package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.learning.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver   driver;
    LoginPage   loginPage;
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        loginPage.username(driver).sendKeys("Admin");
        loginPage.password(driver).sendKeys("admin123");

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.loginButton(driver).click();
    }


    @Then("I should see the dashboard page")
    public void i_should_see_the_dashboard_page() {
        driver.quit();
    }

}

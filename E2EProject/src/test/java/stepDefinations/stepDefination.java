package  stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class stepDefination extends Base {

    @Given("^Initialize browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
    	driver=initialisedriver();
    }

    

    @Then("^verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }


    @And("^Navigate \"([^\"]*)\" site$")
    public void navigate_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^click on login link in home page to land on sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_sign_in_page() throws Throwable {
    	LandingPage L= new LandingPage(driver);
    	LoginPage lo=L.getLogin();
    }
    
    @When("^user enters (.+) and (.+) and logs in $")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
        LoginPage p =new LoginPage(driver);
    	
    	p.getemail().sendKeys(username);
		p.getpass().sendKeys(password);
    }
    
    @And("^close all browserss$")
    public void close_all_browserss() throws Throwable {
        driver.quit();
    }

}
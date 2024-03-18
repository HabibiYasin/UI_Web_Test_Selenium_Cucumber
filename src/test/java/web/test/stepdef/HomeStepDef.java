package web.test.stepdef;

import io.cucumber.java.en.When;
import web.test.BaseTest;
import web.test.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @Then("user can see product image")
    public void userCanSeeProductImage() {
        homePage = new HomePage(driver);
        homePage.validateImageProduct();
    }

    @When("homepage is loaded")
    public void homepageIsLoaded() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }


    @When("user going to main page without login")
    public void userGoingToMainPageWithoutLogin() {
        homePage = new HomePage(driver);
        homePage.goToHomePage();
    }


    @Then("user can see product price")
    public void userCanSeeProductPrice() {
        homePage = new HomePage(driver);
        homePage.validatePriceProduct();
    }
}

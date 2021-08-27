package Steps;

import Pages.PHPTrevelersPages;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import util.Driver;

public class WhenSteps {

    @When("^Hover mouse over \"FEATURES\" drop-down from top-menu$")
    public void hoverFeatures(){
        PHPTrevelersPages.hoverFeatureMenu();
    }

    @When("^IClick on the \"CHECKOUT PRICING\" on the bottom of the page$")
    public void checkoutPrice(){
        PHPTrevelersPages.clickCheckoutPricing();
    }
    @When("^I Click the ORDER NOW button from the \"Standalone Web Application\"$")
    public void clickOrderNow() {

        PHPTrevelersPages.clickOrderNow();
    }

    @When("^On the configure page click Continue$")
    public void continueButtonClick(){
        PHPTrevelersPages.clickContinue();
    }

    @When("^Click the Checkout button$")
    public void clickCheckoutButton(){
        PHPTrevelersPages.checkoutButtonClick();
    }

    @When("^Complete all the fields$")
    public void completeAllFields() throws InterruptedException {
        PHPTrevelersPages.completeFields();
    }

//    @When("^I complete order$")
//    public void cartCheckOut(){
//        PHPTrevelersPages.cardCheckout();
//    }
}

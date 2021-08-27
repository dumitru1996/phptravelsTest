package Steps;

import Pages.PHPTrevelersPages;
import cucumber.api.java.en.Then;

public class ThensSteps {

    @Then("^Choose option \"Flights Module\"$")
    public void clickFlightsModule(){
        PHPTrevelersPages.clickFlightsModule();
    }

    @Then("^Check if the details on invoice are the right one$")
    public void checInvoice(){
        PHPTrevelersPages.compareInvoice();
    }



}

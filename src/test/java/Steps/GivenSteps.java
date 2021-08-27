package Steps;

import Pages.PHPTrevelersPages;
import cucumber.api.java.en.Given;

public class GivenSteps {

    @Given("^Navigate to phptravels.com/demo$")
    public void givenNavigatePHPTravelPage(){
        PHPTrevelersPages.initializePHPTravelsPage();
    }

}

package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static util.Driver.startDriver;
import static util.Driver.stopDriver;

public class BeforeAfterSteps {

    @Before
    public void beforephpTravelTest(){

        startDriver();
    }

    @After
    public void afterphpTravelTest(){

        stopDriver();
    }


}

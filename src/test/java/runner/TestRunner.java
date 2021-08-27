package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/FeatureFile"},
        glue = {"Steps"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)

public class TestRunner {

    @Test(groups = "examples-testing", description = "Example of using TestNGCucumberRunner to invoke Cucumber")
    public void runCukes() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }

}
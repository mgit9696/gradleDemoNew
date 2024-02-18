package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/resources/test.feature"},
        glue={"stepDefinition"},
        plugin = {"pretty",
                //"usage",
                "html:build/reports/CucumberSpecificReport/Cucumbertestreport.html" // will generate html report in cucumberspecific report folder - other configuration has been done in build.gradle
                , "json:build/reports/CucumberSpecificReport/CucumberJson/cucumber.json" // will generate json report in cucumberspecific report folder - other configuration has been done in build.gradle
        },
        tags = "@testFeature"
        )
public class TestRunner {
}

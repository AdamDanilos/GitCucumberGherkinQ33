package CucumberOptios;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Scenario/Login/GoogleSearchOutline",
        glue="gui",stepNotifications = true)

public class TestRunner {
}

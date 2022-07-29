package CucumberOptios;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Scenario/Login/GoogleSearchOutline",
glue="gui")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}

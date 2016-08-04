package stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "pretty", "html:reports/html-report" }, tags = { "@navpg, @ios"})
public class RunCukesTest {

}
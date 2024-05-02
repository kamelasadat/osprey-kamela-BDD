package Tek.BDD.FinalProject.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("classpath:features"),
        glue = "Tek.BDD.FinalProject.steps",
        tags = "@Regression",
        dryRun =false,
        plugin  ={
                "pretty",
                "html:target/html_report/index.html",
                "json:target/jsonReports/report.json"
        }
        )
public class TestRunner {
}
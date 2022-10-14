package metka.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber.json",
               "html:target/cucumber-report.html",
               "rerun:target/rerun.txt",
               "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "junit:target/junit/junit-report.xml",
 },
        features = "src/test/resources/features",
        glue = "metka/step_definitions",
        dryRun = false,
        tags = "@smoke"

//        publish = false

)
public class CukesRunner {
}



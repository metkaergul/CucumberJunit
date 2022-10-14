package metka.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
              "html:target/cucumber-report.html"
        },
        dryRun = false,
        features ="src/test/resources/features" ,
        glue = "metka/step_definitions",
        tags = "@salesManager"


)
public class StudyLoginRunner {




}



package domain.app.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features" ,
        glue = "domain/app/step_definitions",
        dryRun = true,
        tags = "@wip",
        publish = true // will publish reports in the browser

)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}



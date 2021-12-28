package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/HP/IdeaProjects/TesteVasco/src/main/java/features",
        glue = {"Steps"},
        format = {"pretty", "html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
        monochrome = true,
        strict = true,
        dryRun = false
        )

public class TestRunner {

}

package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:/Users/HP/IdeaProjects/TesteVasco/src/main/java/features", glue = {"Steps"})

public class TestRunner {

}

package runnerclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\sivanarayana.g\\IdeaProjects\\untitled1\\Collinson_HK\\src\\main\\java\\features\\Okura.feature",
        glue = "",
        tags="@Collinson_sample", plugin = { "pretty","html:target/cucumber-reports" },
        monochrome = true)

public class Runnerclass {
}

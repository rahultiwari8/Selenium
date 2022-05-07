package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = {"stepDef"},monochrome = true,plugin = {"pretty","html:target/cucumber-html-report"})
public class Runner {
}

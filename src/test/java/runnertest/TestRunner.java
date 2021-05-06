package runnertest;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(// This creates cucumber reports
        plugin = {"json:target/cucumber-html-reports/cucumber.json"},
        //This create auto method name in camelCase

        monochrome = true,
        dryRun = false,
        //Path to your feature file
        features = {"src/test/resources/features"},

        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepdefinitions"}

)


public class TestRunner {



}

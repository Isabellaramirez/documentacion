package co.com.saucedemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Process.feature",
        glue = {"co.com.saucedemo.stepsdefinitions", "co.com.saucedemo.utils.hooks"},
        snippets = SnippetType.CAMELCASE)
public class ProcessRunner {
    }


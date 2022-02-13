package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="ShoppingCart/OpenCart.feature",glue= {"defination"},dryRun = false,         
monochrome=true)
public class Runner {

}

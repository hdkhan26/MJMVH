package com.syntax.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/Recquirment.feature"}
				, glue= {""}
				, plugin="pretty"
				, dryRun=true)

public class TestRunner {

}

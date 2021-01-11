package com.seleniumautomation.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",glue={"com/seleniumautomation/StepDefinition"},
        tags = {
//                "@facebook",
//                "@guru99popup",
                "@newbranch"
        }
)

public class Runner {

}
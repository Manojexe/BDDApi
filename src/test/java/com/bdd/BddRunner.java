package com.bdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="src/test/resources/BddFeature",
	glue= {"com.bdd"},
	tags="@tag1",
	plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"}
)
public class BddRunner {
	

}

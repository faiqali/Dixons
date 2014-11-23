package com.dixons.dixonsAutomationPrototype;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@Cucumber.Options(
		format ={"pretty","html:target/html/", "json:target/json/output.json"},
		features ={"src/test/resource"})

public class RunnerTest {

}

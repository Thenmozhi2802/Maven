package com.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
glue="com.adactin.stepdefinition",monochrome=true,dryRun=false,plugin= {"pretty"})
public class AdactinRunner {


}

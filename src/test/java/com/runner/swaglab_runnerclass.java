package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\SABARUL\\eclipse-workspace\\swag\\feautrefile\\Swaglabs.feature",
		glue = "com.SwagLabStepDefinition", 
		dryRun=false,
		publish=true,
		monochrome=true,
		plugin= {"html:Reports/swaglabs.html"})
		


public class swaglab_runnerclass {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	
	public static void tear_down() {
		
		
	}
	
	

}

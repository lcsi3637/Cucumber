package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class GoogleStepDefinitions {

    @Given("User is on the google search page")
public void user_is_on_the_google_search_page() {
//OPENING BROWSER IS GOOGLE
        Driver.getDriver().get("https://www.google.com");
Assert.fail("UNPURPOSE FAILING HERE AT THE GIVEN STEPS");
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
//comparnig actual titles

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Google";

       //Assert.fail("MY CUSTOM FAIL FROM MY ASSERT FAIL");
        //Both Assertions is not needed Just for the Example's scens
        Assert.assertTrue("Actual title does not match expected title",actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title",actualTitle,expectedTitle);

        }



}

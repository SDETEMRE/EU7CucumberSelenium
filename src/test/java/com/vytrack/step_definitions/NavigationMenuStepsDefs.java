package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepsDefs {

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("the user navigates to Fleet, Vehicles");
    }

    @Then("user should see vehicles page")
    public void user_should_see_vehicles_page() {
        System.out.println("user should see vehicles page");
    }

    @When("user navigates to Marketing, Campaigns")
    public void user_navigates_to_Marketing_Campaigns() {
        System.out.println("user navigates to Marketing, Campaigns");
    }

    @Then("user should see Campaigns")
    public void user_should_see_Campaigns() {
        System.out.println("user should see Campaigns");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("title should be Calendars");
    }
}

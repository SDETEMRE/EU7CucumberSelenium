package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        //selenium code
        System.out.println("the user navigates to Fleet, Vehicles");
    }
    @Then("user should see vehicles page")
    public void user_should_see_vehicles_page() {
        System.out.println("see the vehicles page");
    }
    @When("user navigates to Marketing, Campaigns")
    public void user_navigates_to_Marketing_Campaigns() {
        System.out.println("campaign");
    }


    @Then("user should see Campaigns")
    public void user_should_see_Campaigns() {
        System.out.println("campaign");
    }


    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");

    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("Expected and Actual title are matching");
    }


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);

    }


    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        BrowserUtils.waitFor(3);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);
    }

}

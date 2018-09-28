package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableStepsExample {

    @Given("I have filled in the following address")
    public void fillInAddress(List<Map<String, String>> tableWithKeys) {
        Map<String, String> firstRow = tableWithKeys.get(0);

        System.out.println(firstRow.get("house_number"));
        System.out.println(firstRow.get("street_name"));
    }

    @When("I select address type")
    public void selectAddress() {
        // When glue code in here
    }

    @Then("I will be presented with three address types")
    public void addressTypes(List<String> listOfRows) {
        System.out.println(listOfRows.get(0));
        System.out.println(listOfRows.get(1));
    }

}

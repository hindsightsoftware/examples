package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DocStringStepsExample {

    @Given("I have filled in the address details form")
    public void fillInForm() {
        // Given glue code in here
    }

    @When("I submit the form")
    public void submitForm() {
        // When glue code in here
    }

    @Then("the address is processed and I receive the message")
    public void docStringDemo(String docString) {
        System.out.println(docString);
    }

}

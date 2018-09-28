package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;

public class DataInStepsStepsExample {

    @Given("I have {string} addresses")
    public void setAddresses(String addresses) {
        System.out.println(addresses);
    }

    @When("I add my {string} address")
    public void addAddress(String address) {
        System.out.println(address);
    }

    @Then("I will have {string} addresses")
    public void countAddresses(String addresses) {
        System.out.println(addresses);
    }

    @Given("I have a ([a-z]+)")
    public void checkFruit(String fruit) {
        System.out.println(fruit);
    }

    @When("I take an apple")
    public void takeFruit() {
        // When glue code here
    }

    @Then("I have an ([a-z]+) and a ([a-z]+)")
    public void checkFruits(String fruit1, String fruit2) {
        System.out.println(fruit1);
        System.out.println(fruit2);
    }

    @Given("I have divided the number {int} in half")
    public void setSum(Integer integerNumber) {
        System.out.println(integerNumber);
    }

    @Then("I will have a result of {float}")
    public void evalOutput(float floatNumber) {
        System.out.println(floatNumber);
    }


}

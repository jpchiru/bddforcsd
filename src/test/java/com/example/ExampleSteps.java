package com.example;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class ExampleSteps {
//    private Example _target;
//    private String _actualResult;
    @Given("^I am officiating a FizzBuzz game$")
    public void I_am_officiating_a_FizzBuzz_game() {
        System.out.println("I am in Given");
//        _target = new Example();
    }
    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int playedNumber) {

        System.out.println("I am in When");
//        _actualResult = _target.checkPlay(playedNumber);
    }

    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String expectedResult) {
        System.out.println("I am in Then");
//        assertEquals(expectedResult, _actualResult);
    }

//    @Given("^I am officiating a FizzBuzz game$")
//    public void I_am_officiating_a_FizzBuzz_game() throws Throwable {
//        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
//    }
//
//    @When("^the number (\\d+) is played$")
//    public void the_number_is_played(int arg1) throws Throwable {
//        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
//    }
//
//    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
//    public void I_should_be_told_the_correct_answer_is(String arg1) throws Throwable {
//        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
//    }

}
package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import logictest.LogicTest;
import org.junit.Assert;

public class StepDefinition {
    LogicTest logictest = new LogicTest();

    @Given("test given")
    public void testGiven() {
        logictest.testLogic();
    }

    @When("test when")
    public void testWhen() {

        logictest.testLogic2();
//        Assert.assertEquals(10,12);
    }
}

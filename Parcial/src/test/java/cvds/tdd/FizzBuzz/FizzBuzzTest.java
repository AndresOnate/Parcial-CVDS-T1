package cvds.tdd.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_ReturnFizz_When_MultipleOfThreeOnly() {
        
        //Arrange
        int input = 9;
        String expectedOutput = "..Fizz..";

        //Action

        String result = fizzBuzz.validateInput(input);
        
        //Assertion

        Assert.assertEquals(expectedOutput, result);
        
    }

    @Test
    public void should_ReturnFizz_When_NumberContainsThreeOnly() {
        
        //Arrange
        int input = 31;
        String expectedOutput = "..Fizz..";

        //Action

        String result = fizzBuzz.validateInput(input);
        
        //Assertion

        Assert.assertEquals(expectedOutput, result);
        
    }

    @Test
    public void should_ReturnBuzz_When_MultipleOFiveOnly() {
        
        //Arrange
        int input = 10;
        String expectedOutput = "..Buzz..";

        //Action

        String result = fizzBuzz.validateInput(input);
        
        //Assertion

        Assert.assertEquals(expectedOutput, result);
        
    }

    @Test
    public void should_ReturnBuzz_When_NumberContainsOFiveOnly() {
        
        //Arrange
        int input = 52;
        String expectedOutput = "..Buzz..";

        //Action

        String result = fizzBuzz.validateInput(input);
        
        //Assertion

        Assert.assertEquals(expectedOutput, result);
        
    }

    @Test
    public void should_ReturnFizzBuzz_When_MultipleOFiveandThree() {
        
        //Arrange
        int input = 15;
        String expectedOutput = "FizzBuzz";

        //Action

        String result = fizzBuzz.validateInput(input);
        
        //Assertion

        Assert.assertEquals(expectedOutput, result);
        
    }

    @Test
    public void should_ReturnFizzBuzz_When_ContainsFiveandThree() {
        
        //Arrange
        int input = 35;
        String expectedOutput = "FizzBuzz";

        //Action

        String result = fizzBuzz.validateInput(input);
        
        //Assertion

        Assert.assertEquals(expectedOutput, result);
        
    }
    
}
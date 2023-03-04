package cvds.tdd;

import cvds.tdd.FizzBuzz.FizzBuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 1; i <= 100; i++){
            String result = fizzBuzz.validateInput(i);
            System.out.println(result);
        }
        
    }
}

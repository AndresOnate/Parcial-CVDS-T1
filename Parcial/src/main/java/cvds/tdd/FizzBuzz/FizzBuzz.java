package cvds.tdd.FizzBuzz;

public class FizzBuzz {
    

    public String validateInput(int number){

        boolean multipleOfthree = isMultipleOfThree(number);
        boolean multipleOfFive = isMultipleOfFive(number);
        boolean containsThree = validateThreeInNumber(number);
        boolean containsFive = validateFiveInNumber(number);

        if ( (multipleOfFive && multipleOfthree) || (containsFive && containsThree)){
            return "FizzBuzz";
        } else if (multipleOfthree || containsThree){
            return "Fizz";
        }else if (multipleOfFive|| containsFive){
            return "Buzz";
        }
        return "";
    }

    public boolean isMultipleOfThree(int number){
        return number % 3 == 0;
    }

    public boolean isMultipleOfFive(int number){
        return number % 5 == 0;
    }

    public boolean validateThreeInNumber(int number){
        int slice = 0;
        while (number > 0) {
            slice = number % 10;
            if (slice == 3) {
              return true;
            }
            number = number / 10;
          }
        return false;
    }

    public boolean validateFiveInNumber(int number){
        while (number > 0) {
            int slice = number % 10;
            if (slice == 5) {
              return true;
            }
            number = number / 10;
          }
        return false;
    }
}
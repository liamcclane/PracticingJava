public class FizzBuzz{
    public String fizzBuzz(int number){
        String outString = "";

        if (number%3==0){
            outString ="Fizz";
        }
        if (number%5==0){
            outString = outString+"Buzz";
        }
        if(number%3 != 0 && number%5 !=0){
            outString = String.format("%d", number);
        }

        return outString;
    }
}
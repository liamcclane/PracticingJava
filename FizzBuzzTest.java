public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzzObject = new FizzBuzz();

        String result = fizzBuzzObject.fizzBuzz(3);
        System.out.println(result);

        String result2 = fizzBuzzObject.fizzBuzz(5);
        System.out.println(result2);

        String result3 = fizzBuzzObject.fizzBuzz(15);
        System.out.println(result3);

        String result4 = fizzBuzzObject.fizzBuzz(2);
        System.out.println(result4);

        String result5 = fizzBuzzObject.fizzBuzz(300);
        System.out.println(result5);

    }

}
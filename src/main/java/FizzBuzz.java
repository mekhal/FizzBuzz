public class FizzBuzz {

    public String say(int number) {
        String result = Integer.toString(number);
        if (number % 3 == 0)
            result = "Fizz";
        if (number % 5 == 0)
            result = "Buzz";
        return result;
    }
}

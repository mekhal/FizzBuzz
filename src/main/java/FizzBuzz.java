public class FizzBuzz {

    public String say(int number) {
        String result = "";
        if (isDivideByThree(number))
            result = "Fizz";
        if (isDivideByFive(number))
            result += "Buzz";
        if (isEmpty(result))
            result = Integer.toString(number);
        return result;
    }

    private boolean isEmpty(String result) {
        return result == "";
    }

    private boolean isDivideByFive(int number) {
        return number % 5 == 0;
    }

    private boolean isDivideByThree(int number) {
        return number % 3 == 0;
    }
}

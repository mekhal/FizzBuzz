public class FizzBuzz {

    public String say(int number) {
        String result = "";
        if (number % 3 == 0)
            result = "Fizz";
        if (number % 5 == 0)
            result += "Buzz";
        if (result == "")
            result = Integer.toString(number);
        return result;
    }
}

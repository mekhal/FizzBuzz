public class FizzBuzz {

    public String say(int number) {
        String resource = Integer.toString(number);
        if (number == 3)
            resource = "Fizz";
        if (number == 5)
            resource = "Buzz";
        return resource;
    }
}

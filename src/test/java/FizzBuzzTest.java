import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void put_1_return_1(){
        assertEquals("1",fizzbuzz.say(1));
    }

    @Test
    public  void put_2_return_2(){
        assertEquals("2",fizzbuzz.say(2));
    }

    @Test
    public  void put_3_return_Fizz(){
        assertEquals("Fizz",fizzbuzz.say(3));
    }

    @Test
    public  void put_5_return_Buzz(){
        assertEquals("Buzz",fizzbuzz.say(5));
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void put_1_return_1(){
        assertEquals("1",fizzbuzz.say(1));
    }

    @Test
    public void put_2_return_2(){
        assertEquals("2",fizzbuzz.say(2));
    }

    @Test
    public void put_3_return_Fizz(){
        assertEquals("Fizz",fizzbuzz.say(3));
    }

    @Test
    public void put_5_return_Buzz(){
        assertEquals("Buzz",fizzbuzz.say(5));
    }

    @Test
    public void put_6_return_Fizz(){
        assertEquals("Fizz",fizzbuzz.say(6));
    }

    @Test
    public void put_9_return_Fizz(){
        assertEquals("Fizz",fizzbuzz.say(9));
    }

    @Test
    public void put_10_return_Buzz(){
        assertEquals("Buzz",fizzbuzz.say(10));
    }

    @Test
    public void put_15_return_FizzBuzz(){
        assertEquals("FizzBuzz",fizzbuzz.say(15));
    }

    @Test
    public void put_30_return_FizzBuzz(){
        assertEquals("FizzBuzz",fizzbuzz.say(30));
    }
}

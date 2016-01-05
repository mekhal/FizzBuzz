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
}

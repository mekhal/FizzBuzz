import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void put_1_return_1(){
        String expected = "1";
        FizzBuzz fizzbuzz = new FizzBuzz();

        String actual = fizzbuzz.say(1);

        assertEquals(expected,actual);
    }
}

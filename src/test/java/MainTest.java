import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class MainTest {

    @Test
    void sum_shouldReturn8_whenCalledWith5And3(){

        int expected = 8;
        int a = 5;
        int b = 3;

        int actual = Main.sum(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWith4And3(){

        boolean expected = true;

        boolean actual = Main.isEven(4);

        assertTrue(actual);
    }

    @Test
    void product_shouldReturn15_whenCalledWith5And3() {
        int expected = 15;
        int a = 5;
        int b = 3;

        int actual = Main.product(a, b);

        assertEquals(expected, actual);
    }


    @Test
    void toUppercase_shouldReturnUpperCase_whenCalledHello() {

        String input = "hello";
        String expected = "HELLO";

        String actual = Main.toUppercase(input);

        assertEquals(expected, actual);
    }


    @Test
    void isPositive_shouldReturnTrue_whenCalledWithPositiveNumber() {

        boolean actual = Main.isPositive(5);

        assertTrue(actual);
    }

}

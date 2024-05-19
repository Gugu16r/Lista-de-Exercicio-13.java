package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoTest {
    Calculadora calc = new Calculadora();

    @Test
    public void soma(){
        assertEquals(2, calc.soma(1, 1));
    }

    @Test
    public void subtrair(){
        assertEquals(2, calc.subtrair(4, 2));

    }
    @Test
    public void multiplicar () {
        assertEquals(25, calc.multiplicar(5, 5));
    }
}

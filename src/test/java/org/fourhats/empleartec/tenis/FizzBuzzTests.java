package org.fourhats.empleartec.tenis;
import org.fourhats.empleartec.ConversorArabigo;
import org.fourhats.empleartec.FizzBuzz;
import org.fourhats.empleartec.StringCalculator;
import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTests {
    @Test
    public void debeConvertirRango() {
        chequear(1, "1");
        chequear(2, "2");
        chequear(4, "4");
        chequear(6, "Fizz");
        chequear(7, "7");
        chequear(8, "8");
        chequear(9, "Fizz");
        chequear(10, "Buzz");
        chequear(3, "Fizz");
        chequear(5, "Buzz");
        chequear(30, "Fizz");
        chequear(55, "Buzz");
        chequear(100, "Buzz");
    }
    public void chequear(int numero, String esperado) {
        //Given
        FizzBuzz conversor = new FizzBuzz();
        //When
        String numberOut = conversor.toString(numero);
        //Then
        Assert.assertEquals("El numero " + numero + " es " + esperado + " resultado", esperado, numberOut);
    }
}
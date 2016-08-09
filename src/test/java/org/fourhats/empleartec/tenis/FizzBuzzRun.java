package org.fourhats.empleartec.tenis;
import org.fourhats.empleartec.ConversorArabigo;
import org.fourhats.empleartec.FizzBuzz;
import org.fourhats.empleartec.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzRun {
    @Test
    public void mostrar() {
        //Given
        FizzBuzz conversor = new FizzBuzz();
        //When
        for (int i = 1; i < 101; i++) {
            String numberOut = conversor.toString(i);
            System.out.println(numberOut);
        }
        //Then
        Assert.assertTrue("OK",true); // do nothing
    }
}

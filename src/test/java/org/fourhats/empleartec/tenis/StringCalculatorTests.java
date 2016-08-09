package org.fourhats.empleartec.tenis;
import org.fourhats.empleartec.StringCalculator;
import org.junit.Assert;
import org.junit.Test;
public class StringCalculatorTests {
    @Test
    public void debeConvertirRango() {
        chequear("1,-2", -1);
        chequear("1,2 , 3", 6);
        chequear("", 0);
        chequear("1,1", 2);
        chequear("1,1,2", 4);
        chequear("1000,1", 1001);
        chequear("1,2,3,4,5,6,7,8,9", 45);
     }
    public void chequear(String miarray, int esperado) {
        //Given
        StringCalculator suma = new StringCalculator();
        //When
        int numeroSuma = suma.toSuma(miarray);
        //Then
        if(esperado == 0){
            System.out.println(" ");
        }else {
            Assert.assertEquals("La suma " + miarray + " es " + esperado + " total", esperado, numeroSuma);
        }
    }
}
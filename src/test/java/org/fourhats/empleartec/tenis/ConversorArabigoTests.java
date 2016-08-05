package org.fourhats.empleartec.tenis;


import org.fourhats.empleartec.ConversorArabigo;
import org.junit.Assert;
import org.junit.Test;

public class ConversorArabigoTests {


    @Test
    public void debeConvertirRango() {
        chequear(1, "I");
        chequear(2, "II");
        chequear(3, "III");
        chequear(4, "IV");
        chequear(5, "V");
        chequear(6, "VI");
        chequear(7, "VII");
        chequear(8, "VIII");
        chequear(9, "IX");
        chequear(10, "X");
    }

    public void chequear(int numero, String esperado) {
        //Given
        ConversorArabigo conversor = new ConversorArabigo();
        //When
        String numeroRomano = conversor.toRoman(numero);

        //Then
        Assert.assertEquals("El numero " + numero + " es " + esperado + " en Romano", esperado, numeroRomano);
    }

}

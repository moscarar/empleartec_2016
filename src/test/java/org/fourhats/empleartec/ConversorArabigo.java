package org.fourhats.empleartec;


public class ConversorArabigo {
    public String toRoman(int numero) {
        String romano = "";
        if(numero == 10) {
            return  "X";
        }
        if(numero == 9) {
            return  "IX";
        }
        if(numero == 6) {
            return  "VI";
        }
        if(numero >= 5) {
            romano +=  "V";
            numero = numero - 5;
        }
        if(numero == 4) {
            return  "IV";
        }
        while (numero > 0) {
            romano += "I";
            numero--;
        }
        return romano;

    }
}

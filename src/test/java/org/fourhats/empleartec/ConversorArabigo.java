package org.fourhats.empleartec;
import java.util.*;
public class ConversorArabigo {
    private static Map<Integer, String> diccionario;
    static{
        diccionario = new HashMap<Integer, String>() ;
        diccionario.put(1, "I");
        diccionario.put(4, "IV");
        diccionario.put(5, "V");
        diccionario.put(9, "IX");
        diccionario.put(10, "X");
        diccionario.put(40, "XL");
        diccionario.put(50, "L");
       }
    public String toRoman(int numero) {
        String romano = "";
        ArrayList<Integer> numeros = new ArrayList<>(diccionario.keySet());
        Collections.sort(numeros,Collections.reverseOrder());
        for (Integer numeroActual:numeros){
            while (numero >= numeroActual) {
                romano += diccionario.get(numeroActual);
                numero = numero - numeroActual;
            }
        }
        return romano;
    }
}
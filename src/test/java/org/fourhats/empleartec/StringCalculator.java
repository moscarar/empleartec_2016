package org.fourhats.empleartec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class StringCalculator {
    int suma = 0;
    public int toSuma(String miArray) {
        if (miArray != "") {
            String[] strArray = miArray.split(",");
            for(int i = 0; i < strArray.length; i++) {
                suma +=  Integer.parseInt( strArray[i].trim());
            }
            return suma;
        }else{
            return 0;
        }
     }
}
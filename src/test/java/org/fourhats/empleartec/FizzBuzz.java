package org.fourhats.empleartec;
import java.util.*;
public class FizzBuzz {
    public String toString(int i) {
        String esperado = "";
        if (i % 3 == 0 || i % 5 == 0) {
            esperado = (i % 3 == 0) ? "Fizz" : "Buzz";
        } else {
            esperado = String.valueOf(i);
        }
        return esperado;
    }
}
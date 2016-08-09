package org.fourhats.empleartec;
import java.util.*;

public class TableroTenis {
    public static int puntos1=0;
    public static int puntos2=0;
    static String marcador[]={"0","15","30","40","Ganador Jugador"};
    public String marcador(int jugador, int punto) {
        String tablero = "";
        if (jugador == 1) {
            puntos1 = Integer.valueOf(punto);
        } else {
            puntos2 = Integer.valueOf(punto);
        }
        if (punto == 4){
            tablero = (jugador == 1) ? marcador[puntos1] + " " + String.valueOf(jugador) : marcador[puntos2] + " " + String.valueOf(jugador);
            puntos1 = puntos2 = 0;
        } else {
            tablero = marcador[puntos1] + " - " + marcador[puntos2];
        }
        return tablero;
    }
}
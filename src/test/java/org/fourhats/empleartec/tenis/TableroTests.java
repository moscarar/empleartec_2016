package org.fourhats.empleartec.tenis;

import org.fourhats.empleartec.Tablero;
import org.junit.Assert;
import org.junit.Test;


public class TableroTests {

    @Test
    public void debe_inicializar_un_tablero_en_0_0() {

        //Given - Dado
        Tablero tablero = new Tablero();
        //When - Cuando
        String marcador = tablero.marcador();
        //Then - Entonces

        Assert.assertEquals("El tablero dice cero iguales", "0 - 0", marcador);
    }
}

package org.fourhats.empleartec.tenis;
import org.fourhats.empleartec.ConversorArabigo;
import org.fourhats.empleartec.FizzBuzz;
import org.fourhats.empleartec.StringCalculator;
import org.fourhats.empleartec.TableroTenis;
import org.junit.Assert;
import org.junit.Test;
public class TableroTenisTest {
        @Test
        public void debeConvertirRango(){
            chequear(1,0,"0 - 0");
            chequear(1,1,"15 - 0");
            chequear(1,2,"30 - 0");
            chequear(1,3,"40 - 0");
            chequear(1,4,"Ganador Jugador 1");
            chequear(2,0,"0 - 0");
            chequear(2,1,"0 - 15");
            chequear(2,2,"0 - 30");
            chequear(2,3,"0 - 40");
            chequear(2,4,"Ganador Jugador 2");
        }
        public void chequear(int jugador, int punto, String esperado) {

            //Given - Dado
            TableroTenis tablero = new TableroTenis();
            //When - Cuando
            String marcador = tablero.marcador(jugador, punto);
            //Then - Entonces
            System.out.println(marcador);
        }
}

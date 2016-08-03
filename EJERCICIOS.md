```
Para practicar TDD se proponen una serie de ejercios, estos deberan realizarse respetando los ciclos Red, Green y Blue
Se debe trabajar de al menos 2 personas. 
Utilize Pomodoros de 25 Minutos
````
# Tablero de Tenis

Ejemplos:
* "0 - 0"
* "15 - 0"
* "30 - 0"
* "40 - 0"
* "Ganador Jugador 1"
 
>Sin Tiebreak

# String Calculator

1) Crear un metodo con la siguiente definicion int add(String numbers)
El metodo retornara un entero (int) con la suma de los numeros incluidos
Puede sumar 0 , 1 , 2 o 3 numeros.

Ejemplo:
* "" or "1" or "1,2" or "8,3,9" 
* El caso de "" retorna
* El caso de "1,2" retorna 3
* El caso de "8,3,9" Retorna 20

2) Agrega el soporte del caracter "New Line" \n

Ejemplo: 
* "1\n2,3" Retorna 3

3) Agrega si cualquier numero es negativo imprimir por pantalla un "ERROR el numero x es negativo" y retornar -1


# Tablero de Bowling
1) Crea un metodo public void tirar(int pinosDerribados) y un metodo public int total()
2) En un partido de bowling hay 10 turnos, en cada turno puede tirar hasta 2 veces (tira 2 veces solo si no tira los 10 pinos en el primer intento), y existen 3 opciones para sumar puntos, 
* Opcion 1:
    Tira menos de 10 pinos utilizando los 2 tiros
* Opcion 2:
    Tira 10 pinos utilizando 2 tiros (suma 10 + (Pinos del proximo tiro))
* Opcion 3
    Tira 10 pinos(chuza) con su primer tiro (suma 10 + los proximos 2 tiradas de pinos)

> Aclaracion, en caso que en el turno 10 tire chuza, tiene un 2 tiros extras

Tips por donde arrancar:
Asumir que nunca se van a tirar mas de 12 veces (en el mejor de los casos)
Asumir que pinosDerribados es un valor entreo 0 y 10

1) Peor Juego , 10 tiros, 0 pinos, 0 puntos
2) Juego Perfecto, 12 tiros 10 pinos, 300 puntos.




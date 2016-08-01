Feature: Mostrar resultados de un partido de tenis
  Como expectador de un partido de tenis
  Quiero ver los puntos de ambos tenistas
  Para saber quien va ganando

  Scenario: Push an item into a stack
    Given un nuevo tablero
    When  chequeo el marcador
    Then dice "0 - 0"

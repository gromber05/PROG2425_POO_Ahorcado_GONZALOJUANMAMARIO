package es.iesra.prog2425_ahorcado

class Juego(val palabra: Palabra, val jugador: Jugador) {

    fun iniciar() {
        println("¡Bienvenido al juego del Ahorcado!" +
                "La palabara tiene ${palabra.palabraOculta.length+1} letras".trimIndent())

        while ((jugador.intentos > 0) or !palabra.esCompleta()) {
            println("Palabra: $" +
                    "Intentos restantes: $" +
                    "Letras usadas: $" +
                    "Introduce una letra: ".trimIndent())

            val letra: Char = readln().lowercase().firstOrNull()!!.toChar()
            val letrasUsadas = mutableListOf<Char>()

            if (letrasUsadas.contains(letra) or !letra.isLetter()) {
                println("Letra no válida o ya utilizada. Intenta otra vez.")
            }

            if (letra in palabra.palabraOculta) {
                println("¡Bien hecho! La letra '$letra' está en la palabra.")
            }

            if (palabra.esCompleta()) return
        }

        if (palabra.esCompleta()) {
            println("\n¡Felicidades! Has adivinado la palabra: ${palabra.obtenerProgreso()}")
        } else {
            println("\nLo siento, te has quedado sin intentos. La palabra era: ${palabra.palabraOculta}")
        }


    }

    fun preguntar(msj: String): Boolean {
        do {
            print("$msj (s/n): ")
            val respuesta = readln().trim().lowercase()
            when (respuesta) {
                "s" -> return true
                "n" -> return false
                else -> println("Respuesta no válida! Inténtelo de nuevo...")
            }
        } while (true)
    }

}
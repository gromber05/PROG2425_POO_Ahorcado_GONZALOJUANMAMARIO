package es.iesra.prog2425_ahorcado

class Juego(palabra: Palabra, jugador: Jugador) {

    companion object {
        val CONFIG_INTENTOS = 5
    }

    fun iniciar(palabra: Palabra) {
        println("¡Bienvenido al juego del Ahorcado!" +
                "La palabara tiene $n letras".trimIndent())

        val intentos = CONFIG_INTENTOS
        var palabraAcertada = false
        val letrasUsadas = mutableListOf<String>()

        while ((intentos > 0)) {
            println("Palabra: $" +
                    "Intentos restantes: $" +
                    "Letras usadas: $" +
                    "Introduce una letra: ".trimIndent())
            val letra: Char = readln().lowercase().firstOrNull()!!.toChar()

            if (letrasUsadas.contains(letra.toString()) or !letra.isLetter()) {
                println("Letra no válida o ya utilizada. Intenta otra vez.")
            }

            if (letra in palabraOculta) {
                println("¡Bien hecho! La letra '$letra' está en la palabra.")
            }

            if (palabraAcertada) {

            }
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
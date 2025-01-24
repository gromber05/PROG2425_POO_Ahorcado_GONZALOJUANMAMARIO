package es.iesra.prog2425_ahorcado

class Juego(palabra: Palabra, jugador: Jugador) {

    companion object {
        val CONFIG_INTENTOS = 5
    }

    fun iniciar(n: Int) {
        println("¡Bienvenido al juego del Ahorcado!" +
                "La palabara tiene $n letras".trimIndent())

        val intentos = CONFIG_INTENTOS
        var palabraAcertada = false
        val letrasUsadas = mutableListOf<String>()

        while ((intentos > 0) and (palabraAcertada == false)) {
            println("Palabra: $" +
                    "Intentos restantes: $" +
                    "Letras usadas: $" +
                    "Introduce una letra: ".trimIndent())
            val letra = readln().lowercase().firstOrNull()

            if (letrasUsadas.contains(letra.toString())) {

            }
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
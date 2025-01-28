package es.iesra.prog2425_ahorcado

fun main() {

    val palabras = Palabra.generarPalabras(cantidad = 10, tamanioMin = 7, tamanioMax = 7, idioma = Idioma.ES)

    var seguirJugando : Boolean
    do {
        val palabraOculta = palabras.pop()
        if (palabraOculta != null) {
            val jugador = Jugador(intentosMaximos = 6)
            val juego = Juego(palabraOculta, jugador)

            juego.iniciar()
            seguirJugando = juego.preguntar("¿Quieres jugar otra partida?")
        } else {
            println("No existen más palabras ocultas...")
            seguirJugando = false
        }
    } while (seguirJugando)
}

fun Char.quitarAcentos(): Char {
    val mapaAcentos = mapOf(
        'á' to 'a', 'Á' to 'A',
        'é' to 'e', 'É' to 'E',
        'í' to 'i', 'Í' to 'I',
        'ó' to 'o', 'Ó' to 'O',
        'ú' to 'u', 'Ú' to 'U'
    )
    return mapaAcentos[this] ?: this
}

fun <T> MutableSet<T>.pop(): T? {
    val elemento = this.randomOrNull()
    if (elemento != null) {
        this.remove(elemento)
    }
    return elemento
}



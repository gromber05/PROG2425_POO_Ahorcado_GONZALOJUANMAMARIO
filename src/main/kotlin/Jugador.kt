package es.iesra.prog2425_ahorcado

class Jugador(intentosMaximos: Int, letrasUsadas: MutableList<Char>) {

    var intentos: Int = intentosMaximos
        get() = field
        private set

    private var letrasUsadas: MutableList<Char> = mutableListOf()

    fun intentarLetra(letra: Char): Boolean {

        if(letra !in letrasUsadas){
            letrasUsadas.add(letra)
            return true
        } else {
            return false
        }

    }

    fun fallarIntento() {
        if (intentos > 0)
            intentos -= 1
    }

    fun obtenerLetrasUsadas() = letrasUsadas.joinToString(" ")
}
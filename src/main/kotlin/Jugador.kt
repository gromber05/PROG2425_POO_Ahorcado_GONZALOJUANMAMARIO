package es.iesra.prog2425_ahorcado

class Jugador(intentosMaximos: Int) {
    var intentos: Int = intentosMaximos
        private set
    private val letrasUsadas: MutableSet<Char> = mutableSetOf()

    fun intentarLetra(letra: Char): Boolean {
        if (letra in letrasUsadas) {
            return false // Letra ya utilizada
        }
        letrasUsadas.add(letra)
        return true
    }

    fun fallarIntento() {
        intentos--
    }

    fun obtenerLetrasUsadas(): String {
        return letrasUsadas.joinToString(", ")
    }
}

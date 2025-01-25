package es.iesra.prog2425_ahorcado

class Jugador(intentosMaximos: Int) {

    var intentos: Int = intentosMaximos
        get() = field
        private set

    private var letrasUsadas: MutableList<Char> = mutableListOf()

    fun intentarLetra(letra: Char): Boolean {

        if(letra !in letrasUsadas){
            letrasUsadas.add(letra)
            fallarIntento()
            return true
        } else {
            fallarIntento()
            return false
        }

    }

    fun fallarIntento() {
        if (intentos > 0)
            --intentos
    }

    fun obtenerLetrasUsadas() = letrasUsadas.joinToString(" ")
}
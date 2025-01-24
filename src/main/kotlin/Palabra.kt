package es.iesra.prog2425_ahorcado

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.gson.*
import kotlinx.coroutines.runBlocking

class Palabra(val palabraOculta: String, private val progreso: MutableList<Char>) {

    init {
        for (i in 0..palabraOculta.length) progreso.add('_')
    }

    fun revelarLetra(letra: Char) {
        var i = 0
        for (letraOculta in palabraOculta) {
            i += 1
            if (letra == letraOculta) {
                progreso[i] = letra
            }
        }
    }

    fun obtenerProgreso() = progreso.joinToString(" ")

    fun esCompleta() = '_' !in progreso
}
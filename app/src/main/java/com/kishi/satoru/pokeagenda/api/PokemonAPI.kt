package com.kishi.satoru.pokeagenda.api

import com.kishi.satoru.pokeagenda.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPI {
    // O retrofit2 trabalha com 2 tipos de URLs que podem mudar:
    // o caminho pode ser diferente, então usamos conforme abaixo, ou
    // pode trabalhar com ?var1=x&var2=y etc... isso é QueryParameter
    @GET("/api/v2/pokemon/{numero}")
    fun buscarPokemon(@Path("numero") numeroPokemon: Int): Call<Pokemon>
}
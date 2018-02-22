package com.kishi.satoru.pokeagenda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kishi.satoru.pokeagenda.api.PokemonAPI
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPesquisar.setOnClickListener {
            pesquisarPokemon()
        }
    }

    fun pesquisarPokemon() {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build()

        val service = retrofit.create(PokemonAPI::class.java)
    }
}

package com.example.pokedex

import java.io.Serializable
import java.lang.reflect.Constructor


data class PokemonModel(
    val name: String,
    val number: String,
    val image: Int,
    val backgroundColor: String,
    val type1: EnumType,
    val type2: EnumType,
    val hp: Int,
    val atk: Int,
    val sdef: Int,
    val def: Int,
    val spd: Int,
    val weight: String,
    val height: String,
    val dataPokemon: String,
    val satk: Int,
    val superPokemon: String,
    val name1: String,
    val name2: String,
    val name3: String,
    val number1: String,
    val number2: String,
    val number3: String,
    val image1: Int,
    val image2: Int,
    val image3: Int,
    val hp1: Int,
    val hp2: Int,
    val hp3: Int,
    val atk1: Int,
    val atk2: Int,
    val atk3: Int,
    val sdef1: Int,
    val sdef2: Int,
    val sdef3: Int,
    val def1: Int,
    val def2: Int,
    val def3: Int,
    val spd1: Int,
    val spd2: Int,
    val spd3: Int,
    val satk1: Int,
    val satk2: Int,
    val satk3: Int,
    val weight1: String,
    val weight2: String,
    val weight3: String,
    val height1: String,
    val height2: String,
    val height3: String,
    val dataPokemon1: String,
    val dataPokemon2: String,
    val dataPokemon3: String


):Serializable

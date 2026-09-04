package com.example.petshop

class Sad(name: String , date : String): Mood(name, date ){
    override fun type() : String{
        return "$name, $date "

    }



}

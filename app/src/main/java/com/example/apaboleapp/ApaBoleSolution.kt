package com.example.apaboleapp

class ApaBoleSolution {

    fun printApaBole(n: Int): String {
        val result = mutableListOf<String>()
        for (i in 1..n) {
            var word = i.toString()
            if (i % 3 == 0 && i % 5 == 0) {
                word = "ApaBole"
            } else if (i % 3 == 0) {
                word = "Apa"
            } else if (i % 5 == 0) {
                word = "Bole"
            }
            result.add(word)
        }
        return result.joinToString()
    }

}
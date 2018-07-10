//Michael Chan 18562

package main.utils

class Radio (
        var vol : Int = 0,
        var est : String = "FM",
        var IO : Boolean = false,
        var num : Int = 87
){override fun toString(): String {
    return """
            Estado actual del radio:
                Estacion: $est ,
                Numero estacion: $num,
                Volumen: $vol
        """.trimIndent()
}
}

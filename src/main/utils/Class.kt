//Michael Chan 18562

package main.utils

class Radio (
        var vol : Int = 0,
        var est : String = "FM",
        var IO : Boolean = false,
        var num : Int = 80
){override fun toString(): String {
    return """
            Radio:
                Estacion: $est ,
                Numero estacion: $num,
                Volumen: $vol
        """.trimIndent()
}
}

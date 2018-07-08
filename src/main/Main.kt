//Michael Chan 18562

package main

import Main.Class.*

val rad = Radio()

fun main(args: Array<String>) {
    println("Test")
    do {
        if (rad.IO == false) {
            println("""
            El radio se encuentra apagado:
            1.) Encender
            2.) Salir""")
            val opcion = readline()!!
            if (opcion == "1") {
                println("Encendiendo radio...")
                rad.IO = true
                continue
            } else if (opcion == "2") {
                break
            }
        } else if (rad.IO == true){
            println(rad)
        }
    }
}

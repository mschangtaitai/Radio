//Michael Chan 18562

package main

import main.utils.*

val rad = Radio()

fun main(args: Array<String>) {

    //Inicio de ciclo while
    do {

        //Si el radio esta apagado entra aca
        if (rad.IO == false) {
            println("""
            El radio se encuentra apagado:
            1.) Encender
            2.) Salir""".trimIndent())
            val opcion = readLine()!!
            if (opcion == "1") {
                println("Encendiendo radio...")
                rad.IO = true
                continue
            } else if (opcion == "2") {
                break
            }

        //Si el radio esta encendido entra aca
        } else if (rad.IO == true) {
            println(rad)
            println("""
                Que desea hacer?
                1.)Apagar
                2.)Cambiar de estacion
                3.)Subir numero de estacion
                4.)Bajar numero de estacion
                5.)Subir volumen
                6.)Bajar volumen
                7.)Salir
            """.trimIndent())
            val opcion = readLine()!!

            if (opcion == "1") {
                rad.IO = false

            } else if (opcion == "2") {
                println("Cambiando de estacion...")
                //Si esta en FM lo cambia a AM y pasa el numero de estacion a 1000
                if (rad.est == "FM") {
                    rad.est = "AM"
                    rad.num = 1000
                //Si esta en AM lo cambia a FM y pasa el numero de estacion a 87
                } else if (rad.est == "AM") {
                    rad.est = "FM"
                    rad.num = 87
                }

            } else if (opcion == "3") {
                do {
                    println("Cuantas estaciones desea subir?")
                    val numEst = readLine()!!
                    //Si esta en FM sube hasta que llega a la estacion mas alta "147"
                    if (rad.est == "FM") {
                        if ((rad.num + numEst) <= 147) {
                            rad.num += numEst
                            println("Subiendo estacion...")
                            break
                        } else if ((rad.num + numEst) > 147) {
                            println("No puede subir tanto")
                        }
                    //Si esta en AM la estacion mas alta es 1400
                    } else if (rad.est == "AM") {
                        if ((rad.num + numEst) <= 1400) {
                            rad.num += numEst
                            println("Subiendo estacion...")
                            break
                        } else if ((rad.num + numEst) > 1400) {
                            println("No puede subir tanto")
                        }
                    }
                } while (true)

            } else if (opcion == "4") {
                do {
                    println("Cuantas estaciones desea bajar?")
                    val numEst = readLine()!!.toInt()
                    //Si esta en FM baja hasta un minimo de 87
                    if (rad.est == "FM") {
                        if ((rad.num - numEst) >= 87) {
                            rad.num -= numEst
                            println("Bajando estacion...")
                            break
                        } else if ((rad.num + numEst) < 87) {
                            println("No puede bajar tanto")
                        }
                    //Si esta en AM baja hasta un minimo de 1000
                    } else if (rad.est == "AM") {
                        if ((rad.num - numEst) >= 1000) {
                            rad.num -= numEst
                            println("Bajando estacion...")
                            break
                        } else if ((rad.num + numEst) < 1000) {
                            println("No puede bajar tanto")
                        }
                    }
                } while (true)

            } else if (opcion == "5") {
                if (rad.vol < 100) {
                    rad.vol += 1
                    println("Subiendo volumen...")
                } else if (rad.vol == 100) { // El volumen no puede subir a mas de 100
                    println("Volumen al maximo")
                }

            } else if (opcion == "6") {
                if (rad.vol > 0) {
                    rad.vol -= 1
                    println("Subiendo volumen...")
                } else if (rad.vol == 0) { // El volumen no puede bajar a menos de 0
                    println("Volumen al minimo")
                }

            } else if (opcion == "7") {
                break
            }
        }

        //Separador por opciones
        println("**********************************************")
    }while (true)

    //Despedida si cierra el programa
    println("Adios")
}
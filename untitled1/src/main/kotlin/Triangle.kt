package org.Boucher

fun main() {
    for (i in 1..5) {
        triangle(4)
    }

}

fun triangle(hauteur : Int) : String {
    var i = "*"
    var ii= ""
    for (ia in 1..hauteur) {
        ii+=i
        println("$ii")}
    return hauteur.toString()
}
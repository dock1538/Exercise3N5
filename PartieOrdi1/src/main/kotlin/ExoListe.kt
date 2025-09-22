package org.example

fun main(){

    var tabTest:Array<Int> = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var TabNombre =
    joursParMois(tabTest, 3)
    TabNombre = Tri(TabNombre)
    println(TabNombre)
}
fun joursParMois(tabEntiers: Array<Int>, Nombre: Int):List<Int> {

    if (Nombre > 12) {
        throw ArrayIndexOutOfBoundsException("Nombre must be 12 or less than 12")
    }
    val tabJour = ArrayList<Int>()
    for (i in 0 until Nombre) {

        var TabEntierChiffre = tabEntiers[i]
        tabJour.add(TabEntierChiffre)
    }
    print(tabJour)
    return tabJour
}

fun Tri(tabEntiers: List<Int>):List<Int>{

    var tabJour = tabEntiers.sorted()
    return tabJour


}



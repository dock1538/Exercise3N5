package org.example

fun main(args: Array<String>) {
    var tabTest:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var tabResultat = sommeCumulative(tabTest)

    afficheTableau(tabResultat)
}

fun sommeCumulative(tabEntiers: Array<Int>):Array<Int> {
    for(i in 0 .. tabEntiers.size-1) {
        var nombre = 0

           nombre = tabEntiers[i]
        for(j in 0..i){
           nombre =+ tabEntiers[i]+1
        }
    }

    return tabEntiers
}

fun afficheTableau(tabEntiers: Array<Int>){
    for(i in 0 .. tabEntiers.size-1) {
        println(tabEntiers[i])
    }
}
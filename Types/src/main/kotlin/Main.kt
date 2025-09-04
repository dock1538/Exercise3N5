package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    val a = 1                                   // valeur est          type est
    val aa = 1L                                 // valeur est          type est
    val aaa = a * 25 + aa * 100                 // valeur est          type est
    val b = 1.0                                 // valeur est          type est
    val c = "1"                                 // valeur est          type est
    val d = true                                // valeur est          type est
    val laChose = c + b                         // valeur est          type est
    val k = listOf("1", "2", "3")               // valeur est          type est
    val l = mutableListOf(true, false, true)    // valeur est          type est
}
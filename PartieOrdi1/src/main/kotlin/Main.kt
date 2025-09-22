package org.example

import org.jsoup.Jsoup
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html"

    var doc = Jsoup.connect(url).get()
    var lien = doc.select("a")
    //Prendre nom dans le href
for (link in lien) {
    var nom = link.text()
    var email = link.attr("href").split(":").last()

    var lalignedemerde = nom + " a pour courriel "+ email
    println(lalignedemerde)
}



//    var text = doc
//
//    var mots = text.split(" ")






}
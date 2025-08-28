package org.Boucher

import org.jsoup.Jsoup
import org.jsoup.nodes.Document


fun main(){
 var doc : Document = Jsoup.connect("https://www.jsoup.com").get()
    print (doc)
}

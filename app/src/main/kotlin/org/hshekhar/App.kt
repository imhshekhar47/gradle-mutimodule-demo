package org.hshekhar

class App {
    val greetings: String
        get() {
            return "This is a gradle multi-module demo"
        }
}

fun main(args: Array<String>){
    println(I18Greeter.greet(App().greetings, if (args.size > 0) args[0] else "fr"))
}
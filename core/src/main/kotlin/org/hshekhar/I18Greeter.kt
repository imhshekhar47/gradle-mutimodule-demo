package org.hshekhar

import java.lang.IllegalArgumentException

object I18Greeter {
    private enum class Languages {
        en,
        fr
    }

    private val greetMapping = mapOf(
            Languages.en to arrayOf("Hello", "Hi", "Howdy"),
            Languages.fr to arrayOf("Bonjor")
    )

    fun greet(message: String, langCode: String = "en"): String {
        val lang =  try { Languages.valueOf(langCode) } catch (e: IllegalArgumentException) { Languages.en }
        return "${greetMapping[lang]?.random()}: \"$message\""
    }
}
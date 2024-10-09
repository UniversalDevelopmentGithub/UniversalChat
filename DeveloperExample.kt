package org.example.main

import org.bukkit.plugin.java.JavaPlugin
import org.UniversalDevelopment.universalChat.UniversalChatAPI.Companion.makeTranslation

class UniversalChatPlugin : JavaPlugin() {

    override fun onEnable() {

        // Example message to translate
        val exampleMessage = "This is an example message"

        // Translate the message to Dutch
        val translatedMessage = makeTranslation(exampleMessage, "nl")

        // Print the translated message in the console
        if (translatedMessage != null) {
            logger.info("Translated Message: $translatedMessage")
        } else {
            logger.info("Translation failed.")
        }
    }

}

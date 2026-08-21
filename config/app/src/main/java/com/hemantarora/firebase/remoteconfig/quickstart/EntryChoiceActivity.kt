package com.hemantarora.firebase.remoteconfig.quickstart

import android.content.Intent
import com.firebase.example.internal.BaseEntryChoiceActivity
import com.firebase.example.internal.Choice

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
            Choice(
                "Java",
                "Run the Firebase Remote Config quickstart written in Java.",
                Intent(
                    this,
                    com.hemantarora.firebase.remoteconfig.quickstart.java.MainActivity::class.java,
                ),
            ),
            Choice(
                "Kotlin",
                "Run the Firebase Remote Config quickstart written in Kotlin.",
                Intent(
                    this,
                    com.hemantarora.firebase.remoteconfig.quickstart.kotlin.MainActivity::class.java,
                ),
            ),
        )
    }
}

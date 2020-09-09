package com.example.level2_task2

data class Question(
    var question: String,
    var answer: Boolean
) {
    companion object {
        val QUESTION_QUESTION = arrayOf(
            "A \"val\" and \"val\"  are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A unit in Kotlin corresponds to a void in Java.",
            "In Kotlin 'when' replaces the 'switch' operator in Java."

        )
        val QUESTION_ANSWER = arrayOf(
            false,
            false,
            true,
            true
        )
    }
}
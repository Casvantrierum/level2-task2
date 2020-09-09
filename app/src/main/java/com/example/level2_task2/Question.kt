package com.example.level2_task2

data class Question(
    var question: String,
    var answer: Boolean
) {
    companion object {
        val QUESTION_QUESTION = arrayOf(
            "vraag1",
            "vraag2",
            "vraag3"

        )
        val QUESTION_ANSWER = arrayOf(
            true,
            false,
            true
        )
    }
}
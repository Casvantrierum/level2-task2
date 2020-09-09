package com.example.level2_task2

data class Question(
    var question: String,
    var answer: Boolean
) {
    companion object {
        val QUESTION_QUESTION = arrayOf(
            "vraag1T",
            "vraag2T",
            "vraag3F",
            "vraag4F"

        )
        val QUESTION_ANSWER = arrayOf(
            true,
            true,
            false,
            false
        )
    }
}
package com.obi.timesformat

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@SuppressLint("NewApi")
fun parseFormatDate(fromFormat: String): String {
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")
    val formatted = current.format(formatter)

    return formatted
}

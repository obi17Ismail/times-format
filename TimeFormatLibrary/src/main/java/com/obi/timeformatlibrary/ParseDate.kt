package com.obi.timeformatlibrary

import android.annotation.SuppressLint
import com.obi.timeformatlibrary.AppConstant.API_DATE_TIME_FORMAT
import com.obi.timeformatlibrary.AppConstant.DEFAULT_DATE_FORMAT
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class ParseDate {
    @SuppressLint("NewApi")
    fun parseFormatDate(fromFormat: String): String {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT)
        val formatted = current.format(formatter)

        return formatted
    }
}
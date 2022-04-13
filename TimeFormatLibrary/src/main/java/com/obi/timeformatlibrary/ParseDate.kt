package com.obi.timeformatlibrary

import com.obi.timeformatlibrary.AppConstant.API_DATE_TIME_FORMAT
import com.obi.timeformatlibrary.AppConstant.DEFAULT_DATE_FORMAT
import java.text.SimpleDateFormat
import java.util.*

class ParseDate {
    private fun String.parseDate(fromFormat: String = API_DATE_TIME_FORMAT): Long {
        val sdf = SimpleDateFormat(fromFormat, Locale.getDefault())
        sdf.timeZone = TimeZone.getTimeZone("UTC")
        return sdf.parse(this)?.time ?: 0L
    }

    private fun Long.formatDate(toFormat: String = API_DATE_TIME_FORMAT): String {
        val sdf = SimpleDateFormat(toFormat, Locale.getDefault())
        sdf.timeZone = TimeZone.getDefault()
        return sdf.format(Date(this))
    }

    fun String.parseFormatDate(
        fromFormat: String = API_DATE_TIME_FORMAT,
        toFormat: String = DEFAULT_DATE_FORMAT
    ): String {
        return this.parseDate(fromFormat).formatDate(toFormat)
    }
}
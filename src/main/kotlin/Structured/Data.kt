package Structured

import java.text.SimpleDateFormat
import java.time.DayOfWeek.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Data {
    fun formatarData() {
        val today = LocalDate.from(
            DateTimeFormatter
                .ofPattern("dd/MM/yyyy").parse("04/03/2023")
        )

        val todayTime = LocalDate.from(
            DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm").parse("04/03/2023 04:25")
        )

        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val todayDate = simpleDateFormat.parse("04/03/2023")

        println(today)
        println(todayTime)
        println(todayDate)

        if (today.dayOfWeek == MONDAY || today.dayOfWeek == TUESDAY) return
    }
}
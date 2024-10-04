fun main() {
    val weekday = "Thursday"

    val result = when (weekday) {
        "Friday" -> "8AM to 9PM (8:00 - 21:00)"
        "Thursday" -> "8AM to 6PM (8:00 - 18:00)"
        "Wednesday" -> "8AM to 6PM (8:00 - 18:00)"
        "Tuesday" -> "8AM to 6PM (8:00 to 18:00)"
        "Monday" -> "8AM to 12PM (8:00 to 12:00)"
        "Sunday" -> "8AM to 4PM (9:00 - 16:00)"
        "Saturday" -> "9AM to 4PM (9:00 - 16:00)"
        else -> "Invalid Day."
}
    println("On $weekday, the opening hours are: $result")
}



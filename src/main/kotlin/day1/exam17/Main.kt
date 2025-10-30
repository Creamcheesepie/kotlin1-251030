package day1.exam17

fun main() {
    val day = 2;

    val dayName = when (day) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4 -> "thursday"
        5 -> "friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "invalid day"
    }

    println("dayName: $dayName");
}

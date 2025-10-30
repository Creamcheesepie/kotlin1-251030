package day1.exam19

fun main() {
    val seasons = listOf("봄","여름","가을","겨울")

    seasons.map{
        "한국의 계절은 $it"
    }.forEach(::println)
}

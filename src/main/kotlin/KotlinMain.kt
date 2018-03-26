import beans.People
import java.util.*

fun main(args: Array<String>) {
    println(People::class.java.simpleName)
    println(People::class.java.canonicalName)
    println(People().javaClass.simpleName)

    println("--------------------------")

    println(People::class.java.name)
    println(People::class.java.canonicalName)
    println(People().javaClass.name)

    val words = "one two three four five six seven eight nine ten".split(' ')
    val frequencies = words.groupingBy { it.first() }.eachCount()
    println("Counting first letters: $frequencies.")

    val groupBy = words.groupBy { it.first() }.mapValues { (_, list) -> list.size }
    println("groupby: $groupBy")
    println("Comparing the result with using 'groupBy': ${groupBy == frequencies}.")

    val list = arrayListOf<Objects>()
}

fun getA(page: Page) {
    println(page.name)
}
enum class Page{
    HOME, MY
}
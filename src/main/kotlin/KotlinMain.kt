import beans.ConfigKeys
import beans.People
import java.util.*

fun main(args: Array<String>) {
    var path = "/focus/list"
    if (!path.startsWith("/")) {
        path = "/$path"
    }
    println(path)


}

fun getA(page: Page) {
    println(page.name)
}
enum class Page{
    HOME, MY
}
import java.util.Scanner
var scanner = Scanner(System.`in`)

fun main() {
    val archivesList = mutableListOf<Archive>()

    menuRoot(archivesList)

    scanner.close()
}
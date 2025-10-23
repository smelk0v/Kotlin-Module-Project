fun menuRoot(archiveList: MutableList<Archive>) {
    while (true) {
        println("0. Создать архив")
        archiveList.forEachIndexed { index, archive -> println("${index + 1}. ${archive.name}") }
        println((archiveList.size + 1).toString() + ". Выход")

        val item: Int? = scanner.nextLine().toIntOrNull()
        when (item){
            0 -> archiveCreate(archiveList)
            null -> println(ErrorText.NOT_INT.value)
            in 1..archiveList.size -> archiveView(archiveList[item - 1])
            (archiveList.size + 1) -> return
            else -> println(ErrorText.NOT_IN_MENU.value)
        }
    }
}

// функция ввода не пустой строки: имя и текст заметки, имя архива
fun inputLN(text: String): String {
    while (true) {
        println(text)
        val input = scanner.nextLine()
        if (input.isBlank()) {
            println(ErrorText.NOT_INPUT_LN.value)
        } else return input
    }
}
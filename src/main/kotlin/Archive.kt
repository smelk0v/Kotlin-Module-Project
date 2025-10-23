fun archiveCreate(archiveList: MutableList<Archive>) {
    val archiveName = inputLN("Введите имя архива:")

    archiveList.add(Archive(archiveName))

    println("Архив $archiveName создан!")
}

fun archiveView(archive: Archive) {
    while (true) {
        println("Вы находитесь в архиве '${archive.name}':\n" +
                "0. Создать заметку")
        archive.noteList.forEachIndexed { index, note -> println("${index + 1}. ${note.name}") }
        println((archive.noteList.size + 1).toString() + ". Назад")

        val item: Int? = scanner.nextLine().toIntOrNull()
        when (item){
            0 -> noteCreate(archive)
            null -> println(ErrorText.NOT_INT.value)
            in 1..archive.noteList.size -> noteView(archive.noteList[item - 1])
            (archive.noteList.size + 1) -> return
            else -> println(ErrorText.NOT_IN_MENU.value)
        }
    }
}
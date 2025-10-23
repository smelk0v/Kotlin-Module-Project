fun noteCreate(archive: Archive) {
    val noteNew = Note("")

    noteNew.name = inputLN("Введите имя заметки:")
    noteNew.text = inputLN("Введите текст заметки:")

    archive.noteList.add(noteNew)
    println("Заметка ${noteNew.name} создана!")
}

fun noteView(note: Note) {
    println("Заметка ${note.name}: \n" + note.text)
    println("Введите любой символ для выхода из заметки")
    scanner.nextLine()
}
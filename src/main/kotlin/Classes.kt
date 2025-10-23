class Archive(val name: String) {
    var noteList = mutableListOf<Note>()
}

class Note(var name: String) {
    var text: String = ""
}

enum class ErrorText(val value: String) {
    NOT_INT("Такого значения нет на экране. Введите цифру, соответствующую нужному пункту меню!"),
    NOT_IN_MENU("Такой цифры нет на экране. Введите корректную цифру!"),
    NOT_INPUT_LN("Поле не может быть пустым!");
}
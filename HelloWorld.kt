
// 1. Объявляем наш data class
data class Greet(val name: String = "Alex") {
    
    // Функция внутри класса
    fun say(guestName: String) {
        // Шаблон строки: $name берется из класса, $guestName — из параметров функции
        println("Hello world! Hello $guestName")
    }

    fun say2(guestName: String) {
        // Теперь мы используем и переменную из конструктора ($name), и параметр функции ($guestName)
        println("Hello world! Меня зовут $name, а тебя зовут $guestName!")
    }
}

// 2. Точка входа в программу (Hello World)
fun main() {
    // Создаем объект класса (используются значения по умолчанию)
    val greeter = Greet()
    
    // Вызываем метод класса
    greeter.say("Ivan") 
    // Выведет: Hello world! Hello Ivan

    // Вариант 1: Используем имя по умолчанию ("Alex")
    val greeter1 = Greet()
    greeter1.say2("Ivan") 
    // Выведет: Hello world! Меня зовут Alex, а тебя зовут Ivan!

    // Вариант 2: Передаем в конструктор свое имя ("Мария")
    val greeter2 = Greet(name = "Мария")
    greeter2.say2("Петр")
    // Выведет: Hello world! Меня зовут Мария, а тебя зовут Петр!
}



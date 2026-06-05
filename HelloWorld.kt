
// 1. Объявляем наш data class
data class Greet(val name: String = "Alex") {
    
    // Функция внутри класса
    fun say(guestName: String) {
        // Шаблон строки: $name берется из класса, $guestName — из параметров функции
        println("Hello world! Hello $guestName")
    }
}

// 2. Точка входа в программу (Hello World)
fun main() {
    // Создаем объект класса (используются значения по умолчанию)
    val greeter = Greet()
    
    // Вызываем метод класса
    greeter.say("Ivan") 
    // Выведет: Hello world! Hello Ivan
}



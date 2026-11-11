
/**
 * Binary Search 
 */
fun binarySearch(list: List<Int>, target: Int): Int {
    var left = 0
    var right = list.lastIndex

    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            list[mid] == target -> return mid
            list[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1 // Элемент не найден
}

fun main() {
    val numbers = listOf(2, 5, 8, 12, 16, 23, 38, 56, 72, 91)
    println(binarySearch(numbers, 23)) // Выведет: 5
}


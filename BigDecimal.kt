/**
 * Use BigDecimal in Kotlin 
 * 
 * @company: TechMatrix18
 * @author Alexander Kuziv <makklays@gmail.com>
 * @date: 11.07.2026
 */

// Java 
BigDecimal price = new BigDecimal("100.50");
BigDecimal tax = new BigDecimal("0.20");
BigDecimal total = price.add(price.multiply(tax)); // Сложно читать

// Kotlin 
val price = BigDecimal("100.50")
val tax = BigDecimal("0.20")
val total = price + (price * tax) // Выглядит как обычная математика!

// Если написать BigDecimal(0.1), то внутри запустится конструктор, который возьмет уже искаженное значение 0.1000000000000000055511151231257827021181583404541015625 и превратит его в огромное неточное число.
// Поэтому обрезешь ты его по длине или округлишь — исходная неточность уже попадет в вычисления.
// А вот строка "0.1" передает число знак за знаком, и BigDecimal записывает его идеально точно!

val a = BigDecimal("10.00")
val b = BigDecimal("3.00")

// Указываем количество знаков после запятой (2) и режим округления
val result = a.divide(b, 2, RoundingMode.HALF_UP) // 3.33


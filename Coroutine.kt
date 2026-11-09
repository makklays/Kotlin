import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

/**
 * Репозиторий для параллельного получения данных из нескольких источников.
 * 
 * Общее время выполнения составит ~1.5 секунды (время самого долгого запроса), а не 2.5 секунды, как было бы при последовательном вызове.
 *
 * Метод [fetchCombineData] запускает асинхронное получение данных [fetchDataOne] 
 * и [fetchDataTwo] одновременно в рамках текущей области видимости ([coroutineScope]).
 * 
 * Благодаря [coroutineScope] соблюдается принципы Structured Concurrency:
 * если одна из внутренних асинхронных задач завершится с ошибкой, 
 * вторая будет автоматически отменена, а ошибка выбросится наружу.
 */
class DataRepository {

  suspend fun fetchCombineData(): Pair<String, String> = coroutineScope {
    val deferredOne = async { fetchDataOne() }
    val deferredTwo = async { fetchDataTwo() }
    Pair(deferredOne.await(), deferredTwo.await())
  } 

  private suspend fun fetchDataOne(): String {
    delay(1000)
    return "Result One"
  }

  private suspend fun fetchDataTwo(): String {
    delay(1500)
    return "Result Two"
  }
}

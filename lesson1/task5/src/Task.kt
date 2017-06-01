fun isEven(num: Int) =  num % 2 == 0
// why do i not need to specify return types

fun containsEven(collection: Collection<Int>): Boolean = collection.any(::isEven)
//fun containsEven(collection: Collection<Int>): Boolean = collection.any {  }
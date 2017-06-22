class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return DateIterator(this)
    }
}

class DateIterator(val dataRange:DateRange): Iterator<MyDate> {
    var current: MyDate = dataRange.start
    override fun hasNext(): Boolean {
       return current <= dataRange.end
    }

    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
package hashcode2020

import java.util.*

class Librairie {
    var nbBook: Int = 0;
    var nbJourRegister: Int = 0;
    var nbBookDay: Int = 0;
    var books: List<Int> = listOf();
    var selectedBook: MutableList<Int> = mutableListOf();
    var id: Int = 0;

    constructor(line1: List<String>, id: Int) {
        this.id = id;
        this.nbBook = line1.get(0).toInt();
        this.nbJourRegister = line1.get(1).toInt();
        this.nbBookDay = line1.get(2).toInt();
    }

    fun addSecondLine(secondLine: List<String>) {
        books = secondLine.map { s -> s.toInt() }
    }

    fun serialize(): List<List<String>> {
        val result = mutableListOf<List<String>>()
        if (!selectedBook.isEmpty()) {
            result.add(Arrays.asList(this.id.toString() + " " + (this.selectedBook.size).toString()));
            result.add(selectedBook.map { i -> i.toString() })
        }
        return result;
    }

    fun selectBook(i: Int) {
        this.selectedBook.add(i)
    }
}

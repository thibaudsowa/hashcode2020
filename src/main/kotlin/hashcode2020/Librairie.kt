package hashcode2020

class Librairie {
    var nbBook: Int? = null;
    var nbJourRegister: Int? = null;
    var nbBookDay: Int? = null;
    var books: List<Int> = listOf();

    constructor(line1: List<String>) {
        this.nbBook = line1.get(0).toInt();
        this.nbJourRegister = line1.get(1).toInt();
        this.nbBookDay = line1.get(2).toInt();
    }

    fun addSecondLine(secondLine: List<String>) {}
}

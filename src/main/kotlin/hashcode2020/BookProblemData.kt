package hashcode2020

class BookProblemData {
    var bookScores: List<Int> = listOf();
    var nbBook: Int? = null;
    var nbLib: Int? = null;
    var nbJour: Int? = null;
    var librairies: MutableList<Librairie> = mutableListOf<Librairie>()

    constructor(template: HashCodeTemplate) {
        this.nbBook = template.header.get(0)
        this.nbLib = template.header.get(1)
        this.nbJour = template.header.get(2)
        this.bookScores = template.body.get(0).map { s -> s.toInt() }
        template.body.subList(1, template.body.size).forEachIndexed() { index, list ->
            if (index.rem(2).equals(0)) {
                var lib = Librairie(list, index / 2);
                this.librairies.add(lib.id, lib)
            } else {
                this.librairies.get((index - 1) / 2).addSecondLine(list)
            }
        }
    }
    
}
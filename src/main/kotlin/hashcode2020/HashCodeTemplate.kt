package hashcode2020

class HashCodeTemplate {
    var header: List<Int> = listOf();
    var body: List<List<String>> = listOf();

    constructor(blob: List<String>) {
        header = blob.get(0).split(' ').map { s: String -> s.toInt() }
        body = blob.subList(1, blob.size).map { s: String -> s.split(' ') }
    }
}
       

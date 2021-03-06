package hashcode2020

import java.io.File

class HashCodeReponse {
    var header: List<Int> = listOf();
    var body: List<List<String>> = listOf();

    constructor(header: List<Int>, body: List<List<String>>) {
        this.header = header
        this.body = body
    }

    fun toFile(name: String) {

        val file = File("outputs/" + name)
                .also { file -> file.parentFile.mkdirs() }

        file.createNewFile()
        file.printWriter().use { out ->
            out.println(header.map { i -> i.toString() }.reduce { a, b -> a + " " + b })
            body.forEach { line: List<String> ->
                out.println(line.reduce { a, b -> a + " " + b })
            }
        }

    }
}
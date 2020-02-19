/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package hashcode2020

import java.io.File

fun main(args: Array<String>) {
    println("Hello HashCode 2020!")

    val lines = ArrayList<String>()

    File("inputs/file1.txt").forEachLine { lines.add(it) }

    File("outputs/file1.txt")
            .also { file -> file.parentFile.mkdirs() }
            .writeText(lines.joinToString(" ").toUpperCase())
}

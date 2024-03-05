package Structured

import java.util.LinkedList
import java.util.SortedSet

/*
   Métodos para ser adicionados
   às coleções e imprimir os valores
*/
class Impressao {
    fun printCollection(
        numeroParaFinalizarOLoop: Int,
        collectionType: MutableCollection<Int>
    ) {

        for (num in 0..numeroParaFinalizarOLoop) collectionType.add(num)
        for (numero in collectionType) println("LIST: $numero")
    }

    fun printCollection(
        numeroParaFinalizarOLoop: Int,
        collectionType: SortedSet<Int>
    ) {

        for (num in 0..numeroParaFinalizarOLoop) collectionType.add(num)
        for (numero in collectionType) println("SORTEDSET: $numero")
    }

    fun printCollection(
        numeroParaFinalizarOLoop: Int,
        collectionType: HashSet<Int>
    ) {

        for (num in 0..numeroParaFinalizarOLoop) collectionType.add(num)
        for (numero in collectionType) println("HASHSET: $numero")
    }

    fun printCollection(
        numeroParaFinalizarOLoop: Int,
        collectionType: LinkedList<Int>
    ) {

        for (num in 0..numeroParaFinalizarOLoop) collectionType.add(num)
        for (numero in collectionType) println("LINKEDLIST: $numero")
    }
}
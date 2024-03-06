package OOP.Classes

open class Animal {

    var listaGatos = mutableListOf<Gato>()
    var listaCachorros = mutableListOf<Cachorro>()
    var listaPeixes = mutableListOf<Peixe>()

    fun adotarAnimal(animal: Animal) {
        if (animal is Gato) listaGatos.add(animal)
        if (animal is Cachorro) listaCachorros.add(animal)
        if (animal is Peixe) listaPeixes.add(animal)
    }

    fun listarAnimaisAdotados() {
        println("Animais adotados:")
        println("Gato: ${listaGatos.count()}")
        println("Cachorro: ${listaCachorros.count()}")
        println("Peixe: ${listaPeixes.count()}")
    }
}
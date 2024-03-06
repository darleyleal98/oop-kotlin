import OOP.Classes.Cachorro
import OOP.Classes.Gato
import OOP.Classes.Peixe
import OOP.Classes.Pessoa
import java.time.LocalDate

fun main() {
    val pessoa = Pessoa("073115274111",
        "Darley", LocalDate.of(1998, 3, 21),
        "darleyleal2103@outlook.com")

    pessoa.animaisDeExtimacao.adotarAnimal(Gato())
    pessoa.animaisDeExtimacao.adotarAnimal(Gato())
    pessoa.animaisDeExtimacao.adotarAnimal(Cachorro())
    pessoa.animaisDeExtimacao.adotarAnimal(Cachorro())
    pessoa.animaisDeExtimacao.adotarAnimal(Peixe())


    println(pessoa.toString())
    pessoa.animaisDeExtimacao.listarAnimaisAdotados()
}
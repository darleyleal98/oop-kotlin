import OOP.Classes.Pessoa
import java.time.LocalDate

fun main() {
    val pessoa = Pessoa("073115274111",
        "Darley", LocalDate.of(1998, 3, 21),
        "darleyleal2103@outlook.com")

    println(pessoa.toString())
}
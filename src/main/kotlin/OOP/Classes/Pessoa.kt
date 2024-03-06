package OOP.Classes

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val nome: String,
    val dataNascimento: LocalDate,
    val email: String,
) {
    private val idade = LocalDate.now().year - dataNascimento.year

    val animaisDeExtimacao = Animal()

    override fun toString(): String {
        return "Nome: $nome, CPF: $cpf," +
                "\nData de nascimento: $dataNascimento," +
                "\nIdade: $idade, Email: ${verificarEmail(email)}"
    }

    private fun verificarEmail(email: String): String {
        if (!Regex("^[a-z0-9.]+@[a-z0-9]+.[a-z]+(.[a-z]+)?").matches(email)) {
            throw IllegalArgumentException("E-mail inválido. Tente novamente!")
        }
        return email
    }
}
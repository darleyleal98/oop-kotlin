package Structured

import java.math.BigDecimal

class Produto {
    fun somarPrecoDosProdutos(produtos: Array<BigDecimal>) : BigDecimal {
        var precoTotal = BigDecimal.ZERO

        for (preco in produtos) precoTotal += preco

        return precoTotal
    }

    fun somarPrecoDosProdutos(primeiraLista: Array<BigDecimal>,
                              segundaLista: Array<BigDecimal>,
                              terceiraLista: Array<BigDecimal>) : BigDecimal {

        var precoTotal = BigDecimal.ZERO

        for (preco in primeiraLista) precoTotal += preco
        for (preco in segundaLista) precoTotal += preco
        for (preco in terceiraLista) precoTotal += preco

        return precoTotal
    }
}
package UtilPack

open class LimitadorPontos() {

    companion object {
        fun diminuirPontos(pontos: Int, qtdPontos: Int): Int {
            return when (qtdPontos) {
                in 1..5 -> pontos - qtdPontos
                6 -> pontos - qtdPontos - 1
                7 -> pontos - qtdPontos - 2
                else -> pontos - qtdPontos
            }
        }

    }
}
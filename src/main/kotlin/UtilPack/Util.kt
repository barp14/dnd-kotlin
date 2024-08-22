package UtilPack

class Util {

  companion object {

    fun rolagemAtributos(): Int {
      while (true) {
        val rolagens = List(4) { Dados.d6() }
        val somaDosMaiores = rolagens.sorted().drop(1).sum() // Remove o menor valor e soma os restantes

        if (somaDosMaiores >= 8) {
          return somaDosMaiores
        }
      }
    }
  }
}
package Classes

import UtilPack.Dados

class Bardo : ClassePadrao  {
  override val nomeClasse: String = "Bardo"
  override var vidaClasse: Int = 10 + Dados.d8()
}
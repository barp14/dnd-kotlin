package Classes

import UtilPack.Dados

class Barbaro : ClassePadrao  {
  override val nomeClasse: String = "Bárbaro"
  override var vidaClasse: Int = 10 + Dados.d12()
}
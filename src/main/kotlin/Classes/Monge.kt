package Classes

import UtilPack.Dados

class Monge : ClassePadrao  {
  override val nomeClasse: String = "Monge"
  override var vidaClasse: Int = 10 + Dados.d8()
}
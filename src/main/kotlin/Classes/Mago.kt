package Classes

import UtilPack.Dados

class Mago : ClassePadrao  {
  override val nomeClasse: String = "Mago"
  override var vidaClasse: Int = 10 + Dados.d6()
}
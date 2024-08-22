package Classes

import UtilPack.Dados

class Guardiao : ClassePadrao  {
  override val nomeClasse: String = "Guardião"
  override var vidaClasse: Int = 10 + Dados.d8()
}
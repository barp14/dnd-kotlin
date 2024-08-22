package Classes

import UtilPack.Dados

class Ladino : ClassePadrao  {
  override val nomeClasse: String = "Ladino"
  override var vidaClasse: Int = 10 + Dados.d10()
}
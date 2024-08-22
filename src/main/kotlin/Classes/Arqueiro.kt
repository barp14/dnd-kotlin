package Classes

import UtilPack.Dados

class Arqueiro : ClassePadrao {
  override val nomeClasse: String = "Arqueiro"
  override var vidaClasse: Int = 10 + Dados.d10()
}
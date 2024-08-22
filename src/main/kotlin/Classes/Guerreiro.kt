package Classes

import UtilPack.Dados

class Guerreiro : ClassePadrao  {
  override val nomeClasse: String = "Guerreiro"
  override var vidaClasse: Int = 10 + Dados.d10()
}
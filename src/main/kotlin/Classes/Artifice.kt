package Classes

import UtilPack.Dados

class Artifice : ClassePadrao {
  override val nomeClasse: String = "Artifíce"
  override var vidaClasse: Int = 10 + Dados.d10()
}
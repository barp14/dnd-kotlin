package Classes

import UtilPack.Dados

class Druida : ClassePadrao  {
  override val nomeClasse: String = "Druída"
  override var vidaClasse: Int = 10 + Dados.d8()
}
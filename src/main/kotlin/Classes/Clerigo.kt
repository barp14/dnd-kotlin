package Classes

import UtilPack.Dados

class Clerigo : ClassePadrao  {
  override val nomeClasse: String = "Clérigo"
  override var vidaClasse: Int = 10 + Dados.d8()
}
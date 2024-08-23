import Classes.Guerreiro
import PersonagemPack.Personagem
import Racas.MeioElfo
import UtilPack.Escolha
import UtilPack.LimitadorPontos
import java.io.ByteArrayInputStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PersonagemTests {

  var char = Personagem()

  @Test
  fun escolhaNome() {
    val simulatedInput = "João"
    System.setIn(ByteArrayInputStream(simulatedInput.toByteArray())) // adaptando o teste simulando uma entrada do teclado

    Escolha.escolhaNome(char)
    assertEquals("João", char.nome)
  }

  @Test
  fun escolhaRaca() {
    val simulatedInput = "9"
    System.setIn(ByteArrayInputStream(simulatedInput.toByteArray()))

    Escolha.escolhaRaca(char)
    assertTrue(char.raca is MeioElfo)
  }

  @Test
  fun escolhaClasse() {
    val simulatedInput = "9"
    System.setIn(ByteArrayInputStream(simulatedInput.toByteArray()))

    Escolha.escolhaClasse(char)
    assertTrue(char.classe is Guerreiro)
  }

  @Test
  fun diminuirPontos() {
    // qtdPontos está entre 1 e 5
    val qtdPontosIs1to5 = LimitadorPontos.diminuirPontos(10, 4)
    assertEquals(6, qtdPontosIs1to5)

    // qtdPontos é 6
    val qtdPontosIs6 = LimitadorPontos.diminuirPontos(10, 6)
    assertEquals(3, qtdPontosIs6)

    // qtdPontos é 7
    val qtdPontosIs7 = LimitadorPontos.diminuirPontos(10, 7)
    assertEquals(1, qtdPontosIs7)
  }
}

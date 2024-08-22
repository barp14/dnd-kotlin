import Classes.*
import PersonagemPack.Personagem
import Racas.*
import UtilPack.LimitadorPontos
import UtilPack.Util

fun main() {
  var escolhaValidaRaca = false // pro loop funcionar, solução temporária
  var escolhaValidaClasse = false // pro loop funcionar, solução temporária
  val char1 = Personagem()

  print("Nome do personagem: ")
  char1.nome = readln()

  while (!escolhaValidaRaca) {
    println(
      "\nEscolha uma raça:" +
              "\n1. Anão" +
              "\n2. Anão da Colina" +
              "\n3. Anão da montanha" +
              "\n4. Draconato" +
              "\n5. Drow" +
              "\n6. Alto-elfo" +
              "\n7. Elfo" +
              "\n8. Elfo da floresta" +
              "\n9. Meio-elfo" +
              "\n10. Gnomo" +
              "\n11. Gnomo da floresta" +
              "\n12. Gnomo das rochas" +
              "\n13. Halfling" +
              "\n14. Halfling pés-leves" +
              "\n15. Halfling robusto" +
              "\n16. Humano" +
              "\n17. Meio-orc" +
              "\n18. Tiefling"
    )
    print("\nRaça escolhida: ")
    val escolhaRaca = readln().toInt()

    char1.raca = when (escolhaRaca) {
      1 -> { escolhaValidaRaca = true
        Anao() }
      2 -> { escolhaValidaRaca = true
        AnaoDaColina() }
      3 -> { escolhaValidaRaca = true
        AnaoDaMontanha() }
      4 -> { escolhaValidaRaca = true
        Draconato() }
      5 -> { escolhaValidaRaca = true
        Drow() }
      6 -> { escolhaValidaRaca = true
        AltoElfo() }
      7 -> { escolhaValidaRaca = true
        Elfo() }
      8 -> { escolhaValidaRaca = true
        ElfoDaFloresta() }
      9 -> { escolhaValidaRaca = true
        MeioElfo() }
      10 -> { escolhaValidaRaca = true
        Gnomo() }
      11 -> { escolhaValidaRaca = true
        GnomoDaFloresta() }
      12 -> { escolhaValidaRaca = true
        GnomoDasRochas() }
      13 -> { escolhaValidaRaca = true
        Halfling() }
      14 -> { escolhaValidaRaca = true
        HalflingPesLeves() }
      15 -> { escolhaValidaRaca = true
        HalflingRobusto() }
      16 -> { escolhaValidaRaca = true
        Humano() }
      17 -> { escolhaValidaRaca = true
        MeioOrc() }
      18 -> { escolhaValidaRaca = true
        Tiefling() }
      else -> {
        println("Opção inválida, por favor escolha novamente.")
        continue
      }
    }
  }

  while (!escolhaValidaClasse) {
    println(
      "\nEscolha uma classe:" +
              "\n1. Arqueiro" +
              "\n2. Artífice" +
              "\n3. Bárbaro" +
              "\n4. Bardo" +
              "\n5. Clérigo" +
              "\n6. Druída" +
              "\n7. Feiticeiro" +
              "\n8. Guardião" +
              "\n9. Guerreiro" +
              "\n10. Ladino" +
              "\n11. Mago" +
              "\n12. Monge"
    )
    print("\nClasse escolhida: ")
    val escolhaClasse = readln().toInt()

    char1.classe = when (escolhaClasse) {
      1 -> { escolhaValidaClasse = true
        Arqueiro() }
      2 -> { escolhaValidaClasse = true
        Artifice() }
      3 -> { escolhaValidaClasse = true
        Barbaro() }
      4 -> { escolhaValidaClasse = true
        Bardo() }
      5 -> { escolhaValidaClasse = true
        Clerigo() }
      6 -> { escolhaValidaClasse = true
        Druida() }
      7 -> { escolhaValidaClasse = true
        Feiticeiro() }
      8 -> { escolhaValidaClasse = true
        Guardiao() }
      9 -> { escolhaValidaClasse = true
        Guerreiro() }
      10 -> { escolhaValidaClasse = true
        Ladino() }
      11 -> { escolhaValidaClasse = true
        Mago() }
      12 -> { escolhaValidaClasse = true
        Monge() }
      else -> {
        println("Opção inválida, por favor escolha novamente.")
        continue
      }
    }
  }

  println("${char1.nome} é um ${char1.raca.nomeRaca} da classe ${char1.classe.nomeClasse}!")

  print("\nDeseja inserir seus valores da habilidade ou decidir na aleatoriedade." +
          "\n1 - Inserir." +
          "\n2 - Aleatório." +
          "\nSua esolha: ")
  val escolhaHabilidade = readln().toInt()

  if (escolhaHabilidade == 1) {

    var pontos: Int = 27

    do {
      do {
        print("\nForça: ")
        val digitadoForca = readln().toInt()

        if (digitadoForca <= pontos && digitadoForca >= 0 && digitadoForca <= 15) {
          char1.forca = 8 + char1.modificadorHabilidade(digitadoForca + char1.raca.buffForca).toInt()

          pontos = LimitadorPontos.diminuirPontos(pontos, digitadoForca)
          println("Pontos restantes: " + pontos)
          break
        } else {
          println("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 15. Tente novamente.")
        }
      } while (true)

      do {
        print("Destreza: ")
        val digitadoDestreza: Int = readln().toInt()

        if (digitadoDestreza <= pontos && digitadoDestreza in 0..15) {
          char1.destreza = 8 + char1.modificadorHabilidade(digitadoDestreza + char1.raca.buffDestreza).toInt()
          pontos = LimitadorPontos.diminuirPontos(pontos, digitadoDestreza)
          println("Pontos restantes: " + pontos)
          break
        } else {
          println("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 15. Tente novamente.")
        }
      } while (true)

      do {
        print("Constituição: ")
        val digitadoConstituicao: Int = readln().toInt()

        if (digitadoConstituicao <= pontos && digitadoConstituicao in 0..15) {
          char1.constituicao =
            8 + char1.modificadorHabilidade(digitadoConstituicao + char1.raca.buffConstituicao).toInt()
          pontos = LimitadorPontos.diminuirPontos(pontos, digitadoConstituicao)
          println("Pontos restantes: " + pontos)
          break
        } else {
          println("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 15. Tente novamente.")
        }
      } while (true)

      do {
        print("Inteligencia: ")
        val digitadoInteligencia: Int = readln().toInt()

        if (digitadoInteligencia <= pontos && digitadoInteligencia in 0..15) {
          char1.inteligencia =
            8 + char1.modificadorHabilidade(digitadoInteligencia + char1.raca.buffInteligencia).toInt()
          pontos = LimitadorPontos.diminuirPontos(pontos, digitadoInteligencia)
          println("Pontos restantes: " + pontos)
          break
        } else {
          println("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 15. Tente novamente.")
        }
      } while (true)

      do {
        print("Sabedoria: ")
        val digitadoSabedoria: Int = readln().toInt()

        if (digitadoSabedoria <= pontos && digitadoSabedoria in 0..15) {
          char1.sabedoria = 8 + char1.modificadorHabilidade(digitadoSabedoria + char1.raca.buffSabedoria).toInt()
          pontos = LimitadorPontos.diminuirPontos(pontos, digitadoSabedoria)
          println("Pontos restantes: " + pontos)
          break
        } else {
          println("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 15. Tente novamente.")
        }
      } while (true)

      do {
        print("Carisma: ")
        val digitadoCarisma: Int = readln().toInt()

        if (digitadoCarisma <= pontos && digitadoCarisma in 0..15) {
          char1.carisma = 8 + char1.modificadorHabilidade(digitadoCarisma + char1.raca.buffCarisma).toInt()
          pontos = LimitadorPontos.diminuirPontos(pontos, digitadoCarisma)
          println("Pontos restantes: " + pontos)
          break
        } else {
          println("Valor inserido é maior que os pontos disponíveis, menor que 0 ou maior que 15. Tente novamente.")
        }
      } while (true)
    } while (pontos != 0)

  }
  else if (escolhaHabilidade == 2){

    println("\nRoll the dices!")
    char1.forca = char1.modificadorHabilidade(Util.rolagemAtributos() + char1.raca.buffForca).toInt()
    char1.destreza = char1.modificadorHabilidade(Util.rolagemAtributos() + char1.raca.buffDestreza).toInt()
    char1.constituicao = char1.modificadorHabilidade(Util.rolagemAtributos() + char1.raca.buffConstituicao).toInt()
    char1.inteligencia = char1.modificadorHabilidade(Util.rolagemAtributos() + char1.raca.buffInteligencia).toInt()
    char1.sabedoria = char1.modificadorHabilidade(Util.rolagemAtributos() + char1.raca.buffSabedoria).toInt()
    char1.carisma = char1.modificadorHabilidade(Util.rolagemAtributos() + char1.raca.buffCarisma).toInt()
    char1.vida = char1.modificadorHabilidade(char1.classe.vidaClasse).toInt()
  }

  println("\n-+- Seus valores de habilidade -+-\n")

  println("Força: " + char1.forca)
  println("Destreza: " + char1.destreza)
  println("Constituição: " + char1.constituicao)
  println("Inteligencia: " + char1.inteligencia)
  println("Sabedoria: " + char1.sabedoria)
  println("Carisma: " + char1.carisma)
  println("Vida: " + char1.vida)
}
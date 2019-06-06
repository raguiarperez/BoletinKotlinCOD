object Boletin13 {

    @JvmStatic
fun main(args: Array<String>) {


//añadimos Xogador, Entrenaodr, Masajista y Seleccion

    val xog1 = Xogador(1, "portero", 1, "Jesu", "Perez", 43)
    val adestra = Entrenador("trainer", 2, "Andres", "Gonzalezper", 70)
    val masa1 = Masajista("licenciado", 15, 10, "julio", "Ranchez", 26)
    val xogador = Seleccion(2, "pepe", "sanabriaz", 20)


    xog1.concentrarse()
    adestra.concentrarse()
    masa1.concentrarse()
    xogador.concentrarse()
    xog1.viaxar()
    adestra.viaxar()
    masa1.viaxar()
    xogador.viaxar()
}
}
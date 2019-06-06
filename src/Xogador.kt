class Xogador(var dorsal: Int, var demarcacion: String?, id: Int, nome: String, apelido: String, edade: Int) :
    Seleccion(id, nome, apelido, edade) {

    override fun viaxar() { //método heredado de Seleccion
        println("Viaxan os xogadores...")
    }


    fun xogarPartido() {} //método propio de la clase


    fun entrenar() {} //método propio de la clase


    override fun toString(): String {
//método toString que imprime las variables propias y heredadas de la superclase Selección

        return "Xogador: " + "dorsal= " + dorsal + ", demarcacion= " + demarcacion + " " + super.toString() + '}'
    }
}


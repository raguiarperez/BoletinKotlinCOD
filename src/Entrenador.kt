import javax.swing.JOptionPane


class Entrenador(var idFederacion: String?, id: Int, nome: String, apelido: String, edade: Int) :
//parametros de la clase Entrenador y clase que hereda el resto
    Seleccion(id, nome, apelido, edade) {

    fun dirixirPartido() {} //método de la clase

    fun dirixirAdestramento(){} //método de la clase


    override fun viaxar() {
        //método heredado de Seleccion
        JOptionPane.showMessageDialog(null, "Viaxa el Entrenador.\n$this")
    }


    override fun toString(): String {
        //método toString que imprime las variables heredadas de la superclase Selección y las variables propias
        return super.toString() + "\nID Federación = " + idFederacion
    }
}
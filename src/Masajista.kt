import javax.swing.JOptionPane

class Masajista(var titulacion: String?, var anosExperiencia: Int, id: Int, nome: String, apelido: String, edade: Int) :
    Seleccion(id, nome, apelido, edade) {


    fun darMasaxes() {}
        //método de la clase


    override fun viaxar() {
        //método heredado de Seleccion
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores.\n$this")
    }


    override fun toString(): String {
        //método toString que imprime las variables heredadas de la superclase Selección y las variables propias
        return super.toString() + "\nTitulación = " + titulacion + "\nAños de experiencia = " + anosExperiencia
    }


}
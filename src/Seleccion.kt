import javax.swing.JOptionPane

open class Seleccion(var id: Int, var nome: String?, var apelido: String?, var edade: Int) {
    /*se ponen los valores por defecto para que el programa no nos de error al dejar campos en blanco, ya que queremos crear un
    objeto de esta clase sin que sea imprescindible asignarle valores a ninguna variable, asimismo es preferible asignarle a la
    String un valor inicial de comillas en blanco, en vez de null, ya que es recomendable no */

    //constructor por defecto
    init {}

    //método propio de la clase
    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concéntrase a Selección.")
    }
    //método propio de la clase y que se extenderá a las subclases que hereden de esta ("open")
    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a Selección.")
    }

    override fun toString(): String {
        return "ID = $id\nNome = $nome\nApelido = $apelido\nEdade = $edade"
    }

}

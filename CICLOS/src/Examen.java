
/**
 *
 * @author laura
 */
public class Examen {

    private String descripcion;

    private Pregunta[] listapreguntas;

    public Examen(String descripcion, Pregunta[] listapreguntas) {
        this.descripcion = descripcion;
        this.listapreguntas = listapreguntas;
    }
    
    

    /**
     *
     */
    public void calificar() {
    }

    /**
     *
     */
    public void elegirpreguntas() {
    }

    /**
     *
     */
    public void ordenarpreguntas() {
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the listapreguntas
     */
    public Pregunta[] getListapreguntas() {
        return listapreguntas;
    }

    /**
     * @param listapreguntas the listapreguntas to set
     */
    public void setListapreguntas(Pregunta[] listapreguntas) {
        this.listapreguntas = listapreguntas;
    }
}

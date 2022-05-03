
/**
 *
 * @author laura
 */
public class Pregunta {

    private String enunciado;

    private int respuestavalida;

    private String[] respuestas;

    public Pregunta(String enunciado, int respuestavalida, String[] respuestas) {
        this.enunciado = enunciado;
        this.respuestavalida = respuestavalida;
        this.respuestas = respuestas;
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestavalida
     */
    public int getRespuestavalida() {
        return respuestavalida;
    }

    /**
     * @param respuestavalida the respuestavalida to set
     */
    public void setRespuestavalida(int respuestavalida) {
        this.respuestavalida = respuestavalida;
    }

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }
    
    
    
}


/**
 *
 * @author laura
 */
public class Alumno extends Persona {

    private double notamedia;

    private Modulo[] matricula;

    public Alumno(double notamedia, Modulo[] matricula) {
        this.notamedia = notamedia;
        this.matricula = matricula;
    }
    

    /**
     *
     */
    public void emitirCertificado() {
    }

    /**
     *
     * @return
     */
    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     */
    public void matricular() {
    }

    /**
     * @return the notamedia
     */
    public double getNotamedia() {
        return notamedia;
    }

    /**
     * @param notamedia the notamedia to set
     */
    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }
}

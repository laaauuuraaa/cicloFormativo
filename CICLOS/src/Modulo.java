
/**
 *
 * @author laura
 */
public class Modulo {

    private String nombre;

    private String contenidos;

    private int horas;

    private Alumno[] alumnado;

    private Profesor[] claustro;

    private Examen pruebaexamen;

    private Tarea pruebaTarea;

    public Modulo(String nombre, String contenidos, int horas, Alumno[] alumnado, Profesor[] claustro, Examen pruebaexamen, Tarea pruebaTarea) {
        this.nombre = nombre;
        this.contenidos = contenidos;
        this.horas = horas;
        this.alumnado = alumnado;
        this.claustro = claustro;
        this.pruebaexamen = pruebaexamen;
        this.pruebaTarea = pruebaTarea;
    }
    
    

    /**
     *
     */
    public void matricularAlumno() {
    }

    /**
     *
     */
    public void contratarProfesor() {
    }

    /**
     *
     */
    public void evaluarAlumno() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contenidos
     */
    public String getContenidos() {
        return contenidos;
    }

    /**
     * @param contenidos the contenidos to set
     */
    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the alumnado
     */
    public Alumno[] getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * @return the claustro
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the pruebaexamen
     */
    public Examen getPruebaexamen() {
        return pruebaexamen;
    }

    /**
     * @param pruebaexamen the pruebaexamen to set
     */
    public void setPruebaexamen(Examen pruebaexamen) {
        this.pruebaexamen = pruebaexamen;
    }

    /**
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }
}

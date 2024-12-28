package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return getPaginas() * palabrasPagina * 5;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" +
           getTitulo() + "\n" +
           getAutor() + "\n" +
           getPaginas() + "\n" +
           this.idea + "\n" +
           this.argumentos.length + "\n" +
           this.conclusion + "\n" +
           this.referencias + "\n" +
           this.interpretacion;
    }

    public String getIdea() {
        return this.idea;
    }

    public String[] getArgumentos() {
        return this.argumentos;
    }

    public String getConclusion() {
        return this.conclusion;
    }

    public String getReferencias() {
        return this.referencias;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }
}

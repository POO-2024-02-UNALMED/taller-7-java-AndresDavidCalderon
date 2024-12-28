package comunicacion;

public class Fabula extends Escrito {
    private String interpretacion;
    private String ensenanzas;

    public Fabula(String origen, String titulo, String autor,int paginas, String ensenanzas, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanzas=ensenanzas;
        this.interpretacion=interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanzas;
    }
}

package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen,String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha=fecha;
        this.primicia=primicia;
        this.interpretacion=interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina*10;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+fecha+"\n"+primicia;
    }

    public String getFecha(){
        return this.fecha;
    }

    public String getPrimicia(){
        return this.primicia;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion=interpretacion;
    }

    public void setFecha(String fecha){
        this.fecha=fecha;
    }

    public void setPrimicia(String primicia){
        this.primicia=primicia;
    }
}

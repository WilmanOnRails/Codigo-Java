public class serie {
 private String titulo;
 private String genero;
 private String creador;
 private int temporadas;
 private boolean entregado;
public final boolean entregado_def = false;
 public final int temporadas_def = 3;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


 
 public serie(){}

 public serie(String genero,String creador){
    setGenero(genero);
    setCreador(creador);
    this.entregado = entregado_def;
    setTemporadas(temporadas_def);
    setTitulo("");
 }

 public serie(String genero,String creador,int temporadas,String titulo){
     setGenero(genero);
     setCreador(creador);
     setTemporadas(temporadas);
     setTitulo(titulo);
 }

 @Override
 public String toString(){
     return "El genero es " + getGenero() + ",el creador es " + getCreador() + ",el titulo es " + getTitulo()
     + ",las temporadas son " + getTemporadas() + ", entregado " + this.entregado;
 }


 




}

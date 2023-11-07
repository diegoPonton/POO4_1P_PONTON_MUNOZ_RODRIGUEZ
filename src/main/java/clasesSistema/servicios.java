package clasesSistema;

public class servicios {
    private String fecha;
    private ruta ruta;
    private conductor conductor;
    private long valorPagar;
    private int identificadorUnico;

    public servicios(String fecha, ruta ruta, conductor conductor, long valorPagar, int identificadorUnico) {
        this.fecha = fecha;
        this.ruta = ruta;
        this.conductor = conductor;
        this.valorPagar = valorPagar;
        this.identificadorUnico = identificadorUnico;
    }

    public servicios(){

    }

    public String getFecha() {
        return fecha;
    }

    public clasesSistema.ruta getRuta() {
        return ruta;
    }

    public clasesSistema.conductor getConductor() {
        return conductor;
    }

    public long getValorPagar() {
        return valorPagar;
    }

    public int getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setRuta(clasesSistema.ruta ruta) {
        this.ruta = ruta;
    }

    public void setConductor(clasesSistema.conductor conductor) {
        this.conductor = conductor;
    }

    public void setValorPagar(long valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void setIdentificadorUnico(int identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

}

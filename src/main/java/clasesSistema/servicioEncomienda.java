package clasesSistema;

public class servicioEncomienda extends servicios{
    private int cantidadProductos;
    private int peso;

    private TIPO_ENCOMIENDA tipoEncomienda;

    public servicioEncomienda(String fecha, clasesSistema.ruta ruta, clasesSistema.conductor conductor, long valorPagar, int identificadorUnico, int cantidadProductos, int peso, TIPO_ENCOMIENDA tipoEncomienda) {
        super(fecha, ruta, conductor, valorPagar, identificadorUnico);
        this.cantidadProductos = cantidadProductos;
        this.peso = peso;
        this.tipoEncomienda = tipoEncomienda;
    }

}



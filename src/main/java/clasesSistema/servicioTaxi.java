package clasesSistema;

public class servicioTaxi extends servicios{
    private int numeroPersonas;

    public servicioTaxi(String fecha, ruta ruta, conductor conductor, long valorPagar, int identificadorUnico,int numeroPersonas){

        super(fecha, ruta, conductor, valorPagar, identificadorUnico);

        this.numeroPersonas = numeroPersonas;

    }

}

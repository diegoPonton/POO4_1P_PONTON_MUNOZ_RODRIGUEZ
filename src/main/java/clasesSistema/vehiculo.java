package clasesSistema;

public class vehiculo {
    private String placa;
    private String modelo;
    private TIPO_VEHICULO tipoVehiculo;

    public vehiculo(String placa, String modelo, TIPO_VEHICULO tipoVehiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }
}

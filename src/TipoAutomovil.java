public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano",4),
    STATION_WAGON("Starion Wagon","Auto grande",5),
    HATCHBACK("Hatchback","Auto compacto",5),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupé","Auto pequeño",2),
    CONVERTIBLE("Convertible","Auto deportivo",2),
    FURGON("Furgón","Auto utilitario",3);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
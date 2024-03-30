package aPOO.auto;

public enum TipoAuto {
    SEDAN ("Sedan","Auto mediano",4),
    STATION_WAGON("Station Wagon","Auto grande",4),
    HATCHBACK("Hatchback","Auto compacto",4),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupe","Auto Pequeño",2),
    CONVERTIBLE("Covertible","Aut depertivo",2),
    FURGON("Furgon","Auto utilitario",2),
    SUV("Suv", "Todo terrenom", 5);

    private  final String nombre;
    private  final  String descripcion;
    private  final int  numeroPuertas;

    TipoAuto(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nombre = ").append(nombre).append('\'');
        sb.append(", descripcion = ").append(descripcion).append('\'');
        sb.append(", numeroPuertas = ").append(numeroPuertas);
        return sb.toString();
    }
}

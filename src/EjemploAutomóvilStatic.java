import java.util.Date;

public class EjemploAutomóvilStatic {
    public static void main(String[] args) {
        Automóvil subaru = new Automóvil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automóvil mazda = new Automóvil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));

        Automóvil nissan = new Automóvil("Nisan","Navara",Color.GRIS,new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));

        Automóvil nissan2 = new Automóvil("Nisan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.BENCINA),new Estanque(50));
        nissan2.setColor(Color.AMARILLO);

        Automóvil auto = new Automóvil();

        Automóvil.setColorPatente(Color.AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automóvil.getColorPatente() = " + Automóvil.getColorPatente());
        System.out.println("\n==========================================================================\n");

        System.out.println("Método ESTÁTICO calcularConsumoESTATICO");
        System.out.println("Kilómetros por litro CLASE AUTOMÓVIL (forma correcta Automóvil.calcularConsumoESTATICO ) = " + Automóvil.calcularConsumoESTATICO(300,60));
        System.out.println("Kilómetros por litro SUBARU = " + subaru.calcularConsumoESTATICO(300,60));
        System.out.println("Kilómetros por litro NISSAN = " + nissan.calcularConsumoESTATICO(300,60));
        System.out.println("Kilómetros por litro MAZDA = " + mazda.calcularConsumoESTATICO(300,60));
        System.out.println("\n==========================================================================\n");

        Automóvil.setCapacidadEstanqueESTATICO(45);
        System.out.println("Método ESTÁTICO set.calcularConsumoESTATICO = " + Automóvil.getCapacidadEstanqueESTATICO());
        System.out.println("Kilómetros por litro CLASE AUTOMÓVIL (forma correcta Automóvil.calcularConsumoESTATICO) = " + Automóvil.calcularConsumoESTATICO(300,60));
        System.out.println("Kilómetros por litro SUBARU = " + subaru.calcularConsumoESTATICO(300,60));
        System.out.println("Kilómetros por litro NISSAN = " + nissan.calcularConsumoESTATICO(300,60));
        System.out.println("Kilómetros por litro MAZDA = " + mazda.calcularConsumoESTATICO(300,60));
        System.out.println("\n==========================================================================\n");

        System.out.println("Atributos 'static'\n");
        System.out.println("Automóvil.VELOCIDAD_MAX_CARRETERA = " + Automóvil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automóvil.VELOCIDAD_MAX_CIUDAD =" + Automóvil.VELOCIDAD_MAX_CIUDAD);

    }
}


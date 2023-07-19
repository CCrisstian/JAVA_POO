import java.util.Date;

public class EjemploAutomóvilStatic {
    public static void main(String[] args) {
        Automóvil subaru = new Automóvil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automóvil mazda = new Automóvil("Mazda","BT-50","Rojo",3.0,60);

        Automóvil nissan = new Automóvil("Nisan","Navara","Gris oscuro",3.5,50);
        Automóvil nissan2 = new Automóvil("Nisan","Navara","Gris oscuro",3.5,50);

        Automóvil auto = new Automóvil();

        Automóvil.setColorPatente("AZUL");

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
    }
}


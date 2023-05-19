public class EjemploAutomóvil {
    public static void main(String[] args) {
        Automóvil subaru = new Automóvil();
        subaru.cilindrada = 2.0;
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.color = "azul";
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        Automóvil mazda = new Automóvil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));

    }
}


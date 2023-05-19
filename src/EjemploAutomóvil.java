import javax.swing.*;

public class EjemploAutomóvil {
    public static void main(String[] args) {
        Automóvil subaru = new Automóvil();
        subaru.setCilindrada(2.0);
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setColor("azul");
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        Automóvil mazda = new Automóvil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");
        System.out.println("mazda fabricante --> "+mazda.getFabricante());
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilómetros por litro "+ subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilómetros por litro "+subaru.calcularConsumo(300,60));
        JOptionPane.showMessageDialog(null,mazda.verDetalle(),"Auto",JOptionPane.INFORMATION_MESSAGE, mazda.getIcono());

    }
}


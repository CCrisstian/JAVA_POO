import javax.swing.*;
import java.util.Date;

public class EjemploAutomóvil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0,TipoMotor.BENCINA);

        Automóvil subaru = new Automóvil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.BLANCO);
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println("==============================================\n");

        Motor motorMazda = new Motor(3.0,TipoMotor.DIESEL);
        Automóvil mazda = new Automóvil("Mazda","BT-50",Color.ROJO,motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilómetros por litro "+ subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilómetros por litro "+subaru.calcularConsumo(300,60));
        System.out.println("==============================================\n");

        Automóvil nissan = new Automóvil("Nisan","Navara",Color.GRIS,new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        System.out.println(nissan.verDetalle());
        System.out.println("Kilómetros por litro "+ nissan.calcularConsumo(300,60));
        System.out.println("==============================================\n");

        Automóvil nissan2 = new Automóvil("Nisan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.BENCINA),new Estanque(50));
        System.out.println("¿nissan == nissan2? --> " + (nissan == nissan2));
        /*"==" se utiliza para comparar la igualdad entre dos objetos o valores primitivos. Cuando se utiliza con objetos,
        el operador "==" compara las referencias de los objetos, es decir, verifica si ambos objetos apuntan a la misma
        ubicación de memoria. Esto significa que "==" devuelve verdadero solo si ambos operandos se refieren exactamente
        al mismo objeto en la memoria.*/

        System.out.println("¿nissan.equals(nissan2)? --> " + (nissan.equals(nissan2)));
        /*El método "equals" se utiliza para comparar la igualdad semántica entre dos objetos.
        La clase Object de Java proporciona una implementación predeterminada de "equals", que
        es equivalente a usar el operador "==" y compara las referencias de los objetos. Sin
        embargo, muchas clases personalizadas en Java sobrescriben el método "equals" para
        proporcionar una comparación significativa de igualdad basada en los valores internos de
        los objetos.*/

        Automóvil auto = new Automóvil();
        System.out.println("\n¿auto.equals(nissan)? --> " + auto.equals(nissan));

        Date fecha = new Date();
        System.out.println("\n¿auto.equals(fecha)? --> " + auto.equals(fecha));
        System.out.println("==============================================\n");

        System.out.println(nissan);
        System.out.println("\nUsando el método toString() sobrescrito");
        System.out.println(nissan.toString());

        /**JOptionPane.showMessageDialog(null,mazda,"Auto",JOptionPane.INFORMATION_MESSAGE, mazda.getIcono());**/


    }
}


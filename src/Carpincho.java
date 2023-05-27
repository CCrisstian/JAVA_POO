import javax.swing.*;

public class Carpincho {
    private String Descripción = "Tiene un cuerpo pesado en forma de barril\n y una cabeza pequeña\n, con un pelaje pardo rojizo en la parte superior del cuerpo \nque se vuelve pardo amarillo.\nPuede crecer hasta 1,30 m de largo y llegar a pesar 65 kg.";
    private String Reino = "Animalia";
    private String Especie = "H. hydrochaeris";
    private ImageIcon icono = new ImageIcon("C:\\JAVA\\JAVA_POO\\src\\carpincho.jpg");

    public String getDescripción() {
        return Descripción;
    }

    public String getReino() {
        return Reino;
    }

    public String getEspecie() {
        return Especie;
    }

    public ImageIcon getIcono() {
        return icono;
    }

    @Override
    public String toString() {
        return "Descripción ='" + Descripción +
                "\n\nReino ='" + Reino +
                "\n\nEspecie ='" + Especie;
    }
}

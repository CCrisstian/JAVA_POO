import javax.swing.*;
import java.awt.*;
public class Automóvil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadEstanque = 40;

    //*MÉTODOS GET(LEER)*//
    public String getFabricante() {
        return fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    //*MÉTODOS SET(ACTUALIZAR-ESCRIBIR)*//
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    private ImageIcon icono = new ImageIcon("C:\\JAVA\\JAVA_POO\\src\\auto.jpg");

    public ImageIcon getIcono() {
        return icono;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto = " + this.fabricante);
        sb.append("\nauto = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada +"\n");
        return sb.toString();
    }
    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm\n";
    }

    public  String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!\n";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km,float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);
    }
    public float calcularConsumo(int km,int porcentajeBencina){
        return km/(capacidadEstanque*(porcentajeBencina/100f));
    }


}

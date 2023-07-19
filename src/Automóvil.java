import javax.swing.*;
import java.awt.*;
public class Automóvil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;

    private static String colorPatente = "Naranja";
    /*En Java, la palabra clave "static" se utiliza para declarar un miembro de clase que pertenece a la clase en sí
    misma, en lugar de pertenecer a instancias individuales de la clase. Esto significa que el atributo o método está
    asociado a la clase en general, y no a objetos específicos creados a partir de la clase.

    Cuando se declara un atributo como static, solo existe una única copia de ese atributo compartido por todas las
    instancias de la clase. Esto significa que si se modifica el valor de un atributo estático en una instancia, ese
    cambio se reflejará en todas las demás instancias y en la propia clase.*/

    private static int capacidadEstanqueESTATICO = 30;

    private int id;
    private static int ultimoId;


    //*---------------MÉTODOS GET(LEER)------------------------------*//
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
    public static String getColorPatente() {
        return colorPatente;
    }
    public static int getCapacidadEstanqueESTATICO() {
        return capacidadEstanqueESTATICO;
    }
    public int getId() {
        return id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    //*-------------------MÉTODOS SET(ACTUALIZAR-ESCRIBIR)------------------------------*//
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
    public static void setColorPatente(String colorPatente) {
        Automóvil.colorPatente = colorPatente;
    }
    public static void setCapacidadEstanqueESTATICO(int capacidadEstanqueESTATICO) {
        Automóvil.capacidadEstanqueESTATICO = capacidadEstanqueESTATICO;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*----------------------------------------IMAGEN-----------------------------------------*/
    private ImageIcon icono = new ImageIcon("C:\\JAVA\\JAVA_POO\\src\\auto.jpg");
    public ImageIcon getIcono() {
        return icono;
    }
    /*----------------------------------------IMAGEN-----------------------------------------*/


    public Automóvil(){
        this.id = ++ultimoId;
    }
    public Automóvil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automóvil(String fabricante, String modelo, String color) {
        this(fabricante,modelo);
        this.color = color;
    }
    public Automóvil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }
    public Automóvil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }


    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Auto = " + this.fabricante);
        sb.append("\nModelo = " + this.modelo);
        sb.append("\nTipo = " + this.tipo);
        sb.append("\nColor = " + this.color);
        sb.append("\nCilindrada = " + this.cilindrada);
        sb.append("\nColorPatente = " + Automóvil.colorPatente);
        sb.append("\nId = " + id + "\n");
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
    public static float calcularConsumoESTATICO(int km, int porcentajeBencina){
        return km/(Automóvil.capacidadEstanqueESTATICO * (porcentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(!(obj instanceof Automóvil)){
            return false;
        }
        Automóvil a = (Automóvil)obj;
        return (this.fabricante != null && this.fabricante.equals(a.getFabricante())
                && this.modelo != null && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automóvil{\n" +
                "\tfabricante = " + fabricante +
                "\n\tmodelo = " + modelo +
                "\n\tcolor = " + color +
                "\n\tcilindrada = " + cilindrada +
                "\n\tcapacidadEstanque = " + capacidadEstanque +
                "\n\tid = " + id +"\n}";
    }

}

import javax.swing.*;
import java.awt.*;
public class Automóvil {

    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;
    private static Color colorPatente = Color.NARANJO;
    /*En Java, la palabra clave "static" se utiliza para declarar un miembro de clase que pertenece a la clase en sí
    misma, en lugar de pertenecer a instancias individuales de la clase. Esto significa que el atributo o método está
    asociado a la clase en general, y no a objetos específicos creados a partir de la clase.

    Cuando se declara un atributo como static, solo existe una única copia de ese atributo compartido por todas las
    instancias de la clase. Esto significa que si se modifica el valor de un atributo estático en una instancia, ese
    cambio se reflejará en todas las demás instancias y en la propia clase.*/

    private static int capacidadEstanqueESTATICO = 30;

    private int id;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;

    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    //*---------------MÉTODOS GET(LEER)------------------------------*//
    public String getFabricante() {
        return fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public Color getColor() {
        return color;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }
    public static Color getColorPatente() {
        return colorPatente;
    }
    public static int getCapacidadEstanqueESTATICO() {
        return capacidadEstanqueESTATICO;
    }
    public int getId() {
        return id;
    }

    //*-------------------MÉTODOS SET(ACTUALIZAR-ESCRIBIR)------------------------------*//
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }
    public static void setColorPatente(Color colorPatente) {
        Automóvil.colorPatente = colorPatente;
    }
    public static void setCapacidadEstanqueESTATICO(int capacidadEstanqueESTATICO) {
        Automóvil.capacidadEstanqueESTATICO = capacidadEstanqueESTATICO;
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

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    /*Cuando se declara un atributo como final y estático,
    significa que se comparte entre todas las instancias de
    la clase y su valor no puede ser modificado en ningún lugar
    del código, ya sea en el constructor, en métodos o en
    cualquier otro contexto*/


    public Automóvil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }
    public Automóvil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }
    public Automóvil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }


    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto = " + this.fabricante);
        sb.append("\nauto = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        sb.append("\nauto.colorPatente = " + Automóvil.colorPatente);
        sb.append("\nauto.id = " + id + "\n");
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

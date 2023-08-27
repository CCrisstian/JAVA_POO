import javax.swing.*;
import java.awt.*;
public class Automóvil {

    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private TipoAutomovil tipoAutomovil;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

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

    public static Color getColorPatente() {
        return colorPatente;
    }
    public static int getCapacidadEstanqueESTATICO() {
        return capacidadEstanqueESTATICO;
    }
    public int getId() {
        return id;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public Motor getMotor() {
        return motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
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

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
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

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
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
    public Automóvil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }
    public Automóvil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }

    public Automóvil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas, ImageIcon icono) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
        this.icono = icono;
    }


    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.motor.getCilindrada());
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
        return km/(estanque.getCapacidad()*porcentajeBencina);
    }
    public float calcularConsumo(int km,int porcentajeBencina){
        return km/(estanque.getCapacidad()*(porcentajeBencina/100f));
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
                "\n\tcilindrada = " + motor.getCilindrada() +
                "\n\tcapacidadEstanque = " + estanque.getCapacidad() +
                "\n\tid = " + id +"\n}";
    }


}

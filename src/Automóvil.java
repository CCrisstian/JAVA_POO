public class Automóvil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;
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

}

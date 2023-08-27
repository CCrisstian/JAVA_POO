public class EjemploAutomóvilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Cristian","Cristaldo");

        Rueda[] ruedasSubaru = new Rueda[10];

        Automóvil subaru = new Automóvil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Persona conductorMazda = new Persona("Yona","Andrade");
        Automóvil mazda = new Automóvil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipoAutomovil(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);


        Persona conductorNissan = new Persona("Samuel","Lugo");
        Automóvil nissan = new Automóvil("Nissan","Narva", Color.GRIS, new Motor(4.0,TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(conductorNissan);


        Persona conductorSusuki = new Persona("Cristian","Alejandro");
        Automóvil susuki = new Automóvil("Susuki","Vitara",Color.GRIS,new Motor(1.6,TipoMotor.BENCINA),new Estanque(50));
        susuki.setConductor(conductorSusuki);
        susuki.setColor(Color.AMARILLO);
        susuki.setTipoAutomovil(TipoAutomovil.SUV);
        Automóvil.setColorPatente(Color.AZUL);

        Automóvil audi = new Automóvil("Audi","A3");
        audi.setConductor(new Persona("Jona","Andrade"));


    }
}


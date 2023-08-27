public class EjemploAutomóvilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Cristian","Cristaldo");

        Rueda[] ruedasSubaru = new Rueda[10];

        Automóvil subaru = new Automóvil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        for (int i = 0; i < ruedasSubaru.length; i++){
            subaru.addRuedas(new Rueda("Yokohama",16,7.5));
        }


        Persona conductorMazda = new Persona("Yona","Andrade");

        Rueda[] ruedasMazda = new Rueda[5];

        Automóvil mazda = new Automóvil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipoAutomovil(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);
        for (int i = 0; i < ruedasMazda.length; i++){
            mazda.addRuedas(new Rueda("Yokohama",16,7.5));
        }


        Persona conductorNissan = new Persona("Samuel","Lugo");

        Automóvil nissan = new Automóvil("Nissan","Narva", Color.GRIS, new Motor(4.0,TipoMotor.DIESEL), new Estanque(50), conductorNissan,null,null);
        nissan.addRuedas(new Rueda("Pireli", 20, 11.5))
                .addRuedas(new Rueda("Pireli", 20, 11.5))
                .addRuedas(new Rueda("Pireli", 20, 11.5))
                .addRuedas(new Rueda("Pireli", 20, 11.5))
                .addRuedas(new Rueda("Pireli", 20, 11.5));

        Persona conductorNissan2 = new Persona("Cristian","Alejandro");

        Rueda[] ruedasNissan2 = {new Rueda("Pireli", 20, 11.5),
                new Rueda("Pireli", 20, 11.5),
                new Rueda("Pireli", 20, 11.5),
                new Rueda("Pireli", 20, 11.5),
                new Rueda("Pireli", 20, 11.5),
        };

        Automóvil nissan2 = new Automóvil("Nisan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.BENCINA),new Estanque(50),conductorNissan2,ruedasNissan2,null);
        nissan2.setColor(Color.AMARILLO);

        Automóvil auto = new Automóvil();

        Automóvil.setColorPatente(Color.AZUL);

        System.out.println(subaru.verDetalle() + "\n");
        System.out.println(mazda.verDetalle() + "\n");
        System.out.println(nissan.verDetalle() + "\n");
        System.out.println(nissan2.verDetalle());


    }
}


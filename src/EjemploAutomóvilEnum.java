public class EjemploAutomóvilEnum {
    public static void main(String[] args) {
        Automóvil subaru = new Automóvil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automóvil mazda = new Automóvil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipoAutomovil(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        
        TipoAutomovil tipo = subaru.getTipoAutomovil();
        System.out.println("tipoSubaru = " + tipo.getNombre());
        System.out.println("tipoSubaru Descripción = " + tipo.getDescripcion());
        System.out.println("tipoSubaru N° de puertas = " + tipo.getNumeroPuerta());

        tipo = mazda.getTipoAutomovil();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automóvil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automóvil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automóvil mediado compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automóvil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automóvil mediano");
            case STATION_WAGON -> System.out.println("Es un automóvil grande, con maleta grande ...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta : tipos){
            System.out.println(ta + " -> " + ta.name() +
                    " , " + ta.getNombre() + " , "
                    + ta.getDescripcion() + " , "
                    + ta.getNumeroPuerta() + " , \n");
        }

    }
}


import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;

public class EjemploClaseCarpincho {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
        Carpincho carpincho = new Carpincho();

        // Cargar el archivo de sonido
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                EjemploClaseCarpincho.class.getResourceAsStream("carpincho.wav"));

        // Crear un clip de sonido y abrir el flujo de audio
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        // Reproducir el sonido
        clip.start();

        JOptionPane.showMessageDialog(null,carpincho,"Carpincho",JOptionPane.INFORMATION_MESSAGE,carpincho.getIcono());

        // Esperar a que termine el sonido
        Thread.sleep(clip.getMicrosecondLength() / 1000);

        // Cerrar el clip de sonido y el flujo de audio
        clip.stop();
        clip.close();
        audioInputStream.close();
    }
}

import javax.swing.*;
import java.awt.*;

public class NewArrivals extends JFrame{
    private JPanel jPanelNewArrivals;
    private JButton ropaHombreButton;
    private JButton ropaMujerButton;
    private JLabel mujer1;
    private JLabel star1;
    private JLabel mujer2;
    private JLabel star2;

    public  NewArrivals(){
        setContentPane(jPanelNewArrivals);
        mostrarImagenMujer1("VogueVibesProyectoFinal/src/Img/1.png",240,200);
        mostrarImagenMujer2("VogueVibesProyectoFinal/src/Img/2.png",240,200);
        mostrarImagenStar1("VogueVibesProyectoFinal/src/Img/star.png",90,30);
        mostrarImagenStar2("VogueVibesProyectoFinal/src/Img/star2.png",94,26);

    }

    private void mostrarImagenStar2(String ruta, int ancho, int alto) {
        ImageIcon ic = new ImageIcon(ruta);
        Image imagen = ic.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        star2.setIcon(new ImageIcon(imagen));
    }

    private void mostrarImagenMujer2(String ruta, int ancho, int alto) {
        ImageIcon ic = new ImageIcon(ruta);
        Image imagen = ic.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        mujer2.setIcon(new ImageIcon(imagen));
    }

    private void mostrarImagenStar1(String ruta, int ancho, int alto) {
        ImageIcon ic = new ImageIcon(ruta);
        Image imagen = ic.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        star1.setIcon(new ImageIcon(imagen));
    }

    private void mostrarImagenMujer1(String ruta, int ancho, int alto) {
        ImageIcon ic = new ImageIcon(ruta);
        Image imagen = ic.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        mujer1.setIcon(new ImageIcon(imagen));
    }

    public static void main(String[] args) {
        JFrame frame= new NewArrivals();
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
}

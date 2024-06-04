import javax.swing.*;
import javax.swing.border.Border;

public class InicioP1 extends JFrame{
    private JPanel panel1;
    private JButton inicioButton;
    private JButton hombreButton;
    private JButton mujerButton;
    private JButton entrarButton;
    private JButton registrarseButton;
    private JPanel panelIzquierdo;
    private JLabel IInicio_p1;
    private JLabel ImagenDerecha;
    private JLabel ImagenIzquierda;
    private JLabel imagenAbajo;
    private JLabel ImagenArriba;
    private JButton newArrBtn;
    private JPanel panelDerecho;



    public InicioP1(){
        setContentPane(panel1);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        hombreButton.setBorder(emptyBorder);
        mujerButton.setBorder(emptyBorder);
        inicioButton.setBorder(emptyBorder);
        mostrarImagenes();
    }


    public static void main(String[] args) {
        JFrame frame= new InicioP1();
        frame.setVisible(true);

        frame.pack();

    }

    public void mostrarImagenes(){
        ImageIcon iIzq = new ImageIcon("VogueVibesProyectoFinal/src/Img/hombreIzquierdaInicio.png");
        ImagenIzquierda.setIcon(iIzq);
        ImageIcon iDer = new ImageIcon("VogueVibesProyectoFinal/src/Img/hombreDerechaInicio.png");
        ImagenDerecha.setIcon(iDer);
        ImageIcon iAbaj = new ImageIcon("VogueVibesProyectoFinal/src/Img/abajoInicio.png");
        imagenAbajo.setIcon(iAbaj);
        ImageIcon iArr = new ImageIcon("VogueVibesProyectoFinal/src/Img/arribaInicio.png");
        ImagenArriba.setIcon(iArr);


    }

  /*  private void mostrarImagenIzq(String ruta, int ancho, int alto) {
        ImageIcon ic = new ImageIcon(ruta);
        Image imagen = ic.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        imagenIzquierda.setIcon(new ImageIcon(imagen));
    }
*/

}
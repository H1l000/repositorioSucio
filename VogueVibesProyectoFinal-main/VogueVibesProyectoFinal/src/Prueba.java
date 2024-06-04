import javax.swing.*;
import javax.swing.border.Border;

public class Prueba extends JFrame{
    private JPanel panel1;
    private JButton inicioButton;
    private JButton hombreButton;
    private JButton mujerButton;
    private JButton entrarButton;
    private JButton registrarseButton;


    public Prueba(){
        setContentPane(panel1);

    }


    public static void main(String[] args) {
        JFrame frame= new Prueba();
        frame.setVisible(true);
        frame.setSize(1200, 1000);

    }


}

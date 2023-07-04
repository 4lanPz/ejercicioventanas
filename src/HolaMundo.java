import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo {
    private JPanel rootpanel;
    private JButton okButton;
    private JLabel resultado;
    private JTextField num1;
    private JTextField num2;
    private JLabel resultado2;
    private JLabel Peso;
    private JLabel Masa;
    private JLabel titulo;
    private JButton CALCULARRESULTADOButton;
    int i=0;
    double numero1,numero2,num3,numero3;
    public HolaMundo() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("a");
                i++;
                resultado.setText("clickeaste "+i+" veces");
            }
        });
        CALCULARRESULTADOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1=Double.parseDouble(num1.getText());
                numero2=Double.parseDouble(num2.getText());
                num3=numero1/numero2;
                resultado2.setText("SU IMC ES: "+num3);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

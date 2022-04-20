import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends Component {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField firstNumber;
    private JLabel label2;
    private JTextField secondNumber;
    private JTextField Antwoord;
    private JButton buttoncalculate;

    public View(String title){

        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.add(panel);
        label = new JLabel("Rekenmachine : ");
        panel.add(label);
        firstNumber = new JTextField(8);
        panel.add(firstNumber);
        label2 = new JLabel("+");
        panel.add(label2);
        secondNumber = new JTextField(8);
        panel.add(secondNumber);
        Antwoord = new JTextField(8);
        panel.add(Antwoord);
        buttoncalculate = new JButton("Calculate !");
        panel.add(buttoncalculate);


        frame.setVisible(true);

    }
    public double getfirstNumber(){
        return Double.parseDouble(firstNumber.getText());
    }
    public double getsecondNumber(){
        return Double.parseDouble(secondNumber.getText());
    }
    public double Antwoord(){
        return Double.parseDouble(Antwoord.getText());
    }
    public void setAntwoord(double antwoord){
        Antwoord.setText(Double.toString(antwoord));
    }
    public void addCalculationListener(ActionListener listenfc){
        buttoncalculate.addActionListener(listenfc);
    }
    void displayErrorM(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
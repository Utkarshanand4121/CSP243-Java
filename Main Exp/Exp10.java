import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp10 extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public Exp10() {
        setTitle("Integer Division Calculator");
        setLayout(null);

        JLabel num1Label = new JLabel("Num1:");
        num1Label.setBounds(10, 10, 100, 20);
        add(num1Label);
 
        num1Field = new JTextField();
        num1Field.setBounds(120, 10, 100, 20);
        add(num1Field);

        JLabel num2Label = new JLabel("Num2:");
        num2Label.setBounds(10, 40, 100, 20);
        add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(120, 40, 100, 20);
        add(num2Field);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(10, 70, 100, 30);
        add(divideButton);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }

                    int result = num1 / num2;
                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Exp10.this, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(Exp10.this, "Division by zero is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        resultField = new JTextField();
        resultField.setBounds(10, 110, 210, 20);
        resultField.setEditable(false);
        add(resultField);

        setSize(250, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exp10();
            }
        });
    }
}
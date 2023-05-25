import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField textField;

    public Calculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Create the text field
        textField = new JTextField();
        textField.setEditable(false);
        frame.getContentPane().add(BorderLayout.NORTH, textField);

        // Create the panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Create the number buttons
        JButton[] numberButtons = new JButton[10];
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberButtonActionListener());
        }

        // Create the operation buttons
        JButton addButton = new JButton("+");
        addButton.addActionListener(new OperationButtonActionListener());
        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(new OperationButtonActionListener());
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new OperationButtonActionListener());
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(new OperationButtonActionListener());

        // Create the clear button
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonActionListener());

        // Create the equals button
        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(new EqualsButtonActionListener());

        // Add the buttons to the panel in the specified order
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(addButton);

        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(subtractButton);

        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(multiplyButton);

        buttonPanel.add(clearButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalsButton);

        // Add the button panel to the center of the frame
        frame.getContentPane().add(BorderLayout.CENTER, buttonPanel);

        // Make the frame visible
        frame.setVisible(true);
    }

    private class NumberButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton button = (JButton) event.getSource();
            String buttonText = button.getText();
            String currentText = textField.getText();
            textField.setText(currentText + buttonText);
        }
    }

    private class OperationButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton button = (JButton) event.getSource();
            String buttonText = button.getText();
            String currentText = textField.getText();
            textField.setText(currentText + " " + buttonText + " ");
        }
    }

    private class ClearButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            textField.setText("");
        }
    }

    private class EqualsButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String expression = textField.getText();
            String[] parts = expression.split(" ");
            if (parts.length == 3) {
                double operand1 = Double.parseDouble(parts[0]);
                double operand2 = Double.parseDouble(parts[2]);
                String operator = parts[1];

                double result = 0.0;
                if (operator.equals("+")) {
                    result = operand1 + operand2;
                } else if (operator.equals("-")) {
                    result = operand1 - operand2;
                } else if (operator.equals("*")) {
                    result = operand1 * operand2;
                } else if (operator.equals("/")) {
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Cannot divide by zero!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        textField.setText("");
                        return;
                    }
                }

                textField.setText(String.valueOf(result));
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid expression!", "Error", JOptionPane.ERROR_MESSAGE);
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}

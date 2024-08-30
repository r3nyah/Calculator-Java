/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telkom;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo 16IRX9 
 */

public class CalculatorEngine implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public CalculatorEngine(JTextField display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "Del":
                    if (display.getText().length() > 0) {
                        display.setText(display.getText().substring(0, display.getText().length() - 1));
                    }
                    break;
                case "Clr":
                    display.setText("");
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(display.getText());
                    operator = command.charAt(0);
                    display.setText("");
                    break;
                case "=":
                    num2 = Double.parseDouble(display.getText());
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            result = num1 / num2;
                            break;
                    }
                    display.setText(String.valueOf(result));
                    num1 = result;
                    break;
                case ".":
                    if (!display.getText().contains(".")) {
                        display.setText(display.getText() + ".");
                    }
                    break;
                default:
                    display.setText(display.getText() + command);
            }
        } catch (NumberFormatException ex) {
            display.setText("Error");
        }
    }
}

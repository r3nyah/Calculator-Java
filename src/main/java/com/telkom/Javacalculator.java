/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.telkom;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Lenovo 16IRX9 
 */
public class Javacalculator extends JFrame {
    private JTextField display;
    private CalculatorPanel calculatorPanel;

    public Javacalculator() {
        // Frame setup
        setTitle("Calculator");
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 43, 43));

        // Display setup
        display = new JTextField();
        display.setFont(new Font("SansSerif", Font.PLAIN, 24));
        display.setBounds(50, 25, 300, 50);
        display.setEditable(false);
        display.setBackground(new Color(60, 63, 65));
        display.setForeground(new Color(204, 204, 204));
        add(display);

        // Panel setup
        calculatorPanel = new CalculatorPanel(display);
        calculatorPanel.setBounds(50, 100, 300, 300);
        add(calculatorPanel);

        // Clear and delete buttons
        JButton delButton = new JButton("Delete");
        JButton clrButton = new JButton("Clear");
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        delButton.setFont(new Font("SansSerif", Font.PLAIN, 24));
        clrButton.setFont(new Font("SansSerif", Font.PLAIN, 24));
        delButton.setBackground(new Color(60, 63, 65));
        clrButton.setBackground(new Color(60, 63, 65));
        delButton.setForeground(new Color(204, 204, 204));
        clrButton.setForeground(new Color(204, 204, 204));
        delButton.setFocusable(false);
        clrButton.setFocusable(false);
        delButton.addActionListener(calculatorPanel.getCalculatorEngine());
        clrButton.addActionListener(calculatorPanel.getCalculatorEngine());
        add(delButton);
        add(clrButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Javacalculator();
    }
}
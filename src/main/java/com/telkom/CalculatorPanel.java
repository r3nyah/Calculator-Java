/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telkom;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Lenovo 16IRX9 
 */

public class CalculatorPanel extends JPanel {
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JTextField display;
    private CalculatorEngine calculatorEngine;

    public CalculatorPanel(JTextField display) {
        this.display = display;
        calculatorEngine = new CalculatorEngine(display);

        setLayout(new GridLayout(4, 4, 10, 10));
        setBackground(new Color(43, 43, 43));

        initializeButtons();
        addButtonsToPanel();
    }

    private void initializeButtons() {
        numberButtons = new JButton[10];
        functionButtons = new JButton[6];

        functionButtons[0] = createButton("+");
        functionButtons[1] = createButton("-");
        functionButtons[2] = createButton("*");
        functionButtons[3] = createButton("/");
        functionButtons[4] = createButton(".");
        functionButtons[5] = createButton("=");

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = createButton(String.valueOf(i));
        }
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.PLAIN, 24));
        button.setBackground(new Color(60, 63, 65));
        button.setForeground(new Color(204, 204, 204));
        button.setFocusable(false);
        button.addActionListener(calculatorEngine);
        return button;
    }

    private void addButtonsToPanel() {
        add(numberButtons[1]);
        add(numberButtons[2]);
        add(numberButtons[3]);
        add(functionButtons[0]); // addButton
        add(numberButtons[4]);
        add(numberButtons[5]);
        add(numberButtons[6]);
        add(functionButtons[1]); // subButton
        add(numberButtons[7]);
        add(numberButtons[8]);
        add(numberButtons[9]);
        add(functionButtons[2]); // mulButton
        add(functionButtons[4]); // decButton
        add(numberButtons[0]);
        add(functionButtons[5]); // equButton
        add(functionButtons[3]); // divButton
    }

    public CalculatorEngine getCalculatorEngine() {
        return calculatorEngine;
    }
}

package com.company.java1.paskaita20.swingintro;

import java.awt.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Mano programa");
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jPanel.setBackground(Color.LIGHT_GRAY);

        JCheckBox jCheckBox = new JCheckBox("Checkboxas");

        JPanel checboxJPanel = new JPanel(new GridLayout(0, 1));
        checboxJPanel.add(jCheckBox);

        JPanel radioJPanel = new JPanel();
        JRadioButton jRadioButton = new JRadioButton("Kažkoks pasirinkimas");
        radioJPanel.add(jRadioButton);
        JRadioButton jRadioButton1 = new JRadioButton("Kažkoks kitas pasirinkimas");
        radioJPanel.add(jRadioButton1);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);

        JPanel comboBoxJPanel = new JPanel();

        String[] metuLaikai = { "Vasara", "Ruduo", "Žiema", "Pavasaris" };
        JComboBox<String> jComboBox = new JComboBox<>(metuLaikai);
        jComboBox.setSelectedIndex(2);

        comboBoxJPanel.add(jComboBox);

        JLabel jLabel = new JLabel("Registracijos forma");
        JPanel textJPanel = new JPanel();
        JTextField jTextField = new JTextField(10);
        JPasswordField jPasswordField = new JPasswordField(10);

        textJPanel.add(jLabel);
        textJPanel.add(jTextField);
        textJPanel.add(jPasswordField);

        JButton jButton = new JButton("Paspausk");
        JButton jButtonTwo = new JButton("Paspausk (kitas)");

        jPanel.add(jButton);
        jPanel.add(jButtonTwo);

        JProgressBar jProgressBar = new JProgressBar();

        JList<String> jList = new JList<>(metuLaikai);

        jFrame.add(BorderLayout.SOUTH, jPanel);
        jFrame.add(BorderLayout.CENTER, checboxJPanel);
        jFrame.add(BorderLayout.NORTH, radioJPanel);
        jFrame.add(comboBoxJPanel);
        jFrame.add(textJPanel);
        jFrame.add(jProgressBar);
        jFrame.add(jList);

        jFrame.setVisible(true);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            jProgressBar.setValue(i);
        }
    }
}

package com.company.java1.paskaita20.swingexample;

import java.awt.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("AndriusSoft CRM");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Vardas: ");
        JTextField nameField = new JTextField(20);
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        JPanel surnamePanel = new JPanel();
        JLabel surnameLabel = new JLabel("Pavarde: ");
        JTextField surnameField = new JTextField(20);
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameField);

        JPanel nameSurnameJPanel = new JPanel(new GridLayout(0, 1));
        nameSurnameJPanel.add(namePanel);
        nameSurnameJPanel.add(surnamePanel);

        DefaultListModel<String> namesListModel = new DefaultListModel<>();

        JPanel actionButtonsJPanel = new JPanel();
        JButton insertButton = new JButton("Įtraukti į sąrašą");
        insertButton.addActionListener(e -> {
            String vardas = nameField.getText();
            String pavarde = surnameField.getText();
            namesListModel.addElement(vardas + " " + pavarde);
        });

        JButton clearButton = new JButton("Išvalyti sąrašą");
        clearButton.addActionListener(e -> {
            namesListModel.clear();
        });
        actionButtonsJPanel.add(insertButton);
        actionButtonsJPanel.add(clearButton);

        JList<String> nameSurnameList = new JList<>(namesListModel);

        JPanel formPanel = new JPanel(new GridLayout(0, 1));
        formPanel.add(nameSurnameJPanel);
        formPanel.add(actionButtonsJPanel);
        formPanel.add(nameSurnameList);

        jFrame.add(formPanel);

        jFrame.setVisible(true);
    }
}

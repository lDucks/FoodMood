/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author justin
 */
public class LoginUI extends JFrame {

    private LoginController loginCtrl = null;

    public LoginUI(LoginController aLoginCtrl) {
        loginCtrl = aLoginCtrl;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        screenWidth = Math.round(screenWidth / 4);
        screenHeight = Math.round(screenHeight / 4);
        this.setSize(screenWidth, screenHeight);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4, 4));

        JPanel[] cellNumbers = new JPanel[16];
        for (int c = 0; c < 16; c++) {
            JPanel nextPanel = new JPanel();
            cellNumbers[c] = nextPanel;
            loginPanel.add(nextPanel);
        }

        //Construct UI components
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setSize(30, 40);
        JButton submitButton = new JButton("Submit");
        submitButton.setSize(30, 40);
        JButton createUserButton = new JButton("Create User");
        createUserButton.setSize(30, 40);

        // Labels
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        // Text Fields
        JTextField usernameTextField = new JTextField(10);
        usernameTextField.setText("");
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setText("");

        // Add shortly
        cancelButton.addActionListener(new CancelListener());

        // Button stuff
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                String username = usernameTextField.getText();
                char[] password = passwordField.getPassword();
                boolean authenticated = loginCtrl.login(username, password);
                if (authenticated == true) {
                    //do some stuff since they a truthful guy
                    System.out.println("Aunthenticated");
                    //loginCtrl.requestNagivationCtrl(authenticated);
                } else {
                    //do other stuff since they a liar
                    System.out.println("Not Aunthenticated");

                }
            }
        });

        createUserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //loginCtrl.requestCreateUser();
            }
        });

        // Assembly
        cellNumbers[5].add(usernameLabel);
        cellNumbers[9].add(passwordLabel);
        cellNumbers[6].add(usernameTextField);
        cellNumbers[10].add(passwordField);
        cellNumbers[13].add(cancelButton);
        cellNumbers[14].add(submitButton);
        cellNumbers[15].add(createUserButton);

        // Finalizes panel layout
        this.add(loginPanel);

    }

    class CancelListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

}

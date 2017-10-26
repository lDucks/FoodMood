/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author jrc5713
 */
public class SignUpUI extends JFrame {

    public static JButton signUp;
    public static JPanel signUpUI;
    public static JTextField username;
    public static JTextField password;
    public static JTextField check;

    /**
     * The default constructor
     */
    public SignUpUI() {
        signUp = new JButton("Create");
        signUpUI = new JPanel();
        username = new JTextField(15);
        password = new JPasswordField(15);
        check = new JPasswordField(15);

        signUpUI.setSize(300, 200);
        signUpUI.setLayout(null);

        username.setBounds(70, 20, 150, 20);
        password.setBounds(70, 40, 150, 20);
        check.setBounds(70, 60, 150, 20);
        signUp.setBounds(110, 100, 80, 20);

        signUpUI.add(signUp);
        signUpUI.add(username);
        signUpUI.add(password);

        getContentPane().add(signUpUI);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpUI.setVisible(true);

        Writer writer = null;
        File confirm = new File("userPass.txt");
        if (confirm.exists()) {

            //Checks if the file exists. will not add anything if the file does exist.
        } else {
            try {
                File texting = new File("userPass.txt");
                writer = new BufferedWriter(new FileWriter(texting));
                writer.write("message");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
signUp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
         checkMatch(); 
        }
    });

                signUp.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            File file = new File("userInfo.txt");
                            Scanner scan = new Scanner(file);

                            FileWriter filewrite = new FileWriter(file, true);

                            String user = " ";
                            String pass = " ";
                            String punamer = username.getText();
                            String ppaswder = password.getText();
                            while (scan.hasNext()) {
                                user = scan.nextLine();
                                pass = scan.nextLine();
                            }

                            if (punamer.equals(user) && ppaswder.equals(pass)) {
                                JOptionPane.showMessageDialog(null, "Username is already in use");
                                username.setText("");
                                password.setText("");
                                username.requestFocus();

                            } else if (punamer.equals("") && ppaswder.equals("")) {
                                JOptionPane.showMessageDialog(null, "Please insert Username and Password");
                            } else {
                                filewrite.write(punamer + "\r\n" + ppaswder + "\r\n");
                                filewrite.close();
                                JOptionPane.showMessageDialog(null, "Account has been created.");
                                dispose();
                                login log = new login();

                            }
                        } catch (IOException d) {
                            d.printStackTrace();
                        }

                    }
                });
            }
 public static void checkMatch(){
        if(password.getText() != check.getText())
             JOptionPane.showMessageDialog(null,"Passwords do not match");
          check.setText("");
          password.setText("");
          password.requestFocus();
    }
           
}

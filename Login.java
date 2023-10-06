package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, Clear;
    JTextField cardTextField;
    JPasswordField pinTextField; 
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD, 32));
        text.setBounds(200,40,300,40);
        add(text);
//        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Osward",Font.BOLD, 26));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,155,250,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD, 26));
        pin.setBounds(120,200,300,100);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,240,250,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        Clear = new JButton("CLEAR");
        Clear.setBounds(450,300,100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(375,350,100,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(250, 100);
    }
    
    
    @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == Clear){
                cardTextField.setText(""); 
                pinTextField.setText("");
            }
            else if(ae.getSource() == login){
                conn c = new conn();
                String cardnumber = cardTextField.getText();
                String pinnumber = pinTextField.getText();
                String query = "Select*from signupThree where Card_Number = '"+cardnumber+"' and PIN_Number = '"+pinnumber+"'";
                // Here String cardnumber is the name of the data of the column of the table and Card_Number is the name of the table of the signupThree
            
                
                
//                else if(ae.getSource() == login){
//                conn c = new conn();
//                String cardnumber = cardTextField.getText();
//                String pinnumber = pinTextField.getText();
//                String query = "Select*from login where cardnumner = '"+cardnumber+"' and pin = '"+pinnumber+"'";
//            
                
                
            try{
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            }
            else if(ae.getSource() ==  signup){
                setVisible(false);
                signupOne s1 = new signupOne();
                s1.setVisible(true);
            }
        }  
    
    public static void main(String args[]) {
        new Login();
    }
}

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.Connection.*;
//import java.sql.PreparedStatement;



public class SignupThree extends JFrame implements ActionListener{
    
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton Submit, Cancel;
    String formno;
//    long formno;
    
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);  // we do setLayout null so that setBounds can work
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Releway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,90,200,30);
        add(type);
        
        
        r1 = new JRadioButton("Saving Account");  // Here we took a JRadioButton and we added a text Saving Account in that
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,140,200,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");  // Here we took a JRadioButton and we added a text Saving Account in that
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,140,200,20);
        add(r2);
        
        
        r3 = new JRadioButton("Current Account");  // Here we took a JRadioButton and we added a text Saving Account in that
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,175,200,20);
        add(r3);
        
        
        r4 = new JRadioButton("Recurring Deposit Account");  // Here we took a JRadioButton and we added a text Saving Account in that
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,175,200,20);
        add(r4);
        
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card = new JLabel("Card Number");  // Here again we made a Label and then write a Card Number Statement as an Argument.
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100,200,200,30);
        add(card);
        
        
        JLabel detail = new JLabel("This is your 16 digit card Number");  // Here again we made a Label and then write a Card Number Statement as an Argument.
        detail.setFont(new Font("Raleway", Font.BOLD, 10));
        detail.setBounds(100,230,200,10);
        add(detail);
        

        
        
        JLabel Card_Number  = new JLabel("XXXX-XXXX-XXXX-4184");
        Card_Number.setFont(new Font("Raleway", Font.BOLD, 22));
        Card_Number.setBounds(330,200,300,30);
        add(Card_Number);
        
        
        JLabel pin = new JLabel("PIN");  // Here again we made a Label and then write a Card Number Statement as an Argument.
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,260,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");  // Here again we made a Label and then write a Card Number Statement as an Argument.
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330,260,200,30);
        add(pnumber);
        
        
        JLabel pinnumber = new JLabel("This is Your 4 Digit Password");  // Here again we made a Label and then write a Card Number Statement as an Argument.
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 10));
        pinnumber.setBounds(100,290,200,15);
        add(pinnumber);
        
        
        JLabel services = new JLabel("Services Required:-");  // Here again we made a Label and then write a Card Number Statement as an Argument.
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,320,200,20);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 10));
        c1.setBounds(100,350,200,30);
        add(c1);
        
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 10));
        c2.setBounds(100,385,200,30);
        add(c2);
        
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 10));
        c3.setBounds(100,420,200,30);
        add(c3);
        
        
        c4 = new JCheckBox("Email & Messeges Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 10));
        c4.setBounds(100,455,200,30);
        add(c4);
        
        
        c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 10));
        c5.setBounds(100,490,200,30);
        add(c5);
        
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 10));
        c6.setBounds(100,525,200,30);
        add(c6);
        
        
        c7 = new JCheckBox("[] I hearby declare that all the inputs are correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 10));
        c7.setBounds(100,560,200,30);
        add(c7);
        
        Submit = new JButton("Submit");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Raleway", Font.BOLD, 14));
        Submit.setBounds(640,600,100,30);
        Submit.addActionListener(this);

        add(Submit);
        
        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        Cancel.setBounds(500,600,100,30);
        Cancel.addActionListener(this);

        add(Cancel);
        
        
        
        
        getContentPane().setBackground(Color.white);  // this line can make the whole page into white Color
        
        setSize(850,820);
        setLocation(250,0);
        setVisible(true);
        setBackground(Color.WHITE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }
            else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Reccuring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber ="" + Math.abs(random.nextLong() % 9000L) + 5040936L;
            
            String pinnumber = "" + Math.abs((random.nextLong()% 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            }
            else if(c2.isSelected()){
                facility = facility + "Iternet Banking";
            }
            else if(c3.isSelected()){
                facility = facility + "Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + "Email & SMS Alert";
            }
            else if(c5.isSelected()){
                facility = facility + "Check Book";
            }
            else if(c6.isSelected()){
                facility = facility + "E-Statement";
            }
            else if(c6.isSelected()){
                facility = facility + "Yes all the values given by user is correct, Checked";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                else{
                    conn C = new conn();
                    String query1 = "INSERT INTO signupThree (formno, Account_Type, Card_Number, PIN_Number, Facilities) "
                            + "VALUES('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    


                    C.s.executeUpdate(query1);
                    
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                    
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        




        }
        else if(ae.getSource() == Cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    
    public static void main(String args[]) {
        new SignupThree("");
        
    }
}

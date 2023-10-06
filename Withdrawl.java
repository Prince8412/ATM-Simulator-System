package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Withdrawl extends JFrame implements ActionListener{


    JButton withdraw, back;
    JTextField amount;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(185,285,700,35);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(185,325,240,30);
        image.add(amount);
        
        
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,482,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355,518,150,28);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(900,680);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == withdraw){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "please enter the amount you want to Withdraw");
            }
            else{
                try{
                    conn c = new conn();
                String query = "INSERT into  bank VALUES('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+number+" Withdraw Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
                }
                catch(Exception e){
                    System.out.print(e);
                }
            }
        }
        else if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    

    public static void main(String args[]) {
        // TODO code application logic here
        new Withdrawl("");
        
    }
}

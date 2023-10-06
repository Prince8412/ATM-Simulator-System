package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    JButton change, back;
    JPasswordField repin, pin;
    
    String pinnumber;
    PinChange(String pinchange){
        this.pinnumber = pinnumber;
    
    setLayout(null);
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel pintext = new JLabel("Change your PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(250,285,200,35);
        image.add(pintext);
        
        
        JLabel newpin = new JLabel("New PIN:");
        newpin.setForeground(Color.WHITE);
        newpin.setFont(new Font("System", Font.BOLD, 16));
        newpin.setBounds(165,325, 100,35);
        image.add(newpin);
        
        pin = new JPasswordField();
        pin.setFont(new Font("System", Font.BOLD, 16));
        pin.setBounds(325,327,175,28);
        image.add(pin);
        
        
        
        JLabel repintext = new JLabel("Re-Enter your PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setBounds(165,363, 150,35);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("System", Font.BOLD, 16));
        repin.setBounds(325,365,175,28);
        image.add(repin);
        
        change = new JButton("Change");        
        change.setFont(new Font("System", Font.BOLD, 14));
        change.setBounds(355,482,150,28);
        change.addActionListener(this);  // This line is to Catch Action
        image.add(change);
        
        
        back = new JButton("Back");
        back.setBounds(355,518,150,28);
        back.setFont(new Font("System", Font.BOLD, 14));
        back.addActionListener(this);  // This line is to Catch Action
        image.add(back);
        
        
        
        setSize(900,680);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
            
        
        try{
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Enterd PIN does not match");
            return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter New PIN");
            return; 
            }
            
             if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Re-Enter New PIN");
            return; 
            }
             
             conn c = new conn();
             String query1 = "update bank set pin = '"+rpin+"' Where pin = '"+pinnumber+"'";
             String query2 = "update login set pin = '"+rpin+"' Where pin = '"+pinnumber+"'";
             String query3 = "update signupThree set pin = '"+rpin+"' Where pin = '"+pinnumber+"'";
             
             c.s.executeUpdate(query1);
             c.s.executeUpdate(query2);
             c.s.executeUpdate(query3);
             
             JOptionPane.showMessageDialog(null, "PIN changed Successfull");
             setVisible(false);
             new Transactions(rpin).setVisible(true);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        }
        else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        
    }

    public static void main(String args[]) {
        // TODO code application logic here
        new PinChange("").setVisible(true);
    }
}

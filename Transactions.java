package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit, withdraw, ministatement, pinchange, fastcash,balanceenquiry, complain, exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,900);
        add(image);
        
        JLabel text = new JLabel("Please Select your Tracnsation");
        text.setBounds(235,160,700,35);
        text.setForeground(Color.WHITE);
        setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(165,300,120,30);
        deposit.addActionListener(this);  // this line shows that this deposit button has been clicked.
        image.add(deposit);
        
        withdraw = new JButton("Cash Withdraw");
        withdraw.setBounds(355,300,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(165, 336,120,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
//        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355,336,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("PIN Change");
        pinchange.setBounds(165, 372,120,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
//        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355,372,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        
        
        ////////////// Here i am leaving complian button, After finising this project whenever i will get time i will try to complete this coplain button.
        
        
        
//        complain = new JButton("Complain");
//        complain.setBounds(165, 394,120,28);
//        complain.addActionListener(this);
//        image.add(complain);
//        






        exit = new JButton("EXIT");
        exit.setBounds(355,410,150,28);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(900,680);
        setLocation(250,0);
        setUndecorated(true);

        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if((ae.getSource() == withdraw)){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if((ae.getSource() == fastcash)){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if((ae.getSource() == pinchange)){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
    }
    
    

    public static void main(String args[]) {
        // TODO code application logic here
        new Transactions("");
    }
}

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date; // here we importing this because Date is ambigiuos, Because Date is available in sql and util BOTH.

public class FastCash extends JFrame implements ActionListener{
    
    JButton OneHundred, FiveHundred, OneThousand, FifteenHundred, TwoThousand,FiveThousand, TenThousand, back;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,900);
        add(image);
        
        JLabel text = new JLabel("Select withdrawl amount");
        text.setBounds(235,160,700,35);
        text.setForeground(Color.WHITE);
        setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        OneHundred = new JButton("Rs.100");
        OneHundred.setBounds(165,286,120,30);
        OneHundred.addActionListener(this);  // this line shows that this deposit button has been clicked.
        image.add(OneHundred);
        
        FiveHundred = new JButton("Rs.500");
        FiveHundred.setBounds(355,286,150,30);
        FiveHundred.addActionListener(this);
        image.add(FiveHundred);
        
        
        OneThousand = new JButton("Rs.1000");
        OneThousand.setBounds(165, 322,120,30);
        OneThousand.addActionListener(this);
        image.add(OneThousand);
//        
        FifteenHundred = new JButton("Rs.1500");
        FifteenHundred.setBounds(355,322,150,30);
        FifteenHundred.addActionListener(this);
        image.add(FifteenHundred);
        
        TwoThousand = new JButton("Rs.2000");
        TwoThousand.setBounds(165, 358,120,30);
        TwoThousand.addActionListener(this);
        image.add(TwoThousand);
//        
        FiveThousand = new JButton("5000");
        FiveThousand.setBounds(355,358,150,30);
        FiveThousand.addActionListener(this);
        image.add(FiveThousand);
        
        
        TenThousand = new JButton("10000");
        TenThousand.setBounds(165, 394,120,28);
        TenThousand.addActionListener(this);
        image.add(TenThousand);
//        
        back = new JButton("BACK");
        back.setBounds(355,394,150,28);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(900,680);
        setLocation(250,0);
        setUndecorated(true);

        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else{
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            conn c = new conn();
            
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance =0;
                while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                   balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                   balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
                
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank VALUES('"+pinnumber+"','"+date+"', 'Withdrawl','"+amount+"')";
                c.s.execute(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
               
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    
    

    public static void main(String args[]) {
        // TODO code application logic here
        new FastCash("");
    }
}

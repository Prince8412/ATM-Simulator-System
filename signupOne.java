package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupOne extends JFrame implements ActionListener{
    
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField,
            stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, Unmarried, Other;
    JDateChooser dateChooser;
    
    signupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personlDetails = new JLabel("Page 1: Personal Details");
        personlDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personlDetails.setBounds(290,80,400,30);
        add(personlDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,130,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 135, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,170,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 175, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,210,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,210,200,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,250,100,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,255,60,30);
//        male.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the male then we can use this line
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(400,255,120,30);
//        female.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the female then we can use this line
        add(female);
        
        other = new JRadioButton("Other");
        other.setBounds(550,255,120,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the other then we can use this line
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,290,100,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 295, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,330,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300,335,80,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Married then we can use this line
        add(married);
        
        Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(400,335,120,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Unmarried then we can use this line
        add(Unmarried);
        
        Other = new JRadioButton("Other");
        Other.setBounds(550,335,120,30);
//        Other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Other then we can use this line
        add(Other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(Unmarried);
        maritalgroup.add(Other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,370,100,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 375, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,420,100,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 425, 400, 30);
        add(cityTextField);

        
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,460,100,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 465, 400, 30);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,500,100,30);
        add(pincode);
        
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 505, 400, 30);
        add(pinTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(250,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        else if(other.isSelected()){
            gender = "Other";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        else if(Unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(Other.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required, Withot Name you can not Signup");
            }
            else{
                conn c = new conn();
//                String query = "insert into signup VALUES('"+formno+"', '"+name+"', '"+father_name+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
//                String query = "INSERT INTO signup (formno, name, father_name, dob, gender, email, marital, address, city, pin, state) VALUES ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"','"+marital+"',  '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                
                String query = "INSERT INTO signup (formno, name, father_name, dob, gender, email, marital_status, address, city, pincode, state) VALUES ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";




                c.s.executeLargeUpdate(query);
                
//                String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, pin, state) VALUES (1234, 'John', 'Smith', '1990-01-01', 'M', 'john@example.com', 'Single', '123 Main Street', 'New York', 10001, 'NY')";
            
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
            
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    public static void main(String args[]) {
        new signupOne();
    }
}

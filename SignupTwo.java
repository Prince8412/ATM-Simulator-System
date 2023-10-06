package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class SignupTwo extends JFrame implements ActionListener{
    
    long random;
    JTextField pan, AadharNo;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel nameofReligion = new JLabel("Religion:");
        nameofReligion.setFont(new Font("Raleway", Font.BOLD, 20));
        nameofReligion.setBounds(100,130,100,30);
        add(nameofReligion);
        
        String valReligion[] = {"Hindu", "Muslim", "Christan", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 135, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel categoryofclient = new JLabel("Category:");
        categoryofclient.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryofclient.setBounds(100,170,200,30);
        add(categoryofclient);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 175, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel incomeyearly = new JLabel("Income:");
        incomeyearly.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeyearly.setBounds(100,210,200,30);
        add(incomeyearly);
        
        String incomecategory[] = {"Null", "<=1,50,000", "<=2,50,000", "<5,00,000", "10,00,000 and more"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,210,200,30);
        income.setBackground(Color.WHITE);
        add(income);

        
        
        
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,235,150,30);
        add(educational);
        
         

        
        JLabel qualification = new JLabel("qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,255,180,30);
        add(qualification);
        
        String educationvalues[] = {"Graduate", "Non-Graduate", "Post-Graduate", "Masters", "Others"};
        education = new JComboBox(educationvalues);
        education.setBounds(300,255,200,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        
        JLabel Occupational = new JLabel("Occupation:");
        Occupational.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupational.setBounds(100,330,200,30);
        add(Occupational);
        
        String occupationvalues[] = {"Salaried", "Self-Employed", "Business-Man", "Student", "Retaired", "Other"};
        occupation = new JComboBox(occupationvalues);
        occupation.setBounds(300,335,200,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        
        JLabel PanNumber = new JLabel("PAN Number:");
        PanNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        PanNumber.setBounds(100,370,200,30);
        add(PanNumber);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 375, 400, 30);
        add(pan);
        
        JLabel AadharNumber = new JLabel("Aadhar Number:");
        AadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        AadharNumber.setBounds(100,420,250,30);
        add(AadharNumber);
        
        AadharNo = new JTextField();
        AadharNo.setFont(new Font("Raleway", Font.BOLD, 14));
        AadharNo.setBounds(300, 425, 400, 30);
        add(AadharNo);

        
        
        JLabel SeniorCiti = new JLabel("Senior Citizen:");
        SeniorCiti.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCiti.setBounds(100,460,200,30);
        add(SeniorCiti);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,465,80,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Married then we can use this line
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400,465,80,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Married then we can use this line
        add(sno);
        ButtonGroup SeniorCitizen = new ButtonGroup();
        SeniorCitizen.add(syes);
        SeniorCitizen.add(sno);
        
        
        JLabel ExistingAccount = new JLabel("Excisting Account:");
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        ExistingAccount.setBounds(100,500,250,30);
        add(ExistingAccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,505,80,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Married then we can use this line
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(400,505,80,30);
//        other.setBackground(Color.WHITE);  // if we want to remove the blackish rectangle from behind the Married then we can use this line
        add(eno);
        ButtonGroup existionAccount = new ButtonGroup();
        existionAccount.add(eyes);
        existionAccount.add(eno);
        
        
        
        
        
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
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String sSeniorCitizen = null;
        if(syes.isSelected()){
            sSeniorCitizen = "Yes";
        }
        else if(sno.isSelected()){
            sSeniorCitizen = "No";
        }
        
        String sExistingAccount = null;
        if(eyes.isSelected()){
            sExistingAccount = "Yes";
        }
        else if(eno.isSelected()){
            sExistingAccount = "No";
        }
        
        String span = pan.getText();
        String sAadharNo = AadharNo.getText();
        
        
        try{
                conn c = new conn();
//                String query = "insert into signup VALUES('"+formno+"', '"+name+"', '"+father_name+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
//                String query = "INSERT INTO signup (formno, name, father_name, dob, gender, email, marital, address, city, pin, state) VALUES ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"','"+marital+"',  '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                
                String query = "INSERT INTO signupTwo (formno, Religion, Category, Income, Education, Occupation, Senior_Citizen, Existing_Account, PAN_No, Aadhar_No) VALUES ('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+sSeniorCitizen+"', '"+sExistingAccount+"', '"+span+"', '"+sAadharNo+"')";




                c.s.executeLargeUpdate(query);
                
//                String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, pin, state) VALUES (1234, 'John', 'Smith', '1990-01-01', 'M', 'john@example.com', 'Single', '123 Main Street', 'New York', 10001, 'NY')";
               setVisible(false);
               new SignupTwo(formno).setVisible(true);
            
               setVisible(false);
                    new SignupThree(formno).setVisible(true);
            
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
        new SignupTwo("");
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


// for reference
//https://www.tutorialsfield.com/java-swing-login-form-with-database-connection/


public class LoginFormDatabase implements ActionListener {

    JFrame frame=new JFrame("LOGIN FORM");
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton forgotPasswordButton=new JButton("FORGOT PASSWORD");
    JCheckBox showPassword = new JCheckBox("Show Password");

    LoginFormDatabase(){

        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        userLabel.setBounds(40,120,100,50);
        userLabel.setFont(new Font("Arial",Font.BOLD,17));

        passwordLabel.setBounds(40,190,100,50);
        passwordLabel.setFont(new Font("Arial",Font.BOLD,17));

        userTextField.setBounds(180,135,150,25);
        userTextField.setFont(new Font("Arial",Font.BOLD,15));

        passwordField.setBounds(180,200,150,25);
        passwordField.setFont(new Font("Arial",Font.BOLD,15));

        showPassword.setBounds(180,230,150,25);
        showPassword.setFont(new Font("Arial",Font.BOLD,15));
        showPassword.setFocusable(false);

        loginButton.setBounds(40,280,130,35);
        loginButton.setFont(new Font("Arial",Font.BOLD,15));
        loginButton.setFocusable(false);

        resetButton.setBounds(200,280,130,35);
        resetButton.setFont(new Font("Arial",Font.BOLD,15));
        resetButton.setFocusable(false);

        forgotPasswordButton.setBounds(100,340,180,35);
        forgotPasswordButton.setFont(new Font("Arial",Font.BOLD,12));
        forgotPasswordButton.setFocusable(false);


        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(userTextField);
        frame.add(passwordField);
        frame.add(showPassword);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(forgotPasswordButton);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        forgotPasswordButton.addActionListener(this);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){

        LoginFormDatabase loginFormDatabase=new LoginFormDatabase();

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==loginButton){
            try{

                String username =userTextField.getText();
                String password=passwordField.getText();
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/userlogindb", "root", "1234@");
                PreparedStatement preparedStatement=connection.prepareStatement("select * from userlogintable");
                ResultSet resultSet=preparedStatement.executeQuery();
                if(username.equals("")||password.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter all Fields");
                }else{
                    while(resultSet.next()){
                        if(username.equalsIgnoreCase(resultSet.getString("USERNAME")) && password.equalsIgnoreCase(resultSet.getString("PASSWORD"))){
                            JOptionPane.showMessageDialog(null,"Login Successful");
                            break;
                        }
                    }if(resultSet.isAfterLast()){
                        JOptionPane.showMessageDialog(null,"Username or Password did not match");
                    }
                }
            }catch(Exception exception){
                System.out.println("Error while connecting to the database");
            }
        }

        if(e.getSource()==showPassword){
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('\u25CF');
            }
        }

        if(e.getSource()==resetButton){
            userTextField.setText("");
            passwordField.setText("");
        }



        if(e.getSource()==forgotPasswordButton){
            frame.dispose();
            ForgotPassword forgotPassword=new ForgotPassword();
        }

    }
}

class ForgotPassword implements ActionListener{
    JFrame frame=new JFrame("FORGOT PASSWORD");
    JLabel label=new JLabel("ENTER USERNAME");
    JTextField textField=new JTextField();
    JButton changePasswordButton=new JButton("CHANGE PASSWORD");
    JButton backButton=new JButton("BACK");
    ForgotPassword(){

        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        label.setBounds(120,70,500,20);
        label.setFont(new Font("Arial",Font.BOLD,15));

        textField.setBounds(90,120,200,25);
        textField.setFont(new Font("Arial",Font.BOLD,16));

        changePasswordButton.setBounds(75,170,140,25);
        changePasswordButton.setFocusable(false);
        changePasswordButton.setFont(new Font("Arial",Font.BOLD,10));


        backButton.setBounds(240,170,70,25);
        backButton.setFocusable(false);
        backButton.setFont(new Font("Arial",Font.BOLD,10));


        frame.add(label);
        frame.add(textField);
        frame.add(changePasswordButton);
        frame.add(backButton);

        changePasswordButton.addActionListener(this);
        backButton.addActionListener(this);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==changePasswordButton){
            try{

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogindb", "root", "1234@");
                PreparedStatement preparedStatement=connection.prepareStatement("select * from userlogintable");
                ResultSet resultSet=preparedStatement.executeQuery();
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid Input");
                }
                else{

                    while(resultSet.next()){
                        if(textField.getText().equalsIgnoreCase(resultSet.getString("USERNAME"))){
                            String username=textField.getText();
                            frame.dispose();
                            ChangePassword changePassword=new ChangePassword(username);
                            break;
                        }
                    } if(resultSet.isAfterLast()){
                        JOptionPane.showMessageDialog(null,"Invalid Username");
                    }
                }

            }catch(Exception exception){

            }

        }

        if(e.getSource()==backButton){
            frame.dispose();
            LoginFormDatabase loginFormDatabase=new LoginFormDatabase();
        }
    }
}

class ChangePassword implements ActionListener{

    String username;
    JFrame frame=new JFrame("CHANGE PASSWORD");
    JLabel label1=new JLabel("TYPE NEW PASSWORD");
    JLabel label2=new JLabel("RE-TYPE PASSWORD");
    JPasswordField passwordField1=new JPasswordField();
    JPasswordField passwordField2=new JPasswordField();
    JButton submitButton=new JButton("UPDATE");
    JButton loginButton=new JButton("LOGIN");

    ChangePassword(String username){

        this.username=username;
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        label1.setBounds(35,90,300,20);
        label1.setFont(new Font("Arial",Font.BOLD,13));

        label2.setBounds(35,140,300,20);
        label2.setFont(new Font("Arial",Font.BOLD,13));

        passwordField1.setBounds(190,90,180,20);
        passwordField1.setFont(new Font("Arial",Font.BOLD,13));

        passwordField2.setBounds(190,140,180,20);
        passwordField2.setFont(new Font("Arial",Font.BOLD,13));

        submitButton.setBounds(40,180,150,30 );
        submitButton.setFont(new Font("Arial",Font.BOLD,13));

        loginButton.setBounds(220,180,150,30 );
        loginButton.setFont(new Font("Arial",Font.BOLD,13));

        submitButton.addActionListener(this);
        loginButton.addActionListener(this);


        frame.add(label1);
        frame.add(label2);
        frame.add(passwordField1);
        frame.add(passwordField2);
        frame.add(submitButton);
        frame.add(loginButton);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submitButton){
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogindb", "root", "root");
                PreparedStatement preparedStatement=connection.prepareStatement("select * from userlogintable");
                ResultSet resultSet=preparedStatement.executeQuery();
                if(passwordField1.getText().equals("")||passwordField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter both fields");
                }else if(passwordField1.getText().equals(passwordField2.getText())){
                    while(resultSet.next()){

                        if(resultSet.getString("USERNAME").equalsIgnoreCase(username)){
                            preparedStatement=connection.prepareStatement("UPDATE userlogintable SET PASSWORD=? WHERE USERNAME=?");
                            preparedStatement.setString(1,passwordField1.getText());
                            preparedStatement.setString(2,username);
                            preparedStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Password Updated Successfully");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Password did not Match");
                }

            }catch(Exception exception){

            }
        }

        if(e.getSource()==loginButton){
            frame.dispose();
            LoginFormDatabase loginFormDatabase=new LoginFormDatabase();
        }
    }
}
package LoginPage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;

public class FristPage extends JFrame {

  private JPanel contentPane;
  private JTextField txtUsername;
  private JPasswordField passwordField;

  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
           FristPage frame = new FristPage();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  
  public FristPage() {
    setTitle("MomoTechnology");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 614, 359);
    contentPane = new JPanel();
    contentPane.setForeground(new Color(255, 255, 255));
    contentPane.setFont(new Font("Snap ITC", Font.PLAIN, 20));
    contentPane.setToolTipText("Login");
    contentPane.setBackground(new Color(106, 90, 205));
    contentPane.setBorder(null);

    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    txtUsername = new JTextField();
    txtUsername.setBackground(new Color(255, 255, 255));
    txtUsername.setBounds(208, 105, 208, 20);
    contentPane.add(txtUsername);
    txtUsername.setColumns(10);
    
    passwordField = new JPasswordField();
    passwordField.setForeground(new Color(183, 183, 255));
    passwordField.setBackground(new Color(255, 255, 255));
    passwordField.setToolTipText("");
    passwordField.setBounds(208, 153, 208, 20);
    contentPane.add(passwordField);
    
    JLabel lblNewLabel = new JLabel("Username");
    lblNewLabel.setForeground(new Color(255, 255, 255));
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblNewLabel.setToolTipText("");
    lblNewLabel.setBounds(113, 105, 90, 17);
    contentPane.add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("Password");
    lblNewLabel_1.setForeground(new Color(255, 255, 255));
    lblNewLabel_1.setBackground(new Color(240, 240, 240));
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblNewLabel_1.setBounds(113, 154, 67, 14);
    contentPane.add(lblNewLabel_1);
    
    JButton btnNewButton = new JButton("Login");
    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
    btnNewButton.setBackground(new Color(255, 255, 255));
    btnNewButton.setForeground(new Color(128, 128, 255));
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String userName = txtUsername.getText();
            String pass = passwordField.getText();
            
            if(userName.contains("mamunsheikh") && pass.contains("5530")) {
              JOptionPane.showMessageDialog(null,"Welcome MomoTechnology");
            }
            else
            {
              JOptionPane.showInternalMessageDialog(null,"Invalid username or password",null ,JOptionPane.ERROR_MESSAGE);
            }
      }
    });
    btnNewButton.setBounds(265, 196, 89, 23);
    contentPane.add(btnNewButton);
    
    JLabel lblNewLabel_2 = new JLabel("MomoTechnology");
    lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 20));
    lblNewLabel_2.setDisplayedMnemonic(KeyEvent.VK_CODE_INPUT);
    lblNewLabel_2.setForeground(new Color(255, 255, 255));
    lblNewLabel_2.setBounds(170, 11, 241, 92);
    contentPane.add(lblNewLabel_2);
    
    JRadioButton rdbtnNewRadioButton = new JRadioButton("Remember me");
    rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
    rdbtnNewRadioButton.setBackground(new Color(123, 104, 238));
    rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
    rdbtnNewRadioButton.setBounds(111, 197, 123, 23);
    contentPane.add(rdbtnNewRadioButton);
    
    
  }
}

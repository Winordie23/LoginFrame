package SwingLab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class lab1 extends JFrame {
    lab1(){
        setBounds(10, 10, 370, 400);
        setBackground(Color.black);
        setTitle("GUI day 0");
        setLayout(new GridLayout());
        JButton btn = new JButton("login");
        //   btn.setBounds(130,100,100,30);
        btn.setBackground(Color.lightGray);

        setLocationRelativeTo(null);

        JTextField txt = new JTextField(20);

        String t = new String();
        JLabel name = new JLabel("username");
        JLabel Password = new JLabel("\n password");

        JPasswordField pass = new JPasswordField(20);
        ImageIcon icon = new ImageIcon("C:\\Users\\Aminadab23\\Desktop\thumbsup.png");

        name.setBounds(50, 150, 100, 30);
        Password.setBounds(50, 280, 100, 30);
        txt.setBounds(150, 150, 150, 30);
        pass.setBounds(150, 220, 150, 30);
        btn.setBounds(50, 300, 100, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txt.getText();
                String p = pass.getText();
                if(n.equals("yeabsra")&& p.equals("mypass")) {
                    JOptionPane.showMessageDialog(null, "Login successfill. \n Hello "+n);
                }
                else if(n.equals("")|| p.equals(""))
                    JOptionPane.showMessageDialog(null, "please fill all the requirments");
                else
                    JOptionPane.showMessageDialog(null, "wrong username or password");
            }

        });
        JButton reset = new JButton("reset");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
                pass.setText("");
            }
        });
        JCheckBox show = new JCheckBox("show Password");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(show.isSelected()){
                    pass.setEchoChar((char)0);
                }
                else{
                    pass.setEchoChar('*');
                }
                {

                }
            }
        });

        JButton eve = new JButton("Event");
        eve.addActionListener(new EventHundler());

        Panel pan = new Panel();
        pan.setLayout(new FlowLayout());
        pan.add(name);
        pan.add(txt);
        pan.add(Password);
        pan.add(pass);
        pan.add(show);
        pan.add(btn);
        pan.add(reset);
pan.add(eve);
        add(pan);
        setResizable(false);
        setVisible(true);
    }
    public static void main (String[] args){
        new lab1();
    }
}
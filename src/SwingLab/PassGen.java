package SwingLab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassGen implements ActionListener {
    JFrame frame = new JFrame("password generator");
    PassGen(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(700,400);
        frame.setSize(400,300);
        Panel pan = new Panel();
        pan.setSize(400,300);
        JButton btn = new JButton("Generate");
        btn.setBackground(Color.green);
        btn.setSize(30,10);
        JTextField pass = new JTextField(20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0','1','2','3','4','5','6','7','8','9','*','@','#','$','%','&','_'};
                String p = new String();
                p = "";
                for(int i=0; i<=5; i++){
                    int rand = (int) (Math.random()*42);

                    p = p + alphabet[rand];
                }
                String finalP = p;   pass.setText(finalP);


            }
        });
        JButton reset = new JButton("reset");
        reset.setSize(30,10);
        reset.setBackground(Color.red);
        //String finalP1 = p;
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pass.setText("");
             //  finalP1.equals("");
            }
        });
        pan.add(btn);
        pan.add(pass);
        pan.add(reset);
        frame.add(pan);
        frame.setVisible(true);
    }


    public static void main(String[] args){
        new PassGen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

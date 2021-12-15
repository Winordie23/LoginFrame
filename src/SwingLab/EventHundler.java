package SwingLab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHundler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Event hundler class on action");
    }
}
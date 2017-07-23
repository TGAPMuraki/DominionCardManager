package DominionCardManagerForm;

import javax.swing.*;

/**
 * Created by Muraki on 7/16/2017.
 */
public class DominionCardManagerForm {

    private JPanel mainPanel;
    private JPanel menuPanel;
    private JPanel spoilerPanel;

    public void showDialog(){
        JFrame frame = new JFrame("DominionCardManagerForm");
        frame.setContentPane(new DominionCardManagerForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

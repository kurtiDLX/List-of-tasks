import javax.swing.*;
import java.awt.*;

public class ListComponents extends JFrame {
    private JLabel myList;
    private JTextField field;
    public ListComponents(){
        super("List of tasks");
        setLayout(null);

        myList = new JLabel("Add tasks!");
        myList.setBounds(220, -30, 100, 100);

        Font font = new Font("Arial", Font.BOLD, 18);
        myList.setFont(font);

        field = new JTextField();
        field.setBounds(115, 50, 320,60);
        field.setFont(font);

        add(myList);
        add(field);
    }
}

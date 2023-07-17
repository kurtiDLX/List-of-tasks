import javax.swing.*;
import java.awt.*;

public class ListComponents extends JFrame {
    private JLabel myList;
    private JTextField field;
    private JCheckBox checkBox;
    private Font font;
    private JButton buttonAdd;
    private ImageIcon imageCheckBox;
    public ListComponents(){
        super("List of tasks");
        setLayout(null);

        myList = new JLabel("Add tasks!");
        myList.setBounds(220, -30, 100, 100);

        font = new Font("Arial", Font.BOLD, 18);
        myList.setFont(font);

        field = new JTextField();
        field.setBounds(115, 50, 320,60);
        field.setFont(font);

        checkBox = new JCheckBox();
        checkBox.setFont(font);
        imageCheckBox = new ImageIcon("src/img.jpg");
        checkBox.setSelected(false);
        checkBox.setBounds(50, 50, 60,60);
        checkBox.addItemListener(e -> {
                    if (checkBox.isSelected()) {
                        field.setBackground(Color.green);
                        checkBox.setIcon (new ImageIcon("src/imgAct.jpg"));
                    } else {
                        field.setBackground(Color.RED);
                        checkBox.setIcon(new ImageIcon("src/img.jpg"));
                    }
                });
        checkBox.setIcon(imageCheckBox);

        buttonAdd = new JButton("+");
        buttonAdd.setFont(font);
        buttonAdd.setBounds(450, 50, 60, 60);

        add(myList);
        add(field);
        add(checkBox);
        add(buttonAdd);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListComponents extends JFrame {
    private static JLabel myList;
    private static JTextField field;
    private static JCheckBox checkBox;
    private static Font font;
    private static JButton buttonAdd;
    private static ImageIcon imageCheckBox;
    public ListComponents(){
        super("List of tasks");
        setLayout(null);

        myList = new JLabel("Add tasks!");
        myList.setBounds(220, -30, 100, 100);

        font = new Font("Arial", Font.BOLD, 18);
        myList.setFont(font);

        field = new JTextField();
        field.setBackground(Color.red);
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
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField newTextField = new JTextField();
                newTextField.setBackground(Color.red);
                newTextField.setBounds(115, field.getY() + 70, 320 ,60);
                newTextField.setFont(font);

                JCheckBox newCheckBox = new JCheckBox();
                newCheckBox.setBounds(50, checkBox.getY() + 70, 60,60);
                newCheckBox.setIcon(imageCheckBox);
                newCheckBox.addItemListener(ex -> {
                    if (newCheckBox.isSelected()) {
                        newCheckBox.setIcon(new ImageIcon("src/imgAct.jpg"));
                        newTextField.setBackground(Color.green);
                    } else {
                        newCheckBox.setIcon(new ImageIcon("src/img.jpg"));
                        newTextField.setBackground(Color.red);
                    }
                });
                field = newTextField;
                checkBox = newCheckBox;
                add(field);
                add(checkBox);

                revalidate();
                repaint();
            }
        });
        add(myList);
        add(field);
        add(checkBox);
        add(buttonAdd);

    }
}

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args) {
       ListComponents listWindow = new ListComponents();
       listWindow.setSize(560, 700);
       listWindow.setLocationRelativeTo(null);
       listWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       listWindow.setVisible(true);
    }
}

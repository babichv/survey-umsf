import javax.swing.*;

public class Form extends JFrame {

    private JPanel mainPanel;
    private JComboBox yearComboBox;
    private JComboBox educationComboBox;
    private JComboBox specialtyComboBox;
    private JButton sendButton;

    public Form() {
        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Form();
        // ImageIcon appImage = new ImageIcon("img/umsf.png");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setIconImage(appImage.getImage());
        frame.setTitle("Survey");
        frame.setVisible(true);

    }
}

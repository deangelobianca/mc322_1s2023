import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicial extends JFrame {
    private JButton cadastrarButton;
    private JButton loginButton;

    public Inicial() {
        setTitle("SGB Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame on the screen

      // creating the components
      cadastrarButton = new JButton("Cadastrar");
      loginButton = new JButton("Login");

      //adding the components to the content pane
      Container container = getContentPane();
      container.setLayout(new GridLayout(3, 2));
      container.add(cadastrarButton);
      container.add(new JLabel()); // Empty label for spacing
      container.add(loginButton);

      // Perform Action of the buttons

    }

  public static void main(String[] args) {
        // Create and show the login GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }
}




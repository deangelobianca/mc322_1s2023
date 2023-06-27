import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create components
        JLabel usernameLabel = new JLabel("RA:");
        JLabel passwordLabel = new JLabel("Senha:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Add components to the content pane
        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 2));
        container.add(usernameLabel);
        container.add(usernameField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(new JLabel()); // Empty label for spacing
        container.add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Perform login operation
                performLogin(username, password);
            }
        });
    }

    private void performLogin(String username, String password) {
        // Check if the username and password are correct
        // You can replace this with your own implementation
        // For now, let's just display a message with the entered credentials
        JOptionPane.showMessageDialog(null, "Login attempted with\nRA: " + username + "\nSenha: " + password);
    }

    public static void main(String[] args) {
        // Create and show the login GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}

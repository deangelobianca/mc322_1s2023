/*Search
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField searchField;
    private JButton searchButton;

    public Main() {
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create components
        searchField = new JTextField(20);
        searchButton = new JButton("Search");

        // Add components to the content pane
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(searchField);
        container.add(searchButton);

        // Add action listener to the search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                // Perform search operation
                searchBooks(searchText);
            }
        });
    }

  private void searchBooks(String searchText) {
        // Implement your search logic here
        // This is a placeholder implementation that simply displays a message dialog
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a search term.");
        } else {
            // Perform the actual search operation using the searchText
            // You can replace this with your own implementation
            // For now, let's just display a message with the search term
            JOptionPane.showMessageDialog(null, "Searching for: " + searchText);
        }
    }

    public static void main(String[] args) {
        // Create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // new Main().setVisible(true);
              new Login().setVisible(true);
            }
        });
    }
}
*/
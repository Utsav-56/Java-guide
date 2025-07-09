# What is JPanel?
JPanel is a container component in Swing.

## Why is JPanel used?
To organize UI components into logical groups.

To apply different layouts within a single window.

To separate parts of the UI for clarity and maintenance.

To reuse a panel as a custom component in multiple frames or dialogs.

<hr style="height: 5px; background-color: grey;">

## How to use JPanel?
### Steps:

1. Create a `JPanel` object
2. Set its layout manager (optional, default is `FlowLayout`)
3. Add components to the panel
4. Add the panel to a `JFrame` or another container

<hr style="height: 5px; background-color: grey;">


### Example Code: JPanel with Buttons and Label

```java
import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout()); // Using BorderLayout for frame

        // Create a panel to hold components
        JPanel panel = new JPanel(); // JPanel created
        panel.setLayout(new FlowLayout()); // Set layout of panel to FlowLayout

        // Create components
        JLabel label = new JLabel("Choose an option:");
        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");

        // Add components to panel
        panel.add(label);
        panel.add(button1);
        panel.add(button2);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
```

<hr style="height: 5px; background-color: grey;">

### Explanation of Code
1. JFrame created as the main window
2. JPanel created to group label and buttons together
3. FlowLayout used for panel layout (default)
4. Components (label, buttons) are added to panel, then panel is added to frame


### Key Points for your practical and theory
* JPanel can be nested (panels inside panels) for complex layouts
* Different panels can have different layouts within a frame
* Commonly used for UI design clarity and component grouping
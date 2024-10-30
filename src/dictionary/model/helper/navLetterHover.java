package dictionary.model.helper;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class navLetterHover {

    private static JButton currentlySelectedAlphabetButton; 
    private static final Color CUSTOM_GRAY = new Color(204, 204, 204);

    // Adding the resetAlphabetButtons method
    public static void resetAlphabetButtons(JButton[] alphabetButtons, JButton addButton) {
        for (JButton button : alphabetButtons) {
            button.setForeground(CUSTOM_GRAY);  // Default color (not selected)
            button.putClientProperty("isSelected", false);  // Reset selection state
        }

        // Optionally reset other buttons like Add Words, if needed:
        if (addButton != null) {
            addButton.setForeground(CUSTOM_GRAY);
            addButton.putClientProperty("isSelected", false);
        }
    }

    public static void addHoverEffect(JButton button, boolean isSelected) {
        Color originalColor = button.getForeground();

        if (isSelected) {
            button.setForeground(Color.BLACK);
            button.putClientProperty("isSelected", true); 
            currentlySelectedAlphabetButton = button; 
        } else {
            button.putClientProperty("isSelected", false); 
        }

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                button.setForeground(Color.BLACK); 
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                boolean selected = (boolean) button.getClientProperty("isSelected");
                if (selected) {
                    button.setForeground(Color.BLACK);
                } else {
                    button.setForeground(originalColor);
                }
            }
        });

        button.addActionListener(e -> {
            if (currentlySelectedAlphabetButton != null) {
                currentlySelectedAlphabetButton.setForeground(CUSTOM_GRAY);
                currentlySelectedAlphabetButton.putClientProperty("isSelected", false);
            }
            button.setForeground(Color.BLACK);
            button.putClientProperty("isSelected", true);

            currentlySelectedAlphabetButton = button;
        });
    }
    
    public static void addHoverEffectToButtons(JButton[] buttons, JButton initiallySelected) {
        for (JButton button : buttons) {
            boolean isSelected = (button == initiallySelected);
            addHoverEffect(button, isSelected);
        }
    }
}

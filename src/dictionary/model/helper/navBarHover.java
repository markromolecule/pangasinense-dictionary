package dictionary.model.helper;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class navBarHover {

    private static JButton currentlySelectedNavButton;
    private static final Color CUSTOM_GRAY = new Color(204, 204, 204);

    public static void addHoverEffect(JButton button, boolean isSelected) {

        Color originalColor = button.getForeground();

        if (isSelected) {
            button.setForeground(Color.BLACK);
            button.putClientProperty("isSelected", true);
            currentlySelectedNavButton = button;
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
            if (currentlySelectedNavButton != null) {
                currentlySelectedNavButton.setForeground(CUSTOM_GRAY);
                currentlySelectedNavButton.putClientProperty("isSelected", false);
            }
            button.setForeground(Color.BLACK);
            button.putClientProperty("isSelected", true);

            currentlySelectedNavButton = button;
        });
    }
}

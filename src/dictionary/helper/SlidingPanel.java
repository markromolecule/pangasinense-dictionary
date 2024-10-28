package dictionary.helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlidingPanel extends JPanel {
    private Timer timer;
    private int targetWidth;
    private int targetHeight;
    private int increment;
    private boolean slidingIn;
    private Direction direction;

    public enum Direction {
        LEFT, RIGHT, UP, DOWN
    }

    public SlidingPanel(int targetWidth, int targetHeight, Direction direction, int speed) {
        this.targetWidth = targetWidth;
        this.targetHeight = targetHeight;
        this.increment = speed;
        this.direction = direction;
        this.slidingIn = false;

        // Set initial size based on direction
        setPreferredSize(new Dimension(0, 0)); // Start at size (0,0)
        setLayout(new BorderLayout());
    }

    public void slideIn() {
        if (slidingIn) return;
        slidingIn = true;

        timer = new Timer(5, new ActionListener() {
            private int currentWidth = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                currentWidth += increment;

                if (currentWidth >= targetWidth) {
                    currentWidth = targetWidth; // Set to target width
                    timer.stop();
                    slidingIn = false;
                }

                // Update panel size and revalidate
                setPreferredSize(new Dimension(currentWidth, targetHeight));
                revalidate();
                repaint();
            }
        });
        timer.start();
    }

    public void slideOut() {
        if (slidingIn) return;
        slidingIn = true;

        timer = new Timer(5, new ActionListener() {
            private int currentWidth = targetWidth;

            @Override
            public void actionPerformed(ActionEvent e) {
                currentWidth -= increment;

                if (currentWidth <= 0) {
                    currentWidth = 0; // Set to zero when sliding out
                    timer.stop();
                    slidingIn = false;
                }

                // Update panel size and revalidate
                setPreferredSize(new Dimension(currentWidth, targetHeight));
                revalidate();
                repaint();
            }
        });
        timer.start();
    }
}

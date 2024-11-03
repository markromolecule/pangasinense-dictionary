package dictionary.model.helper;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import dictionary.manager.wordManager;
import dictionary.entities.word;

public class autoComplete {

    private static final int MAX_SUGGESTIONS = 15;
    private JTextField inputField;
    private JTextField pangasinenseField;
    private JTextField definitionField;
    private JTextField tagalogField;
    private JTextField synonymField;
    private JTextField antonymField;
    private JTextField sentenceField;
    private JPopupMenu suggestionMenu;
    private wordManager wordManager;
    private Timer typingTimer;

    public autoComplete(JTextField inputField, JTextField pangasinenseField,
                        JTextField definitionField, JTextField tagalogField,
                        JTextField synonymField, JTextField antonymField,
                        JTextField sentenceField, wordManager wordManager) {
        this.inputField = inputField;
        this.pangasinenseField = pangasinenseField;
        this.definitionField = definitionField;
        this.tagalogField = tagalogField;
        this.synonymField = synonymField;
        this.antonymField = antonymField;
        this.sentenceField = sentenceField;
        this.wordManager = wordManager;
        this.suggestionMenu = new JPopupMenu();
        setupListener();

        inputField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent e) {
                // Keep suggestions visible while typing
                if (!suggestionMenu.isVisible()) {
                    suggestionMenu.setVisible(false);
                }
            }
        });
    }

    private void setupListener() {
        inputField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTypingEvent();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTypingEvent();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleTypingEvent();
            }
        });
    }

    private void handleTypingEvent() {
        if (typingTimer != null) {
            typingTimer.cancel();
        }

        typingTimer = new Timer();
        typingTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> showSuggestions());
            }
        }, 420);
    }

    private void showSuggestions() {
        String text = inputField.getText();
        if (text.isEmpty()) {
            suggestionMenu.setVisible(false);
            return;
        }

        // Filter suggestions with a limit
        List<String> suggestions = wordManager.getWordMap().keySet().stream()
                .filter(word -> word.toLowerCase().startsWith(text.toLowerCase()))
                .limit(MAX_SUGGESTIONS)
                .collect(Collectors.toList());

        // Hide menu if no matches found
        if (suggestions.isEmpty()) {
            suggestionMenu.setVisible(false);
            return;
        }

        suggestionMenu.removeAll();
        for (String suggestion : suggestions) {
            JMenuItem item = new JMenuItem(suggestion);
            item.addActionListener(e -> selectSuggestion(suggestion));
            suggestionMenu.add(item);
        }

        // Check if the inputField is visible before showing the popup
        if (inputField.isShowing()) {
            // Use the location of the input field for better positioning
            suggestionMenu.show(inputField, 0, inputField.getHeight());
        }
    }

    private void selectSuggestion(String selectedWord) {
        inputField.setText(selectedWord);
        suggestionMenu.setVisible(false);

        // Retrieve the Word object using the selected word
        word word = wordManager.getWord(selectedWord);
        if (word != null) {
            pangasinenseField.setText(word.getPangasinense());
            definitionField.setText(word.getDefinition());
            tagalogField.setText(word.getTagalog());
            synonymField.setText(word.getSynonyms());
            antonymField.setText(word.getAntonyms());
            sentenceField.setText(word.getSentence());
        }
    }
}

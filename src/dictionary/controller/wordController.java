package dictionary.controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import dictionary.entities.word;
import dictionary.manager.wordAction;
import dictionary.manager.wordManager;

public class wordController extends wordAction {

    public enum ActionType { CREATE, UPDATE, DELETE }

    private final wordManager wordManager;
    private final ActionType actionType;

    public wordController(ActionType actionType, DefaultTableModel model, JTable wordListTable,
                          JTextField pangasinenseField, JTextField definitionField, 
                          JTextField tagalogField, JTextField synonymField,
                          JTextField antonymField, JTextField sentenceField, 
                          wordManager wordManager) {
        super(model, wordListTable, pangasinenseField, definitionField, tagalogField, synonymField, antonymField, sentenceField);
        this.actionType = actionType;
        this.wordManager = wordManager;
    }

    @Override
    public void execute() {
        switch (actionType) {
            case CREATE -> createWord();
            case UPDATE -> updateWord();
            case DELETE -> deleteWord();
        }
    }

    private void createWord() {
        if (validateFields()) {
            word newWord = buildWord(model.getRowCount() + 1);
            if (!wordManager.addWord(newWord)) {
                System.out.println("Duplicate word: " + newWord.getPangasinense());
            } else {
                addRowToTable(newWord);
            }
            clearFields();
        }
    }

    private void updateWord() {
        int selectedRow = wordListTable.getSelectedRow();
        if (selectedRow == -1) {
            System.out.println("No word selected for update.");
            return;
        }
        word existingWord = wordManager.getWord((String) model.getValueAt(selectedRow, 1));
        if (existingWord != null && validateFields()) {
            word updatedWord = buildWord(existingWord.getId());
            if (!wordManager.updateWord(existingWord.getPangasinense(), updatedWord)) {
                System.out.println("Duplicate word: " + updatedWord.getPangasinense());
            } else {
                updateTableModel(selectedRow, updatedWord);
            }
            clearFields();
        }
    }

    private void deleteWord() {
        int selectedRow = wordListTable.getSelectedRow();
        if (selectedRow != -1) {
            String pangasinense = (String) model.getValueAt(selectedRow, 1);
            wordManager.removeWord(pangasinense);
            model.removeRow(selectedRow);
            clearFields();
        }
    }

    // Adds a new word to the table model
    private void addRowToTable(word newWord) {
        model.addRow(new Object[]{
            newWord.getId(),
            newWord.getPangasinense(),
            newWord.getDefinition(),
            newWord.getTagalog(),
            newWord.getSynonyms(),
            newWord.getAntonyms(),
            newWord.getSentence()
        });
    }

    // Updates an existing word's row in the table model
    private void updateTableModel(int selectedRow, word updatedWord) {
        model.setValueAt(updatedWord.getPangasinense(), selectedRow, 1);
        model.setValueAt(updatedWord.getDefinition(), selectedRow, 2);
        model.setValueAt(updatedWord.getTagalog(), selectedRow, 3);
        model.setValueAt(updatedWord.getSynonyms(), selectedRow, 4);
        model.setValueAt(updatedWord.getAntonyms(), selectedRow, 5);
        model.setValueAt(updatedWord.getSentence(), selectedRow, 6);
    }

    // Clears input fields after a create or update operation
    private void clearFields() {
        pangasinenseField.setText("");
        definitionField.setText("");
        tagalogField.setText("");
        synonymField.setText("");
        antonymField.setText("");
        sentenceField.setText("");
    }

    // Builds a word object from the current input field values
    private word buildWord(int id) {
        return new word(id, pangasinenseField.getText(), definitionField.getText(),
                tagalogField.getText(), synonymField.getText(),
                antonymField.getText(), sentenceField.getText());
    }

    // Validates if required fields are filled in
    private boolean validateFields() {
        if (pangasinenseField.getText().isBlank()) {
            System.out.println("Pangasinense word is required.");
            return false;
        }
        return true;
    }
}

package dictionary.controller;

import dictionary.entities.word;
import dictionary.manager.wordAction;
import dictionary.manager.wordManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class updateButton extends wordAction {

    private wordManager wordManager;
    
    public updateButton(DefaultTableModel model, JTable wordListTable, 
            JTextField pangasinenseField, JTextField definitionField, 
            JTextField tagalogField, JTextField synonymField,
            JTextField antonymField, JTextField sentenceField, 
            wordManager wordManager) {
        super(model, wordListTable, pangasinenseField, definitionField, 
                tagalogField, synonymField, antonymField, sentenceField);
        this.wordManager = wordManager;
    }

    @Override
    public void execute() {
        int selectedRow = wordListTable.getSelectedRow();
        if (selectedRow != -1) {
            String originalPangasinense = (String) model.getValueAt(selectedRow, 1);

            String pangasinense = pangasinenseField.getText();
            String definition = definitionField.getText();
            String tagalog = tagalogField.getText();
            String synonyms = synonymField.getText();
            String antonyms = antonymField.getText();
            String sentence = sentenceField.getText();
            
            // Update the values in the model
            model.setValueAt(pangasinense, selectedRow, 1);
            model.setValueAt(definition, selectedRow, 2);
            model.setValueAt(tagalog, selectedRow, 3);
            model.setValueAt(synonyms, selectedRow, 4);
            model.setValueAt(antonyms, selectedRow, 5);
            model.setValueAt(sentence, selectedRow, 6);

            // Check if the original word exists
            word existingWord = wordManager.getWord(originalPangasinense);
            if (existingWord != null) {
                // If the key (pangasinense word) is changing
                if (!originalPangasinense.equals(pangasinense)) {
                    // Check for a duplicate with the new key
                    if (wordManager.getWordMap().containsKey(pangasinense)) {
                        System.out.println("Duplicate word found: " + pangasinense);
                        return; // Stop the update to prevent a duplicate
                    }

                    // Remove the old key before adding the updated entry
                    wordManager.getWordMap().remove(originalPangasinense);
                }

                // Update the fields in the existing word object
                existingWord.setPangasinense(pangasinense);
                existingWord.setDefinition(definition);
                existingWord.setTagalog(tagalog);
                existingWord.setSynonyms(synonyms);
                existingWord.setAntonyms(antonyms);
                existingWord.setSentence(sentence);

                // Add the updated word with the new key (or reinsert with the same key if unchanged)
                wordManager.getWordMap().put(pangasinense, existingWord);

                // Optionally, save data to persist the changes
                wordManager.saveData();
            } else {
                // If the original word was removed or doesn't exist, create a new one
                word updatedWord = new word(selectedRow + 1, pangasinense, 
                        definition, tagalog, synonyms, antonyms, sentence);
                wordManager.addWord(updatedWord);
            }
            clearFields();
        }
    }

    private void clearFields() {
        pangasinenseField.setText("");
        definitionField.setText("");
        tagalogField.setText("");
        synonymField.setText("");
        antonymField.setText("");
        sentenceField.setText("");
    }
}

package dictionary.manager;

import dictionary.entities.Word;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UpdateButton extends WordAction {

    private WordManager wordManager;
    
    public UpdateButton(DefaultTableModel model, JTable wordListTable, 
            JTextField pangasinenseField, JTextField definitionField, 
            JTextField tagalogField, JTextField synonymField,
            JTextField antonymField, JTextField sentenceField, 
            WordManager wordManager) {
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
            Word existingWord = wordManager.getWord(originalPangasinense);
            if (existingWord != null) {
                // Update the existing word instead of adding a new one
                existingWord.setPangasinense(pangasinense);
                existingWord.setDefinition(definition);
                existingWord.setTagalog(tagalog);
                existingWord.setSynonyms(synonyms);
                existingWord.setAntonyms(antonyms);
                existingWord.setSentence(sentence);
            } else {
                // If the original word was removed or doesn't exist, create a new one
                Word updatedWord = new Word(selectedRow + 1, pangasinense, 
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

package dictionary.manager;

import javax.swing.table.DefaultTableModel;
import dictionary.entities.word;

public class createButton extends wordAction {
    
    private wordManager wordManager;
    
    public createButton(DefaultTableModel model, javax.swing.JTable wordListTable, javax.swing.JTextField pangasinenseField,
            javax.swing.JTextField definitionField, javax.swing.JTextField tagalogField, javax.swing.JTextField synonymField,
            javax.swing.JTextField antonymField, javax.swing.JTextField sentenceField, wordManager wordManager) {
        
        super(model, wordListTable, pangasinenseField, definitionField, tagalogField, synonymField, antonymField, sentenceField);
        this.wordManager = wordManager;
    }
    
    @Override
    public void execute() {
        String pangasinense = pangasinenseField.getText();
        String definition = definitionField.getText();
        String tagalog = tagalogField.getText();
        String synonyms = synonymField.getText();
        String antonyms = antonymField.getText();
        String sentence = sentenceField.getText();
        
        word newWord = new word(model.getRowCount() + 1, pangasinense, definition, tagalog, synonyms, antonyms, sentence);
        model.addRow(new Object[]{model.getRowCount() + 1, pangasinense, definition, tagalog, synonyms, antonyms, sentence});
        wordManager.addWord(newWord);
        clearFields();
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

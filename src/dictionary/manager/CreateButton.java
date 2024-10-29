package dictionary.manager;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import dictionary.entities.Word;

public class CreateButton extends WordAction {
    
    private WordManager wordManager;
    
    public CreateButton(DefaultTableModel model, JTable wordListTable, 
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
        String pangasinense = pangasinenseField.getText();
        String definition = definitionField.getText();
        String tagalog = tagalogField.getText();
        String synonyms = synonymField.getText();
        String antonyms = antonymField.getText();
        String sentence = sentenceField.getText();
        
        Word newWord = new Word(model.getRowCount() + 1, pangasinense, 
                definition, tagalog, synonyms, antonyms, sentence);
        model.addRow(new Object[]{model.getRowCount() + 1, pangasinense, 
            definition, tagalog, synonyms, antonyms, sentence});
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

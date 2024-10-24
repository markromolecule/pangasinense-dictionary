package dictionary.manager;

import javax.swing.table.DefaultTableModel;
import dictionary.entities.word;

public class updateButton extends wordAction {

    private wordManager wordManager;

    public updateButton(DefaultTableModel model, javax.swing.JTable wordListTable, javax.swing.JTextField pangasinenseField,
            javax.swing.JTextField definitionField, javax.swing.JTextField tagalogField, javax.swing.JTextField synonymField,
            javax.swing.JTextField antonymField, javax.swing.JTextField sentenceField, wordManager wordManager) {
        super(model, wordListTable, pangasinenseField, definitionField, tagalogField, synonymField, antonymField, sentenceField);
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

            model.setValueAt(pangasinense, selectedRow, 1);
            model.setValueAt(definition, selectedRow, 2);
            model.setValueAt(tagalog, selectedRow, 3);
            model.setValueAt(synonymField.getText(), selectedRow, 4);
            model.setValueAt(antonymField.getText(), selectedRow, 5);
            model.setValueAt(sentenceField.getText(), selectedRow, 6);

            word updatedWord = new word(selectedRow + 1, pangasinense, definition, tagalog, synonyms, antonyms, sentence);
            wordManager.addWord(updatedWord);

            // Optional: If the pangasinense key changes, you may need to remove the old entry from the HashMap
            if (!pangasinense.equals(originalPangasinense)) {
                wordManager.removeWord(originalPangasinense);  // Remove the old key from the HashMap
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

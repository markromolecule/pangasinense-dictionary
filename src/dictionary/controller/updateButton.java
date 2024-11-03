package dictionary.controller;

import dictionary.entities.word;
import dictionary.manager.wordAction;
import dictionary.manager.wordManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class updateButton extends wordAction {

    private final wordManager wordManager;
    
    public updateButton(DefaultTableModel model, JTable wordListTable, 
                        JTextField pangasinanField, JTextField definitionField, 
                        JTextField tagalogField, JTextField synonymField,
                        JTextField antonymField, JTextField sentenceField, 
                        wordManager wordManager) {
        super(model, wordListTable, pangasinanField, definitionField, 
              tagalogField, synonymField, antonymField, sentenceField);
        this.wordManager = wordManager;
    }

    @Override
    public void execute() {
        int selectedRow = wordListTable.getSelectedRow();
        if (selectedRow == -1) {
            System.out.println("No word selected for update.");
            return;
        }

        String originalPangasinan = (String) model.getValueAt(selectedRow, 1);
        String pangasinan = pangasinenseField.getText().trim();
        String definition = definitionField.getText().trim();
        String tagalog = tagalogField.getText().trim();
        String synonyms = synonymField.getText().trim();
        String antonyms = antonymField.getText().trim();
        String sentence = sentenceField.getText().trim();

        updateTableModel(selectedRow, pangasinan, definition, tagalog, synonyms, antonyms, sentence);

        word existingWord = wordManager.getWord(originalPangasinan);
        if (existingWord != null) {
            if (handleWordKeyChange(originalPangasinan, pangasinan)) {
                updateExistingWord(existingWord, pangasinan, definition, tagalog, synonyms, antonyms, sentence);
            }
        } else {
            addNewWord(selectedRow, pangasinan, definition, tagalog, synonyms, antonyms, sentence);
        }
        clearFields();
    }

    private void updateTableModel(int selectedRow, String pangasinan, String definition, String tagalog, 
                                  String synonyms, String antonyms, String sentence) {
        model.setValueAt(pangasinan, selectedRow, 1);
        model.setValueAt(definition, selectedRow, 2);
        model.setValueAt(tagalog, selectedRow, 3);
        model.setValueAt(synonyms, selectedRow, 4);
        model.setValueAt(antonyms, selectedRow, 5);
        model.setValueAt(sentence, selectedRow, 6);
    }

    private boolean handleWordKeyChange(String originalPangasinan, String newPangasinan) {
        if (!originalPangasinan.equals(newPangasinan)) {
            if (wordManager.getWordMap().containsKey(newPangasinan)) {
                System.out.println("Duplicate word found: " + newPangasinan);
                return false;
            }
            wordManager.getWordMap().remove(originalPangasinan);
        }
        return true;
    }

    private void updateExistingWord(word word, String pangasinan, String definition, String tagalog, 
                                    String synonyms, String antonyms, String sentence) {
        word.setPangasinense(pangasinan);
        word.setDefinition(definition);
        word.setTagalog(tagalog);
        word.setSynonyms(synonyms);
        word.setAntonyms(antonyms);
        word.setSentence(sentence);
        wordManager.getWordMap().put(pangasinan, word);
        wordManager.saveData();
    }

    private void addNewWord(int rowId, String pangasinan, String definition, String tagalog, 
                            String synonyms, String antonyms, String sentence) {
        word newWord = new word(rowId + 1, pangasinan, definition, tagalog, synonyms, antonyms, sentence);
        wordManager.addWord(newWord);
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

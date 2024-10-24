package dictionary.manager;

import javax.swing.table.DefaultTableModel;

public class deleteButton extends wordAction {

    private wordManager wordManager;

    public deleteButton(DefaultTableModel model, javax.swing.JTable wordListTable,
            javax.swing.JTextField pangasinenseField, javax.swing.JTextField definitionField,
            javax.swing.JTextField tagalogField, javax.swing.JTextField synonymField,
            javax.swing.JTextField antonymField, javax.swing.JTextField sentenceField, wordManager wordManager) {
        super(model, wordListTable, pangasinenseField, definitionField, tagalogField, synonymField, antonymField, sentenceField);
        this.wordManager = wordManager;  // Correctly assign it
    }

    @Override
    public void execute() {
        int selectedRow = wordListTable.getSelectedRow();
        if (selectedRow != -1) {
            // Get the pangasinense term from the selected row (this is the key in the HashMap)
            String pangasinense = (String) model.getValueAt(selectedRow, 1);
            wordManager.removeWord(pangasinense);
            model.removeRow(selectedRow);
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

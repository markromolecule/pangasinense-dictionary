package dictionary.manager;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DeleteButton extends WordAction {

    private WordManager wordManager;

    public DeleteButton(DefaultTableModel model, JTable wordListTable,
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
            
            /*
            Get the pangasinense term from the selected row (this is the key in the HashMap)
            */
            
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

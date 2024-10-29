package dictionary.manager;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;

public abstract class WordAction {

    protected DefaultTableModel model;
    protected javax.swing.JTable wordListTable;
    protected javax.swing.JTextField pangasinenseField, definitionField,
            tagalogField, synonymField, antonymField, sentenceField;

    public WordAction(DefaultTableModel model, JTable wordListTable, 
            JTextField pangasinenseField, JTextField definitionField, 
            JTextField tagalogField, JTextField synonymField,
            JTextField antonymField, JTextField sentenceField) {
        
        this.model = model;
        this.wordListTable = wordListTable;
        this.pangasinenseField = pangasinenseField;
        this.definitionField = definitionField;
        this.tagalogField = tagalogField;
        this.synonymField = synonymField;
        this.antonymField = antonymField;
        this.sentenceField = sentenceField;
    }

    public abstract void execute();
}

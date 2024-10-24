package dictionary.manager;

import javax.swing.table.DefaultTableModel;

public abstract class wordAction {

    protected DefaultTableModel model;
    protected javax.swing.JTable wordListTable;
    protected javax.swing.JTextField pangasinenseField, definitionField,
            tagalogField, synonymField, antonymField, sentenceField;

    public wordAction(DefaultTableModel model, javax.swing.JTable wordListTable, javax.swing.JTextField pangasinenseField,
            javax.swing.JTextField definitionField, javax.swing.JTextField tagalogField, javax.swing.JTextField synonymField,
            javax.swing.JTextField antonymField, javax.swing.JTextField sentenceField) {
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

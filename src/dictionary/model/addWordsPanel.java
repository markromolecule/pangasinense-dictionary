package dictionary.model;

import dictionary.model.helper.navBarHover;
import dictionary.controller.wordController;
import dictionary.manager.wordManager;
import dictionary.entities.word;
import javax.swing.table.DefaultTableModel;

public class addWordsPanel extends javax.swing.JPanel {

    private wordManager wordManager;

    public addWordsPanel() {
        initComponents();
        applyHoverEffects();
        loadWordsFromFile();

        DefaultTableModel model = (DefaultTableModel) wordListTable.getModel();
        wordListTable.getSelectionModel().addListSelectionListener(event -> {
            int selectedRow = wordListTable.getSelectedRow();

            if (selectedRow != -1) {
                pangasinenseField.setText(model.getValueAt(selectedRow, 1).toString());
                definitionField.setText(model.getValueAt(selectedRow, 2).toString());
                tagalogField.setText(model.getValueAt(selectedRow, 3).toString());
                synonymField.setText(model.getValueAt(selectedRow, 4).toString());
                antonymField.setText(model.getValueAt(selectedRow, 5).toString());
                sentenceField.setText(model.getValueAt(selectedRow, 6).toString());
            }
        });
    }

    private void loadWordsFromFile() {
        wordManager = new wordManager();
        wordManager.loadData();
        updateTableFromManager();
        System.out.println("Words loaded successfully.");
    }

    private void updateTableFromManager() {
        DefaultTableModel model = (DefaultTableModel) wordListTable.getModel();
        model.setRowCount(0);

        for (String key : wordManager.getWordMap().keySet()) {
            word word = wordManager.getWordMap().get(key);
            model.addRow(new Object[]{
                word.getId(),
                word.getPangasinense(),
                word.getDefinition(),
                word.getTagalog(),
                word.getSynonyms(),
                word.getAntonyms(),
                word.getSentence()
            });
        }
    }

    private void applyHoverEffects() {
        navBarHover.addHoverEffect(homeButton, false);
        navBarHover.addHoverEffect(addButton, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBarPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        definitionText = new javax.swing.JLabel();
        pangasinenseText = new javax.swing.JLabel();
        tagalogText = new javax.swing.JLabel();
        synonymText = new javax.swing.JLabel();
        antonymText = new javax.swing.JLabel();
        sentenceText = new javax.swing.JLabel();
        pangasinenseField = new javax.swing.JTextField();
        definitionField = new javax.swing.JTextField();
        tagalogField = new javax.swing.JTextField();
        synonymField = new javax.swing.JTextField();
        antonymField = new javax.swing.JTextField();
        sentenceField = new javax.swing.JTextField();
        wordListPane = new javax.swing.JScrollPane();
        wordListTable = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        freeText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 241, 234));
        setLayout(new java.awt.BorderLayout());

        navBarPanel.setBackground(new java.awt.Color(246, 241, 234));

        addButton.setBackground(new java.awt.Color(246, 241, 234));
        addButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(204, 204, 204));
        addButton.setText("MANAGE WORDS");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(246, 241, 234));
        homeButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        homeButton.setForeground(new java.awt.Color(204, 204, 204));
        homeButton.setText("HOME");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("BiauKaiTC", 1, 48)); // NOI18N
        jLabel3.setText("ADD NEW WORD   |");

        javax.swing.GroupLayout navBarPanelLayout = new javax.swing.GroupLayout(navBarPanel);
        navBarPanel.setLayout(navBarPanelLayout);
        navBarPanelLayout.setHorizontalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(homeButton)
                .addGap(68, 68, 68)
                .addComponent(addButton)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(homeButton)
                    .addComponent(addButton))
                .addGap(28, 28, 28))
        );

        add(navBarPanel, java.awt.BorderLayout.PAGE_START);

        mainPanel.setBackground(new java.awt.Color(246, 241, 234));

        definitionText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        definitionText.setText("DEFINITION: ");

        pangasinenseText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pangasinenseText.setText("PANGASINENSE WORD:");

        tagalogText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        tagalogText.setText("TAGALOG EQUIVALENT:");

        synonymText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        synonymText.setText("SYNONYMS:");

        antonymText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        antonymText.setText("ANTONYMS:");

        sentenceText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        sentenceText.setText("SENTENCE:");

        pangasinenseField.setBackground(new java.awt.Color(246, 241, 234));
        pangasinenseField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        pangasinenseField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        definitionField.setBackground(new java.awt.Color(246, 241, 234));
        definitionField.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        definitionField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tagalogField.setBackground(new java.awt.Color(246, 241, 234));
        tagalogField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        tagalogField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        synonymField.setBackground(new java.awt.Color(246, 241, 234));
        synonymField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        synonymField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        antonymField.setBackground(new java.awt.Color(246, 241, 234));
        antonymField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        antonymField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sentenceField.setBackground(new java.awt.Color(246, 241, 234));
        sentenceField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        sentenceField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        wordListTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        wordListTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        wordListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PANGASINENSE WORD", "DEFINITION", "TAGALOG", "SYNONYMS", "ANTONYMS", "SENTENCE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        wordListTable.getTableHeader().setResizingAllowed(false);
        wordListTable.getTableHeader().setReorderingAllowed(false);
        wordListPane.setViewportView(wordListTable);
        wordListTable.getColumnModel().getColumn(0).setMinWidth(0);  // ID
        wordListTable.getColumnModel().getColumn(0).setMaxWidth(0);
        wordListTable.getColumnModel().getColumn(0).setWidth(0);

        wordListTable.getColumnModel().getColumn(2).setMinWidth(0);  // DEFINITION
        wordListTable.getColumnModel().getColumn(2).setMaxWidth(0);
        wordListTable.getColumnModel().getColumn(2).setWidth(0);

        wordListTable.getColumnModel().getColumn(4).setMinWidth(0);  // SYNONYMS
        wordListTable.getColumnModel().getColumn(4).setMaxWidth(0);
        wordListTable.getColumnModel().getColumn(4).setWidth(0);

        wordListTable.getColumnModel().getColumn(5).setMinWidth(0);  // ANTONYMS
        wordListTable.getColumnModel().getColumn(5).setMaxWidth(0);
        wordListTable.getColumnModel().getColumn(5).setWidth(0);

        wordListTable.getColumnModel().getColumn(6).setMinWidth(0);  // SENTENCE
        wordListTable.getColumnModel().getColumn(6).setMaxWidth(0);
        wordListTable.getColumnModel().getColumn(6).setWidth(0);
        if (wordListTable.getColumnModel().getColumnCount() > 0) {
            wordListTable.getColumnModel().getColumn(0).setResizable(false);
            wordListTable.getColumnModel().getColumn(1).setResizable(false);
            wordListTable.getColumnModel().getColumn(2).setResizable(false);
            wordListTable.getColumnModel().getColumn(3).setResizable(false);
            wordListTable.getColumnModel().getColumn(4).setResizable(false);
            wordListTable.getColumnModel().getColumn(5).setResizable(false);
            wordListTable.getColumnModel().getColumn(6).setResizable(false);
        }

        createButton.setBackground(new java.awt.Color(246, 241, 234));
        createButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        createButton.setText("  CREATE  ");
        createButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(186, 182, 177), java.awt.Color.black));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(246, 241, 234));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        updateButton.setText("  UPDATE  ");
        updateButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(186, 182, 177), java.awt.Color.black));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(246, 241, 234));
        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        deleteButton.setText("  DELETE  ");
        deleteButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(186, 182, 177), java.awt.Color.black));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(246, 241, 234));
        saveButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        saveButton.setText("  SAVE  ");
        saveButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(186, 182, 177), java.awt.Color.black));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setBackground(new java.awt.Color(246, 241, 234));
        loadButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        loadButton.setText("  LOAD  ");
        loadButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(186, 182, 177), java.awt.Color.black));
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        freeText.setFont(new java.awt.Font("BiauKaiTC", 1, 48)); // NOI18N
        freeText.setText("|");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pangasinenseText)
                            .addComponent(definitionText)
                            .addComponent(tagalogText)
                            .addComponent(synonymText)
                            .addComponent(antonymText)
                            .addComponent(sentenceText))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(definitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(antonymField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(synonymField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tagalogField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pangasinenseField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadButton)
                        .addGap(24, 24, 24)
                        .addComponent(freeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createButton)
                        .addGap(27, 27, 27)
                        .addComponent(updateButton)
                        .addGap(27, 27, 27)
                        .addComponent(deleteButton)))
                .addGap(18, 18, 18)
                .addComponent(wordListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wordListPane)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tagalogField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(pangasinenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(definitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, 70)))
                                        .addGap(86, 86, 86))
                                    .addComponent(synonymField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(antonymField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(pangasinenseText)
                                .addGap(18, 18, 18)
                                .addComponent(definitionText)
                                .addGap(122, 122, 122)
                                .addComponent(tagalogText)
                                .addGap(56, 56, 56)
                                .addComponent(synonymText)
                                .addGap(18, 18, 18)
                                .addComponent(antonymText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sentenceText)
                            .addComponent(sentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createButton)
                            .addComponent(updateButton)
                            .addComponent(deleteButton)
                            .addComponent(loadButton)
                            .addComponent(saveButton)
                            .addComponent(freeText))))
                .addGap(84, 84, 84))
        );

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.add(new addWordsPanel());
        frame.setUndecorated(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
        new dictionaryUI().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
            DefaultTableModel model = (DefaultTableModel) wordListTable.getModel();

            wordController createAction = new wordController(
                wordController.ActionType.CREATE,
                model, 
                wordListTable,
                pangasinenseField, 
                definitionField, 
                tagalogField,
                synonymField, 
                antonymField, 
                sentenceField, 
                wordManager
            );

            createAction.execute();
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) wordListTable.getModel();

        wordController updateAction = new wordController(
            wordController.ActionType.UPDATE,
            model, 
            wordListTable,
            pangasinenseField, 
            definitionField, 
            tagalogField,
            synonymField, 
            antonymField, 
            sentenceField, 
            wordManager
        );

        updateAction.execute();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) wordListTable.getModel();

        wordController deleteAction = new wordController(
            wordController.ActionType.DELETE,
            model, 
            wordListTable,
            pangasinenseField, 
            definitionField, 
            tagalogField,
            synonymField, 
            antonymField, 
            sentenceField, 
            wordManager
        );

        deleteAction.execute();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        wordManager.saveData();
        System.out.println("Words saved to file.");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        loadWordsFromFile();
    }//GEN-LAST:event_loadButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField antonymField;
    private javax.swing.JLabel antonymText;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField definitionField;
    private javax.swing.JLabel definitionText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel freeText;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JTextField pangasinenseField;
    private javax.swing.JLabel pangasinenseText;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sentenceField;
    private javax.swing.JLabel sentenceText;
    private javax.swing.JTextField synonymField;
    private javax.swing.JLabel synonymText;
    private javax.swing.JTextField tagalogField;
    private javax.swing.JLabel tagalogText;
    private javax.swing.JButton updateButton;
    private javax.swing.JScrollPane wordListPane;
    private javax.swing.JTable wordListTable;
    // End of variables declaration//GEN-END:variables
}

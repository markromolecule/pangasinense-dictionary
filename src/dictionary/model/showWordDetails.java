package dictionary.model;

import dictionary.entities.word;

public class showWordDetails extends javax.swing.JPanel {

    public showWordDetails(word wordObj) {
        initComponents();
        pangasinenseField.setText(wordObj.getPangasinense());
        definitionField.setText(wordObj.getDefinition());
        tagalogField.setText(wordObj.getTagalog());
        synonymsField.setText(wordObj.getSynonyms());
        antonymsField.setText(wordObj.getAntonyms());
        sentenceField.setText(wordObj.getSentence());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordDetailsPanel = new javax.swing.JPanel();
        definitionText = new javax.swing.JLabel();
        synonymText = new javax.swing.JLabel();
        antonymText = new javax.swing.JLabel();
        sentenceText = new javax.swing.JLabel();
        pangasinenseField = new javax.swing.JTextArea();
        definitionField = new javax.swing.JTextArea();
        tagalogField = new javax.swing.JTextArea();
        synonymsField = new javax.swing.JTextArea();
        antonymsField = new javax.swing.JTextArea();
        sentenceField = new javax.swing.JTextArea();
        line = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 241, 234));
        setLayout(new java.awt.BorderLayout());

        wordDetailsPanel.setBackground(new java.awt.Color(246, 241, 234));

        definitionText.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        definitionText.setText("DEFINITION");

        synonymText.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        synonymText.setText("Synonyms");

        antonymText.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        antonymText.setText("Antonyms");

        sentenceText.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        sentenceText.setText("Sentence");

        pangasinenseField.setFocusable(false);
        pangasinenseField.setEditable(false);
        pangasinenseField.setBackground(new java.awt.Color(246, 241, 234));
        pangasinenseField.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        pangasinenseField.setLineWrap(true);
        pangasinenseField.setTabSize(0);
        pangasinenseField.setWrapStyleWord(true);
        pangasinenseField.setBorder(null);
        pangasinenseField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        definitionField.setFocusable(false);
        definitionField.setEditable(false);
        definitionField.setBackground(new java.awt.Color(246, 241, 234));
        definitionField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        definitionField.setLineWrap(true);
        definitionField.setTabSize(0);
        definitionField.setWrapStyleWord(true);
        definitionField.setBorder(null);
        definitionField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tagalogField.setFocusable(false);
        tagalogField.setEditable(false);
        tagalogField.setBackground(new java.awt.Color(246, 241, 234));
        tagalogField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tagalogField.setLineWrap(true);
        tagalogField.setTabSize(0);
        tagalogField.setWrapStyleWord(true);
        tagalogField.setBorder(null);
        tagalogField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        synonymsField.setFocusable(false);
        synonymsField.setEditable(false);
        synonymsField.setBackground(new java.awt.Color(246, 241, 234));
        synonymsField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        synonymsField.setLineWrap(true);
        synonymsField.setTabSize(0);
        synonymsField.setWrapStyleWord(true);
        synonymsField.setBorder(null);
        synonymsField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        antonymsField.setFocusable(false);
        antonymsField.setEditable(false);
        antonymsField.setBackground(new java.awt.Color(246, 241, 234));
        antonymsField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        antonymsField.setLineWrap(true);
        antonymsField.setTabSize(0);
        antonymsField.setWrapStyleWord(true);
        antonymsField.setBorder(null);
        antonymsField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sentenceField.setFocusable(false);
        sentenceField.setEditable(false);
        sentenceField.setBackground(new java.awt.Color(246, 241, 234));
        sentenceField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        sentenceField.setLineWrap(true);
        sentenceField.setTabSize(0);
        sentenceField.setWrapStyleWord(true);
        sentenceField.setBorder(null);
        sentenceField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        line.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        line.setText("_______________________________________________________________");
        line.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout wordDetailsPanelLayout = new javax.swing.GroupLayout(wordDetailsPanel);
        wordDetailsPanel.setLayout(wordDetailsPanelLayout);
        wordDetailsPanelLayout.setHorizontalGroup(
            wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(pangasinenseField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sentenceText)
                            .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(antonymText)
                                    .addComponent(synonymText))
                                .addGap(38, 38, 38)
                                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(antonymsField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(synonymsField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tagalogField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(definitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(definitionText)
                            .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        wordDetailsPanelLayout.setVerticalGroup(
            wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pangasinenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagalogField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(definitionText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(definitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(synonymText)
                        .addGap(37, 37, 37)
                        .addComponent(antonymText))
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(synonymsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(antonymsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(sentenceText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(wordDetailsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antonymText;
    private javax.swing.JTextArea antonymsField;
    private javax.swing.JTextArea definitionField;
    private javax.swing.JLabel definitionText;
    private javax.swing.JLabel line;
    private javax.swing.JTextArea pangasinenseField;
    private javax.swing.JTextArea sentenceField;
    private javax.swing.JLabel sentenceText;
    private javax.swing.JLabel synonymText;
    private javax.swing.JTextArea synonymsField;
    private javax.swing.JTextArea tagalogField;
    private javax.swing.JPanel wordDetailsPanel;
    // End of variables declaration//GEN-END:variables
}

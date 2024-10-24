package dictionary.layout;

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
        pangasinenseText = new javax.swing.JLabel();
        definitionText = new javax.swing.JLabel();
        tagalogText = new javax.swing.JLabel();
        synonymText = new javax.swing.JLabel();
        antonymText = new javax.swing.JLabel();
        sentenceText = new javax.swing.JLabel();
        pangasinenseField = new javax.swing.JTextArea();
        definitionField = new javax.swing.JTextArea();
        tagalogField = new javax.swing.JTextArea();
        synonymsField = new javax.swing.JTextArea();
        antonymsField = new javax.swing.JTextArea();
        sentenceField = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(246, 241, 234));
        setLayout(new java.awt.BorderLayout());

        wordDetailsPanel.setBackground(new java.awt.Color(246, 241, 234));

        pangasinenseText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pangasinenseText.setText("PANGASINENSE WORD:");

        definitionText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        definitionText.setText("DEFINITION: ");

        tagalogText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        tagalogText.setText("TAGALOG EQUIVALENT:");

        synonymText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        synonymText.setText("SYNONYMS:");

        antonymText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        antonymText.setText("ANTONYMS:");

        sentenceText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        sentenceText.setText("SENTENCE:");

        pangasinenseField.setFocusable(false);
        pangasinenseField.setEditable(false);
        pangasinenseField.setBackground(new java.awt.Color(246, 241, 234));
        pangasinenseField.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
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
        tagalogField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        tagalogField.setLineWrap(true);
        tagalogField.setTabSize(0);
        tagalogField.setWrapStyleWord(true);
        tagalogField.setBorder(null);
        tagalogField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        synonymsField.setFocusable(false);
        synonymsField.setEditable(false);
        synonymsField.setBackground(new java.awt.Color(246, 241, 234));
        synonymsField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        synonymsField.setLineWrap(true);
        synonymsField.setTabSize(0);
        synonymsField.setWrapStyleWord(true);
        synonymsField.setBorder(null);
        synonymsField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        antonymsField.setFocusable(false);
        antonymsField.setEditable(false);
        antonymsField.setBackground(new java.awt.Color(246, 241, 234));
        antonymsField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
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

        javax.swing.GroupLayout wordDetailsPanelLayout = new javax.swing.GroupLayout(wordDetailsPanel);
        wordDetailsPanel.setLayout(wordDetailsPanelLayout);
        wordDetailsPanelLayout.setHorizontalGroup(
            wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(sentenceText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(antonymText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(antonymsField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(synonymText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(synonymsField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(tagalogText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(tagalogField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(definitionText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(definitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                        .addComponent(pangasinenseText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pangasinenseField, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        wordDetailsPanelLayout.setVerticalGroup(
            wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordDetailsPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pangasinenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pangasinenseText))
                .addGap(30, 30, 30)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(definitionText)
                    .addComponent(definitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagalogText)
                    .addComponent(tagalogField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(synonymText)
                    .addComponent(synonymsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antonymText)
                    .addComponent(antonymsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(wordDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sentenceText)
                    .addComponent(sentenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        add(wordDetailsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antonymText;
    private javax.swing.JTextArea antonymsField;
    private javax.swing.JTextArea definitionField;
    private javax.swing.JLabel definitionText;
    private javax.swing.JTextArea pangasinenseField;
    private javax.swing.JLabel pangasinenseText;
    private javax.swing.JTextArea sentenceField;
    private javax.swing.JLabel sentenceText;
    private javax.swing.JLabel synonymText;
    private javax.swing.JTextArea synonymsField;
    private javax.swing.JTextArea tagalogField;
    private javax.swing.JLabel tagalogText;
    private javax.swing.JPanel wordDetailsPanel;
    // End of variables declaration//GEN-END:variables
}

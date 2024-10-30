package dictionary.model;

import dictionary.model.helper.navLetterHover;
import dictionary.model.helper.navBarHover;
import dictionary.model.helper.roundedTextField;
import dictionary.manager.wordManager;
import dictionary.entities.word;
import java.awt.event.ActionEvent;
import java.util.TreeMap;
import javax.swing.JFrame;

public class dictionaryUI extends javax.swing.JFrame {

    private javax.swing.JFrame currentFrame;

    public dictionaryUI() {
        initComponents();
        loadWords();
        applyHoverEffects();
        setLocationRelativeTo(null);
        currentFrame = this;
    }

    private void applyHoverEffects() {
        javax.swing.JButton[] alphabetButtons = {
            aButton, bButton, cButton, dButton, eButton, fButton, gButton,
            hButton, iButton, jButton, kButton, lButton, mButton, nButton,
            oButton, pButton, qButton, rButton, sButton, tButton, uButton,
            vButton, wButton, xButton, yButton, zButton
        };
        navLetterHover.addHoverEffectToButtons(alphabetButtons, aButton);
        navBarHover.addHoverEffect(homeButton, true);
        navBarHover.addHoverEffect(addButton, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        navBarPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        searchBar = searchBar = new roundedTextField(20);
        navWordsPanel = new javax.swing.JPanel();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        wordsScrollPane = new javax.swing.JScrollPane();
        wordsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame"); // NOI18N
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(246, 241, 234));

        titlePanel.setBackground(new java.awt.Color(246, 241, 234));

        title.setFont(new java.awt.Font("BiauKaiTC", 1, 48)); // NOI18N
        title.setText("PANGASINENSE DICTIONARY");
        title.setSize(new java.awt.Dimension(42, 20));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(214, 214, 214))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        navBarPanel.setBackground(new java.awt.Color(246, 241, 234));

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

        addButton.setBackground(new java.awt.Color(246, 241, 234));
        addButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(204, 204, 204));
        addButton.setText("ADD WORDS");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        searchBar.setBackground(new java.awt.Color(246, 241, 234));
        searchBar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        searchBar.setForeground(new java.awt.Color(204, 204, 204));
        searchBar.setText("Search for a word");
        searchBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBarFocusLost(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarPanelLayout = new javax.swing.GroupLayout(navBarPanel);
        navBarPanel.setLayout(navBarPanelLayout);
        navBarPanelLayout.setHorizontalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton)
                .addGap(117, 117, 117)
                .addComponent(addButton)
                .addGap(115, 115, 115))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeButton)
                    .addComponent(addButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        navWordsPanel.setBackground(new java.awt.Color(246, 241, 234));

        aButton.setBackground(new java.awt.Color(246, 241, 234));
        aButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        aButton.setForeground(new java.awt.Color(204, 204, 204));
        aButton.setText("A");
        aButton.setBorder(null);
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });

        bButton.setBackground(new java.awt.Color(246, 241, 234));
        bButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        bButton.setForeground(new java.awt.Color(204, 204, 204));
        bButton.setText("B");
        bButton.setBorder(null);
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        cButton.setBackground(new java.awt.Color(246, 241, 234));
        cButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        cButton.setForeground(new java.awt.Color(204, 204, 204));
        cButton.setText("C");
        cButton.setBorder(null);
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        dButton.setBackground(new java.awt.Color(246, 241, 234));
        dButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        dButton.setForeground(new java.awt.Color(204, 204, 204));
        dButton.setText("D");
        dButton.setBorder(null);
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });

        eButton.setBackground(new java.awt.Color(246, 241, 234));
        eButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        eButton.setForeground(new java.awt.Color(204, 204, 204));
        eButton.setText("E");
        eButton.setBorder(null);
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        fButton.setBackground(new java.awt.Color(246, 241, 234));
        fButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        fButton.setForeground(new java.awt.Color(204, 204, 204));
        fButton.setText("F");
        fButton.setBorder(null);
        fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });

        gButton.setBackground(new java.awt.Color(246, 241, 234));
        gButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        gButton.setForeground(new java.awt.Color(204, 204, 204));
        gButton.setText("G");
        gButton.setBorder(null);
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });

        hButton.setBackground(new java.awt.Color(246, 241, 234));
        hButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        hButton.setForeground(new java.awt.Color(204, 204, 204));
        hButton.setText("H");
        hButton.setBorder(null);
        hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });

        iButton.setBackground(new java.awt.Color(246, 241, 234));
        iButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        iButton.setForeground(new java.awt.Color(204, 204, 204));
        iButton.setText("I");
        iButton.setBorder(null);
        iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });

        jButton.setBackground(new java.awt.Color(246, 241, 234));
        jButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton.setForeground(new java.awt.Color(204, 204, 204));
        jButton.setText("J");
        jButton.setBorder(null);
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        kButton.setBackground(new java.awt.Color(246, 241, 234));
        kButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        kButton.setForeground(new java.awt.Color(204, 204, 204));
        kButton.setText("K");
        kButton.setBorder(null);
        kButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonActionPerformed(evt);
            }
        });

        lButton.setBackground(new java.awt.Color(246, 241, 234));
        lButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lButton.setForeground(new java.awt.Color(204, 204, 204));
        lButton.setText("L");
        lButton.setBorder(null);
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });

        mButton.setBackground(new java.awt.Color(246, 241, 234));
        mButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        mButton.setForeground(new java.awt.Color(204, 204, 204));
        mButton.setText("M");
        mButton.setBorder(null);
        mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });

        nButton.setBackground(new java.awt.Color(246, 241, 234));
        nButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        nButton.setForeground(new java.awt.Color(204, 204, 204));
        nButton.setText("N");
        nButton.setBorder(null);
        nButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButtonActionPerformed(evt);
            }
        });

        oButton.setBackground(new java.awt.Color(246, 241, 234));
        oButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        oButton.setForeground(new java.awt.Color(204, 204, 204));
        oButton.setText("O");
        oButton.setBorder(null);
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });

        pButton.setBackground(new java.awt.Color(246, 241, 234));
        pButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pButton.setForeground(new java.awt.Color(204, 204, 204));
        pButton.setText("P");
        pButton.setBorder(null);
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        qButton.setBackground(new java.awt.Color(246, 241, 234));
        qButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        qButton.setForeground(new java.awt.Color(204, 204, 204));
        qButton.setText("Q");
        qButton.setBorder(null);
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });

        rButton.setBackground(new java.awt.Color(246, 241, 234));
        rButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        rButton.setForeground(new java.awt.Color(204, 204, 204));
        rButton.setText("R");
        rButton.setBorder(null);
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });

        sButton.setBackground(new java.awt.Color(246, 241, 234));
        sButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        sButton.setForeground(new java.awt.Color(204, 204, 204));
        sButton.setText("S");
        sButton.setBorder(null);
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        tButton.setBackground(new java.awt.Color(246, 241, 234));
        tButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        tButton.setForeground(new java.awt.Color(204, 204, 204));
        tButton.setText("T");
        tButton.setBorder(null);
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });

        uButton.setBackground(new java.awt.Color(246, 241, 234));
        uButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        uButton.setForeground(new java.awt.Color(204, 204, 204));
        uButton.setText("U");
        uButton.setBorder(null);
        uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });

        vButton.setBackground(new java.awt.Color(246, 241, 234));
        vButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        vButton.setForeground(new java.awt.Color(204, 204, 204));
        vButton.setText("V");
        vButton.setBorder(null);
        vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });

        wButton.setBackground(new java.awt.Color(246, 241, 234));
        wButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        wButton.setForeground(new java.awt.Color(204, 204, 204));
        wButton.setText("W");
        wButton.setBorder(null);
        wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });

        xButton.setBackground(new java.awt.Color(246, 241, 234));
        xButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        xButton.setForeground(new java.awt.Color(204, 204, 204));
        xButton.setText("X");
        xButton.setBorder(null);
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        yButton.setBackground(new java.awt.Color(246, 241, 234));
        yButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        yButton.setForeground(new java.awt.Color(204, 204, 204));
        yButton.setText("Y");
        yButton.setBorder(null);
        yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });

        zButton.setBackground(new java.awt.Color(246, 241, 234));
        zButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        zButton.setForeground(new java.awt.Color(204, 204, 204));
        zButton.setText("Z");
        zButton.setBorder(null);
        zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navWordsPanelLayout = new javax.swing.GroupLayout(navWordsPanel);
        navWordsPanel.setLayout(navWordsPanelLayout);
        navWordsPanelLayout.setHorizontalGroup(
            navWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navWordsPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        navWordsPanelLayout.setVerticalGroup(
            navWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navWordsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aButton)
                    .addComponent(bButton)
                    .addComponent(cButton)
                    .addComponent(dButton)
                    .addComponent(eButton)
                    .addComponent(fButton)
                    .addComponent(gButton)
                    .addComponent(hButton)
                    .addComponent(iButton)
                    .addComponent(jButton)
                    .addComponent(kButton)
                    .addComponent(lButton)
                    .addComponent(mButton)
                    .addComponent(nButton)
                    .addComponent(oButton)
                    .addComponent(pButton)
                    .addComponent(qButton)
                    .addComponent(rButton)
                    .addComponent(sButton)
                    .addComponent(tButton)
                    .addComponent(uButton)
                    .addComponent(vButton)
                    .addComponent(wButton)
                    .addComponent(xButton)
                    .addComponent(yButton)
                    .addComponent(zButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        wordsScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        wordsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wordsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        wordsScrollPane.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.white));
        wordsScrollPane.setColumnHeaderView(null);
        wordsScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wordsScrollPane.setDoubleBuffered(true);
        wordsScrollPane.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        wordsScrollPane.setRowHeaderView(null);

        wordsPanel.setBackground(new java.awt.Color(255, 255, 255));
        wordsPanel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        wordsPanel.setLayout(new java.awt.GridLayout(0, 5, 2, 2));
        wordsScrollPane.setViewportView(wordsPanel);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(wordsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(navWordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navWordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadWords() {
        wordManager wordMgr = new wordManager();
        TreeMap<String, word> wordsMap = wordMgr.getWordMap();
        wordsPanel.removeAll();

        for (String key : wordsMap.keySet()) {
            word wordObj = wordsMap.get(key);
            javax.swing.JButton wordButton = new javax.swing.JButton(wordObj.getPangasinense());

            wordButton.setPreferredSize(new java.awt.Dimension(40, 70)); // Adjust size for better readability
            wordButton.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));

            // Customize colors and appearance
            wordButton.setBackground(new java.awt.Color(255, 255, 255));
            wordButton.setForeground(java.awt.Color.BLACK);
            wordButton.setFocusPainted(false);
            wordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 241, 234), 2, true)); // Rounded border
            wordButton.setOpaque(true);
            wordButton.setContentAreaFilled(false);

            // Add hover effect
            wordButton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    wordButton.setBackground(new java.awt.Color(246, 241, 234)); // Darker blue on hover
                    wordButton.setOpaque(true);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    wordButton.setBackground(new java.awt.Color(255, 255, 255)); // Original color
                    wordButton.setOpaque(true);
                }
            });

            wordButton.addActionListener((ActionEvent e) -> {
                showWordDetails(wordObj);
            });

            wordsPanel.add(wordButton);
        }
        wordsPanel.revalidate();
        wordsPanel.repaint();
    }

    private void showWordDetails(word wordObj) {
        JFrame frame = new JFrame("Word Details");
        frame.add(new showWordDetails(wordObj));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Method for navWordsPanel
    private void goToNearestLetter(char letter) {
        wordManager wordMgr = new wordManager();
        TreeMap<String, word> wordsMap = wordMgr.getWordMap();
        wordsPanel.removeAll();

        boolean wordFound = false;

        for (String key : wordsMap.keySet()) {
            if (key.toUpperCase().charAt(0) == Character.toUpperCase(letter)) {
                word wordObj = wordsMap.get(key);
                javax.swing.JButton wordButton = new javax.swing.JButton(wordObj.getPangasinense());

                // Set button size and appearance
                wordButton.setPreferredSize(new java.awt.Dimension(40, 70));
                wordButton.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
                wordButton.setBackground(new java.awt.Color(255, 255, 255));
                wordButton.setForeground(java.awt.Color.BLACK);
                wordButton.setFocusPainted(false);
                wordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 241, 234), 2, true)); // Rounded border
                wordButton.setOpaque(true);
                wordButton.setContentAreaFilled(false);

                // Add hover effect
                wordButton.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        wordButton.setBackground(new java.awt.Color(246, 241, 234)); // Hover color
                        wordButton.setOpaque(true);
                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        wordButton.setBackground(new java.awt.Color(255, 255, 255)); // Original color
                        wordButton.setOpaque(true);
                    }
                });

                wordButton.addActionListener((ActionEvent e) -> {
                    showWordDetails(wordObj);
                });

                wordsPanel.add(wordButton);
                wordFound = true;
            }
        }

        if (!wordFound) {
            javax.swing.JLabel noWordsLabel = new javax.swing.JLabel("No words found for letter: " + letter);
            wordsPanel.add(noWordsLabel);
        }

        wordsPanel.revalidate();
        wordsPanel.repaint();
    }

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        loadWords();
        javax.swing.JButton[] alphabetButtons = {
            aButton, bButton, cButton, dButton, eButton, fButton, gButton,
            hButton, iButton, jButton, kButton, lButton, mButton, nButton,
            oButton, pButton, qButton, rButton, sButton, tButton, uButton,
            vButton, wButton, xButton, yButton, zButton
        };

        // Call the resetAlphabetButtons method from the navLetterHover class
        navLetterHover.resetAlphabetButtons(alphabetButtons, addButton);
        navLetterHover.addHoverEffect(aButton, true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addWordsPanel panel = new addWordsPanel();
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.add(panel);
        frame.setUndecorated(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        if (currentFrame != null) {
            currentFrame.dispose();
        }

        currentFrame = frame;
    }//GEN-LAST:event_addButtonActionPerformed

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        goToNearestLetter('A');
    }//GEN-LAST:event_aButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
        goToNearestLetter('B');
    }//GEN-LAST:event_bButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        goToNearestLetter('C');
    }//GEN-LAST:event_cButtonActionPerformed

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButtonActionPerformed
        goToNearestLetter('D');
    }//GEN-LAST:event_dButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        goToNearestLetter('E');
    }//GEN-LAST:event_eButtonActionPerformed

    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
        goToNearestLetter('F');
    }//GEN-LAST:event_fButtonActionPerformed

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButtonActionPerformed
        goToNearestLetter('G');
    }//GEN-LAST:event_gButtonActionPerformed

    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hButtonActionPerformed
        goToNearestLetter('H');
    }//GEN-LAST:event_hButtonActionPerformed

    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iButtonActionPerformed
        goToNearestLetter('I');
    }//GEN-LAST:event_iButtonActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        goToNearestLetter('J');
    }//GEN-LAST:event_jButtonActionPerformed

    private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonActionPerformed
        goToNearestLetter('K');
    }//GEN-LAST:event_kButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        goToNearestLetter('L');
    }//GEN-LAST:event_lButtonActionPerformed

    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonActionPerformed
        goToNearestLetter('M');
    }//GEN-LAST:event_mButtonActionPerformed

    private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nButtonActionPerformed
        goToNearestLetter('N');
    }//GEN-LAST:event_nButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        goToNearestLetter('O');
    }//GEN-LAST:event_oButtonActionPerformed

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
        goToNearestLetter('P');
    }//GEN-LAST:event_pButtonActionPerformed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        goToNearestLetter('Q');
    }//GEN-LAST:event_qButtonActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
        goToNearestLetter('R');
    }//GEN-LAST:event_rButtonActionPerformed

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        goToNearestLetter('S');
    }//GEN-LAST:event_sButtonActionPerformed

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed
        goToNearestLetter('T');
    }//GEN-LAST:event_tButtonActionPerformed

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uButtonActionPerformed
        goToNearestLetter('U');
    }//GEN-LAST:event_uButtonActionPerformed

    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vButtonActionPerformed
        goToNearestLetter('V');
    }//GEN-LAST:event_vButtonActionPerformed

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wButtonActionPerformed
        goToNearestLetter('W');
    }//GEN-LAST:event_wButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        goToNearestLetter('X');
    }//GEN-LAST:event_xButtonActionPerformed

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yButtonActionPerformed
        goToNearestLetter('Y');
    }//GEN-LAST:event_yButtonActionPerformed

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zButtonActionPerformed
        goToNearestLetter('Z');
    }//GEN-LAST:event_zButtonActionPerformed

    private void focus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focus
        if (searchBar.getText().equals("Search for a word")) {
            searchBar.setText("");
            searchBar.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_focus

    private void searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusLost
        if (searchBar.getText().trim().equals("")) {
            searchBar.setText("Search for a word");
            searchBar.setForeground(java.awt.Color.GRAY);
        }
    }//GEN-LAST:event_searchBarFocusLost

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        String query = searchBar.getText().trim();
        if (!query.equals("Search for a word") && !query.isEmpty()) {
            searchForWord(query);
            searchBar.setText(""); // Clear the search bar after performing the search
            searchBar.setForeground(java.awt.Color.GRAY); // Reset text color for placeholder
            searchBar.setText("Search for a word"); // Set placeholder text back
        }
    }//GEN-LAST:event_searchBarActionPerformed

    private void searchForWord(String query) {
        wordsPanel.removeAll();
        wordManager wordMgr = new wordManager();
        TreeMap<String, word> wordsMap = wordMgr.getWordMap();

        boolean wordFound = false;

        for (String key : wordsMap.keySet()) {
            word wordObj = wordsMap.get(key);

            // Check if query matches the word or its properties
            if (key.toLowerCase().contains(query.toLowerCase())
                    || wordObj.getDefinition().toLowerCase().contains(query.toLowerCase())
                    || wordObj.getSynonyms().toLowerCase().contains(query.toLowerCase())
                    || wordObj.getAntonyms().toLowerCase().contains(query.toLowerCase())) {

                javax.swing.JButton wordButton = new javax.swing.JButton(wordObj.getPangasinense());

                // Apply button style and hover effect
                wordButton.setPreferredSize(new java.awt.Dimension(40, 70));
                wordButton.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
                wordButton.setBackground(new java.awt.Color(255, 255, 255));
                wordButton.setForeground(java.awt.Color.BLACK);
                wordButton.setFocusPainted(false);
                wordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 241, 234), 2, true));
                wordButton.setOpaque(true);
                wordButton.setContentAreaFilled(false);

                wordButton.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        wordButton.setBackground(new java.awt.Color(246, 241, 234)); // Hover color
                        wordButton.repaint();
                        wordButton.setOpaque(true);
                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        wordButton.setBackground(new java.awt.Color(255, 255, 255)); // Original color
                        wordButton.repaint();
                        wordButton.setOpaque(true);
                    }
                });

                wordButton.addActionListener((ActionEvent e) -> {
                    showWordDetails wordDetailsPanel = new showWordDetails(wordObj);
                    javax.swing.JFrame frame = new javax.swing.JFrame();
                    frame.add(wordDetailsPanel);
                    frame.setUndecorated(false);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });

                wordsPanel.add(wordButton);
                wordFound = true;
            }
        }

        if (!wordFound) {
            javax.swing.JLabel noResultsLabel = new javax.swing.JLabel("No results found for: " + query);
            noResultsLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
            noResultsLabel.setForeground(java.awt.Color.BLACK);
            wordsPanel.add(noResultsLabel);
        }

        wordsPanel.revalidate();
        wordsPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton dButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton mButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nButton;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JPanel navWordsPanel;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton tButton;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JPanel wordsPanel;
    private javax.swing.JScrollPane wordsScrollPane;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
}

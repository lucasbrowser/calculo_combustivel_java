package com.lucas.calculocombustivel.view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * 
 *
 * @author lucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        Locale locale = new Locale("pt","BR"); 
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat dataHora = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'.'",locale); 
        lblData.setText("Diamantino-MT, "+dataHora.format(calendar.getTime()));
        UIManager.put("OptionPane.yesButtonText", "Sim"); 
        UIManager.put("OptionPane.noButtonText", "Não"); 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        bCombustivel = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFerramentas = new javax.swing.JMenu();
        miCalculoCombustivel = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cálculo de Combustível");
        setIconImages(null);

        toolBar.setFloatable(false);

        bCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/combustivel.png"))); // NOI18N
        bCombustivel.setText("Combustível");
        bCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCombustivel.setFocusable(false);
        bCombustivel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCombustivel.setMargin(new java.awt.Insets(2, 12, 2, 12));
        bCombustivel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalculoCombustivelActionPerformed(evt);
            }
        });
        toolBar.add(bCombustivel);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);

        lblNome.setText(".");
        desktopPane.add(lblNome);
        lblNome.setBounds(790, 580, 160, 14);

        lblData.setText("........");
        desktopPane.add(lblData);
        lblData.setBounds(670, 600, 310, 14);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuFerramentas.setText("Aplicação");

        miCalculoCombustivel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miCalculoCombustivel.setMnemonic('V');
        miCalculoCombustivel.setText("Cálculo de Combustível");
        miCalculoCombustivel.setToolTipText("");
        miCalculoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalculoCombustivelActionPerformed(evt);
            }
        });
        menuFerramentas.add(miCalculoCombustivel);

        menuBar.add(menuFerramentas);

        menuSistema.setText("Sistema");

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1040, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        int q = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (q==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void miCalculoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalculoCombustivelActionPerformed
        // TODO add your handling code here:
        TelaCalculoCombustivel c = new TelaCalculoCombustivel();
        c.setVisible(true);
    }//GEN-LAST:event_miCalculoCombustivelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCombustivel;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblNome;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCalculoCombustivel;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}

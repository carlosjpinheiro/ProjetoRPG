


import javax.swing.JOptionPane;


public class SelecaoPersonagem extends javax.swing.JFrame {
    public void iniciaJogo(int i){
        String nome = JOptionPane.showInputDialog("Insira seu NickName:");
        jogo telaJogo = new jogo();
        telaJogo.criaPersonagem(i, nome);
        telaJogo.setVisible(true);
    }

    public SelecaoPersonagem() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelGuerreio = new javax.swing.JLabel();
        SelAssasino = new javax.swing.JLabel();
        SelArqueiro = new javax.swing.JLabel();
        SelMago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Classe");

        SelGuerreio.setIcon(new javax.swing.ImageIcon("C:\\JoanaEnchendo\\JoanaEnchendoRPG\\IMG\\50\\guerreiro.png")); // NOI18N
        SelGuerreio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelGuerreioMouseClicked(evt);
            }
        });

        SelAssasino.setIcon(new javax.swing.ImageIcon("C:\\JoanaEnchendo\\JoanaEnchendoRPG\\IMG\\50\\Assasino.png")); // NOI18N
        SelAssasino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelAssasinoMouseClicked(evt);
            }
        });

        SelArqueiro.setIcon(new javax.swing.ImageIcon("C:\\JoanaEnchendo\\JoanaEnchendoRPG\\IMG\\50\\arqueiro.png")); // NOI18N
        SelArqueiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelArqueiroMouseClicked(evt);
            }
        });

        SelMago.setIcon(new javax.swing.ImageIcon("C:\\JoanaEnchendo\\JoanaEnchendoRPG\\IMG\\50\\mago.png")); // NOI18N
        SelMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelMagoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelMago)
                    .addComponent(SelArqueiro)
                    .addComponent(SelAssasino)
                    .addComponent(SelGuerreio))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(SelGuerreio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelMago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelArqueiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelAssasino)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelGuerreioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelGuerreioMouseClicked
        iniciaJogo(1);
    }//GEN-LAST:event_SelGuerreioMouseClicked

    private void SelMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelMagoMouseClicked
        iniciaJogo(2);
    }//GEN-LAST:event_SelMagoMouseClicked

    private void SelArqueiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelArqueiroMouseClicked
        iniciaJogo(3);
    }//GEN-LAST:event_SelArqueiroMouseClicked

    private void SelAssasinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelAssasinoMouseClicked
        iniciaJogo(4);
    }//GEN-LAST:event_SelAssasinoMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelecaoPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecaoPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecaoPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecaoPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecaoPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SelArqueiro;
    private javax.swing.JLabel SelAssasino;
    private javax.swing.JLabel SelGuerreio;
    private javax.swing.JLabel SelMago;
    // End of variables declaration//GEN-END:variables
}

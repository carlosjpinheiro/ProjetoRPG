


import javax.swing.JOptionPane;


public class jogo extends javax.swing.JFrame {

    public int classe = 0;
    public personagem p;
    
    public void atacarAdversario(int habilidade){
        int dano = p.calculaDano(habilidade);
        JOptionPane.showMessageDialog(null, "dano: "+dano);// pode tirar é somente para debug
        //p.addXP(dano); adionar a quantidade de dano como xp?
        //inimigo.diminuiHP(dano) atribuir dano ao inimico (implementar)
        //inimigo.vivo
        atualizaAtributosPersonagem(p);
    }
    
    private void setPersonagem(personagem p) {
        this.p = p;
    }

    public void rodaEncontros(personagem p) {
    	while (p.getHP() > 0) {
    		if (Encounter.counter > 1) Potions.perguntaUsarHP(p);			
			System.out.println("Você encontra o inimigo nr "+Encounter.counter);
			Encounter.encounter(p);
			if (Utilities.chance(10)) {
				p.setHpPocoes(p.getHpPocoes()+1);
				System.out.println("Uma poção de HP cai de seu inimigo e você a recolhe!");
			}
    		
    		
    				
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    }
    
    
    public void criaPersonagem(int i, String nome) {
        classe = i;
        switch (i) {
            case 1:
                setPersonagem(new guerreiro(nome));
                break;
            case 2:
                setPersonagem(new mago(nome));
                break;
            case 3:
                setPersonagem(new arqueiro(nome));
                break;
            case 4:
                setPersonagem(new assassino(nome));
                break;
            default:
                break;
        }
        atualizaAtributosPersonagem(p);

    }

    public String getNomeClasse(int classe) {
        switch (classe) {
            case 1:
                return "Guerreiro";
            case 2:
                return "Mago";
            case 3:
                return "Arqueiro";
            case 4:
                return "Assasino";
            default:
                return "Nenhuma";
        }

    }
    

    public String retornaTextoIdentado(int ponto) {
        String texto = "";
        if (ponto > 9) {
            texto = " ";
        } else if (ponto > 99) {
            texto = "  ";
        } else if (ponto > 999) {
            texto = "   ";
        } else if (ponto > 9999) {
            texto = "    ";
        } else if (ponto > 99999) {
            texto = "     ";
        }
        return texto + ponto;
    }

    

    public void atualizaAtributosPersonagem(personagem p) {
        DisplayHP.setText(p.getHP()+"/"+p.getHPMaximo());
        DisplayMP.setText(p.getMP()+"/"+p.getMPMaximo());
        DisplayAtackFisico.setText(String.valueOf(p.getAtaqueFisico()));
        DisplayAtackMagico.setText(String.valueOf(p.getAtaqueMagico()));
        DisplayDefasa.setText(String.valueOf(p.getDefesa()));
        DisplayForca.setText("Força           " + retornaTextoIdentado(p.getPontosForca()));
        DisplayInteligencia.setText("Inteligencia    " + retornaTextoIdentado(p.getPontosInteligencia()));
        DisplayDestreza.setText("Destreza         "+retornaTextoIdentado(p.getPontosDestreza()));
        Displaypontosdisponiveis.setText("Pontos Disponiveis " + String.valueOf(p.getPontosNaoAplicados()));
        DisplayNickXP.setText((p.getNome() + " " + getNomeClasse(classe) + " NIVEL " + p.getNivel() + " (" + p.getXP()
                + "/" + p.getXPNecessario() + ")XP").toUpperCase());
        btnHabilidade2.setText(p.getNomeHabilidade1()+"("+p.getConsumoManaHabilidade1()+" MP)");
        btnHabilidade3.setText(p.getNomeHabilidade2()+"("+p.getConsumoManaHabilidade2()+" MP)");
        if (p.getNivel() >= 2 && p.getMP() >= p.getConsumoManaHabilidade1()){
            btnHabilidade2.setEnabled(true);
        }else{
            btnHabilidade2.setEnabled(false);
        }
        
        if (p.getNivel() >= 10 && p.getMP() >= p.getConsumoManaHabilidade2()){
            btnHabilidade3.setEnabled(true);
        }else{
            btnHabilidade3.setEnabled(false);
        }
        
        if(p.getNivel() > 1){
            necessarionv2.setVisible(false);
        }else{
            necessarionv2.setVisible(true);
        }
     
        if(p.getNivel() > 9){
            necessarionv10.setVisible(false);
        }else{
            necessarionv10.setVisible(true);
        }
        

    }

    /**
     * Creates new form jogo
     */
    public jogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        DisplayForca = new javax.swing.JLabel();
        DisplayAtackFisico = new javax.swing.JLabel();
        DisplayDefasa = new javax.swing.JLabel();
        DisplayMP = new javax.swing.JLabel();
        DisplayAtackMagico = new javax.swing.JLabel();
        DisplayNickXP = new javax.swing.JLabel();
        DisplayHP = new javax.swing.JLabel();
        DisplayDestreza = new javax.swing.JLabel();
        DisplayInteligencia = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Displaypontosdisponiveis = new javax.swing.JLabel();
        btnHabilidade1 = new javax.swing.JButton();
        btnHabilidade2 = new javax.swing.JButton();
        btnHabilidade3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        necessarionv2 = new javax.swing.JLabel();
        necessarionv10 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayForca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DisplayForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        DisplayForca.setText("Força 10          ");
        DisplayForca.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DisplayForca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayForcaMouseClicked(evt);
            }
        });

        DisplayAtackFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/str.png"))); // NOI18N
        DisplayAtackFisico.setText("100000");

        DisplayDefasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DEFESE.png"))); // NOI18N
        DisplayDefasa.setText("200000");

        DisplayMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MP.png"))); // NOI18N
        DisplayMP.setText(" 41/51");

        DisplayAtackMagico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MAGICATACK.png"))); // NOI18N
        DisplayAtackMagico.setText("142");

        DisplayNickXP.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        DisplayNickXP.setText("LUCAS GUERREIRO NIVEL 90 (273/5400)XP");

        DisplayHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HP.png"))); // NOI18N
        DisplayHP.setText(" 0/100000");

        DisplayDestreza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DisplayDestreza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        DisplayDestreza.setText("Destreza 4        ");
        DisplayDestreza.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DisplayDestreza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayDestrezaMouseClicked(evt);
            }
        });

        DisplayInteligencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DisplayInteligencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADD.png"))); // NOI18N
        DisplayInteligencia.setText("Inteligencia 2  ");
        DisplayInteligencia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DisplayInteligencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayInteligenciaMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel10.setText("[######      ] 600/100HP");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ORC.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel12.setText("ORC FURIOSO NIVEL 97");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Você atacou o ORC FURIOSO com uma espadada\nVocê recebeu um ataque, 120 de HP foram descontados\nVocê subiu de nível.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(816, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel12)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        Displaypontosdisponiveis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Displaypontosdisponiveis.setText("Pontos Disponiveis 0");
        Displaypontosdisponiveis.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnHabilidade1.setText("Ataque base");
        btnHabilidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilidade1ActionPerformed(evt);
            }
        });

        btnHabilidade2.setText("atq1");
        btnHabilidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilidade2ActionPerformed(evt);
            }
        });

        btnHabilidade3.setText("atq2");
        btnHabilidade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilidade3ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        necessarionv2.setForeground(new java.awt.Color(204, 0, 51));
        necessarionv2.setText("Necessário nível 2");

        necessarionv10.setForeground(new java.awt.Color(204, 0, 51));
        necessarionv10.setText("Necessário nível 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DisplayMP, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(DisplayAtackFisico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DisplayAtackMagico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DisplayDefasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(DisplayHP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Displaypontosdisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(DisplayDestreza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(DisplayForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(DisplayInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btnHabilidade3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnHabilidade2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnHabilidade1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(necessarionv2)
                                                    .addComponent(necessarionv10))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(DisplayNickXP, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(86, 86, 86)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DisplayNickXP)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(DisplayHP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisplayMP)
                                .addGap(9, 9, 9)
                                .addComponent(DisplayAtackFisico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisplayAtackMagico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisplayDefasa)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(DisplayForca)
                                .addGap(10, 10, 10)
                                .addComponent(DisplayInteligencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisplayDestreza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Displaypontosdisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHabilidade1)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnHabilidade2)
                                            .addComponent(necessarionv2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnHabilidade3)
                                            .addComponent(necessarionv10))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1))))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayForcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayForcaMouseClicked
        if (p.getPontosNaoAplicados() > 0){
            p.aumentaForca();
            atualizaAtributosPersonagem(p);
        }
    }//GEN-LAST:event_DisplayForcaMouseClicked

    private void DisplayInteligenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayInteligenciaMouseClicked
        if (p.getPontosNaoAplicados() > 0){  
            p.aumentaInteligencia();
            atualizaAtributosPersonagem(p);
        }
    }//GEN-LAST:event_DisplayInteligenciaMouseClicked

    private void DisplayDestrezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayDestrezaMouseClicked
       if (p.getPontosNaoAplicados() > 0){
           p.aumentaDestreza();
           atualizaAtributosPersonagem(p);
       }
    }//GEN-LAST:event_DisplayDestrezaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         p.addXP(6);
         atualizaAtributosPersonagem(p);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHabilidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilidade1ActionPerformed
        atacarAdversario(1);
    }//GEN-LAST:event_btnHabilidade1ActionPerformed

    private void btnHabilidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilidade2ActionPerformed
        atacarAdversario(2);
    }//GEN-LAST:event_btnHabilidade2ActionPerformed

    private void btnHabilidade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilidade3ActionPerformed
        atacarAdversario(3);
    }//GEN-LAST:event_btnHabilidade3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisplayAtackFisico;
    private javax.swing.JLabel DisplayAtackMagico;
    private javax.swing.JLabel DisplayDefasa;
    private javax.swing.JLabel DisplayDestreza;
    private javax.swing.JLabel DisplayForca;
    private javax.swing.JLabel DisplayHP;
    private javax.swing.JLabel DisplayInteligencia;
    private javax.swing.JLabel DisplayMP;
    private javax.swing.JLabel DisplayNickXP;
    private javax.swing.JLabel Displaypontosdisponiveis;
    private javax.swing.JButton btnHabilidade1;
    private javax.swing.JButton btnHabilidade2;
    private javax.swing.JButton btnHabilidade3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel necessarionv10;
    private javax.swing.JLabel necessarionv2;
    // End of variables declaration//GEN-END:variables
}

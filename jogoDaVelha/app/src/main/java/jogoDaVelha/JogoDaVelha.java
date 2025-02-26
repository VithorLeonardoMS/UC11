/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogoDaVelha;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha
     */
    
    private String vez = "X";
    private String[][] tabuleiro = new String[3][3];
    private int jogadas = 0;
    
    public JogoDaVelha() {
        initComponents();
    }
    
    public void inicializarJogo() {
        tabuleiro = new String[3][3];  // Reinicia o tabuleiro
        jogadas = 0;  // Reinicia o contador de jogadas
        vez = "X";  // Define que o jogador X começa
        lblMensagem.setText("Vez do Jogador X");  // Atualiza a mensagem
    }
    
    public boolean verificaVitoria() {
        // Inicia o método que verifica se há uma vitória no jogo da velha.

        // Verifica as linhas (horizontalmente)
        for (int i = 0; i < 3; i++) {
            // Verifica se as três casas da linha i são iguais (não nulas e iguais entre si)
            if (tabuleiro[i][0] != null && tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][0].equals(tabuleiro[i][2]))
                // Se as três casas da linha forem iguais, retorna 'true' indicando que houve vitória
                return true;
            
        // Verifica as colunas (verticalmente)
            // Verifica se as três casas da coluna i são iguais (não nulas e iguais entre si)
            if (tabuleiro[0][i] != null && tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[0][i].equals(tabuleiro[2][i]))
                // Se as três casas da coluna forem iguais, retorna 'true' indicando que houve vitória
                return true;
        }
        

        // Verifica a diagonal principal (do canto superior esquerdo para o canto inferior direito)
        if (tabuleiro[0][0] != null && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])){
            // Se as casas da diagonal principal forem iguais, retorna 'true' indicando vitória
            return true;
        }
        // Verifica a diagonal secundária (do canto superior direito para o canto inferior esquerdo)
        if (tabuleiro[0][2] != null && tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])){
            // Se as casas da diagonal secundária forem iguais, retorna 'true' indicando vitória
            return true;
        }
        // Se nenhuma das condições anteriores for verdadeira, retorna 'false', indicando que não houve vitória
        return false;
    }
    
    public String[][] getTabuleiro(){return tabuleiro;}
    public String getVez(){return vez;}
    public int getJogadas(){return jogadas;}
    public int getTurno(){return jogadas;}
    public JButton getBotao(String nomeDoBotao){
        return switch (nomeDoBotao) {
            case "gridA1" -> gridA1;
            case "gridA2" -> gridA2;
            case "gridA3" -> gridA3;
            case "gridB1" -> gridB1;
            case "gridB2" -> gridB2;
            case "gridB3" -> gridB3;
            case "gridC1" -> gridC1;
            case "gridC2" -> gridC2;
            case "gridC3" -> gridC3;
            default -> null;
        };
            
        
    }
    
    public void reiniciarJogo() {
        // Limpa o tabuleiro e a interface
        for (Component c : getContentPane().getComponents()) {
            if (c instanceof JButton && !((JButton) c).getText().equals("REINICIAR")) {
                ((JButton) c).setText("");  // Limpa o texto dos botões
                ((JButton) c).setEnabled(true);  // Habilita os botões
            }
        }
        lblMensagem.setText("Vez do Jogador X");  // Exibe a mensagem
        inicializarJogo();  // Reinicia o jogo
    }
    
    public void marcarJogada(JButton botao, int linha, int coluna) {
        // Marca a jogada no botão e no tabuleiro
        if (tabuleiro[linha][coluna] == null) {
            tabuleiro[linha][coluna] = vez;
            botao.setText(vez); // Marca o botão com "X" ou "O"
            jogadas++; // Aumenta o contador de jogadas

            // Verifica se alguém venceu
            if (verificaVitoria()) {
                JOptionPane.showMessageDialog(this, "Jogador " + vez + " venceu!");
                reiniciarJogo();
            } else if (jogadas == 9) {
                JOptionPane.showMessageDialog(this, "Empate!");
                reiniciarJogo();
            } else {
                // Troca a vez entre os jogadores
               vez = vez.equals("X") ? "O" : "X";
                
               
                
                lblMensagem.setText("Vez do Jogador " + vez);
            }
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridC1 = new javax.swing.JButton();
        gridA1 = new javax.swing.JButton();
        gridB1 = new javax.swing.JButton();
        gridC2 = new javax.swing.JButton();
        gridA2 = new javax.swing.JButton();
        gridB2 = new javax.swing.JButton();
        gridC3 = new javax.swing.JButton();
        gridA3 = new javax.swing.JButton();
        gridB3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gridC1.setPreferredSize(new java.awt.Dimension(50, 50));
        gridC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridC1ActionPerformed(evt);
            }
        });

        gridA1.setPreferredSize(new java.awt.Dimension(50, 50));
        gridA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridA1ActionPerformed(evt);
            }
        });

        gridB1.setPreferredSize(new java.awt.Dimension(50, 50));
        gridB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridB1ActionPerformed(evt);
            }
        });

        gridC2.setPreferredSize(new java.awt.Dimension(50, 50));
        gridC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridC2ActionPerformed(evt);
            }
        });

        gridA2.setPreferredSize(new java.awt.Dimension(50, 50));
        gridA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridA2ActionPerformed(evt);
            }
        });

        gridB2.setPreferredSize(new java.awt.Dimension(50, 50));
        gridB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridB2ActionPerformed(evt);
            }
        });

        gridC3.setPreferredSize(new java.awt.Dimension(50, 50));
        gridC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridC3ActionPerformed(evt);
            }
        });

        gridA3.setPreferredSize(new java.awt.Dimension(50, 50));
        gridA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridA3ActionPerformed(evt);
            }
        });

        gridB3.setPreferredSize(new java.awt.Dimension(50, 50));
        gridB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridB3ActionPerformed(evt);
            }
        });

        jButton1.setText("REINICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMensagem.setText("Vez do Jogador O");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensagem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gridA3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridB3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridC3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gridA2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridB2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridC2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gridA1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridB1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridC1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridC1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridB1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridA1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridC2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridB2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridA2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridC3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridB3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridA3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gridA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridA1ActionPerformed
        marcarJogada(gridA1,0,0);
    }//GEN-LAST:event_gridA1ActionPerformed

    private void gridB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridB1ActionPerformed
        marcarJogada(gridB1,0,1);
    }//GEN-LAST:event_gridB1ActionPerformed

    private void gridC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridC1ActionPerformed
        marcarJogada(gridC1,0,2);
    }//GEN-LAST:event_gridC1ActionPerformed

    private void gridA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridA2ActionPerformed
        marcarJogada(gridA2,1,0);
    }//GEN-LAST:event_gridA2ActionPerformed

    private void gridB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridB2ActionPerformed
        marcarJogada(gridB2,1,1);
    }//GEN-LAST:event_gridB2ActionPerformed

    private void gridC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridC2ActionPerformed
        marcarJogada(gridC2,1,2);
    }//GEN-LAST:event_gridC2ActionPerformed

    private void gridA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridA3ActionPerformed
        marcarJogada(gridA3,2,0);
    }//GEN-LAST:event_gridA3ActionPerformed

    private void gridB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridB3ActionPerformed
        marcarJogada(gridB3,2,1);
    }//GEN-LAST:event_gridB3ActionPerformed

    private void gridC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridC3ActionPerformed
        marcarJogada(gridC3,2,2);
    }//GEN-LAST:event_gridC3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reiniciarJogo();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gridA1;
    private javax.swing.JButton gridA2;
    private javax.swing.JButton gridA3;
    private javax.swing.JButton gridB1;
    private javax.swing.JButton gridB2;
    private javax.swing.JButton gridB3;
    private javax.swing.JButton gridC1;
    private javax.swing.JButton gridC2;
    private javax.swing.JButton gridC3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

import javax.swing.JOptionPane;
import lib.jdb.jdbquery.JDBQuery;
import principal.FrmLogin;

/**
 *
 * @author paulo
 */
public class iFrm_rep_caixas extends javax.swing.JInternalFrame {
    private JDBQuery qryCaixas;
    /**
     * Creates new form iFrm_rep_caixas
     */
    public iFrm_rep_caixas() {
        qryCaixas = new JDBQuery();
        qryCaixas.setJDBConnection(principal.Principal.conexao.getConexao());
        qryCaixas.setConcurUpdatable(false);
        qryCaixas.setSQL("SELECT id, descricao, tipo FROM caixas");
        
        initComponents();
        
        cbxCaixa.setJDBListQuery(qryCaixas);
        cbxCaixa.setInvisibleFields("tipo");
        qryCaixas.execQuery();
        
        cbxCaixa.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDados = new javax.swing.JPanel();
        btnCancelar = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        pnDatas = new javax.swing.JPanel();
        cbxCaixa = new lib.jdb.control.jdblistcombobox.JDBListComboBox();
        lblInc2 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório de caixa");

        pnDados.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return2.png"))); // NOI18N
        btnCancelar.setFont(principal.FrmLogin.fontePadrao);
        btnCancelar.setText("Limpar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnDatas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        lblInc2.setFont(principal.FrmLogin.fontePadrao);
        lblInc2.setText("Código de caixa:");

        javax.swing.GroupLayout pnDatasLayout = new javax.swing.GroupLayout(pnDatas);
        pnDatas.setLayout(pnDatasLayout);
        pnDatasLayout.setHorizontalGroup(
            pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInc2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnDatasLayout.setVerticalGroup(
            pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_search.png"))); // NOI18N
        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnDatas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnDadosLayout.createSequentialGroup()
                        .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        qryCaixas.execQuery();
        cbxCaixa.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        if(cbxCaixa.getSelectedIndex() != 0){
        
            if(qryCaixas.getCurrentFieldValueAsBoolean("tipo") &&
                    FrmLogin.usuario.verificarPermissao(this, "caixaCofre", 0)){
                
                String id_caixa = qryCaixas.getCurrentFieldValueAsString("id");

                relatorio.Relatorios.rep_caixas(id_caixa);

                // registro de log
                FrmLogin.log.gravar(
                    FrmLogin.usuario.getNomeUsuario(),
                    "iFrm_rep_caixas",
                    id_caixa,
                    "emitido relatório");
            }else if(!qryCaixas.getCurrentFieldValueAsBoolean("tipo")){
                String id_caixa = qryCaixas.getCurrentFieldValueAsString("id");

                relatorio.Relatorios.rep_caixas(id_caixa);

                // registro de log
                FrmLogin.log.gravar(
                    FrmLogin.usuario.getNomeUsuario(),
                    "iFrm_rep_caixas",
                    id_caixa,
                    "emitido relatório");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um caixa", "Atenção", 
                    JOptionPane.INFORMATION_MESSAGE);
            cbxCaixa.requestFocus();
        }
    }//GEN-LAST:event_btnGerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btnCancelar;
    private javax.swing.JButton btnGerar;
    private lib.jdb.control.jdblistcombobox.JDBListComboBox cbxCaixa;
    private javax.swing.JLabel lblInc2;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnDatas;
    // End of variables declaration//GEN-END:variables
}
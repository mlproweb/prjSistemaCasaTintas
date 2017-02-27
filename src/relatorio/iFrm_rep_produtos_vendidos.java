/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

import java.util.LinkedHashMap;
import javax.swing.JOptionPane;
import lib.jdb.jdbquery.JDBQuery;
import principal.FrmLogin;

/**
 *
 * @author paulo
 */
public class iFrm_rep_produtos_vendidos extends javax.swing.JInternalFrame {
    private JDBQuery qryProduto;
    private String idProduto;
    /**
     * Creates new form iFrm_rep_produtos_vendidos
     */
    public iFrm_rep_produtos_vendidos() {
        qryProduto = new JDBQuery();
        qryProduto.setJDBConnection(principal.Principal.conexao.getConexao());
        qryProduto.setConcurUpdatable(false);
        
        idProduto = "";
        
        initComponents();
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
        lblInc = new javax.swing.JLabel();
        lblMod = new javax.swing.JLabel();
        calDataInicio = new lib.jdb.control.jdbcalendar.JDBCalendar();
        calDataFim = new lib.jdb.control.jdbcalendar.JDBCalendar();
        txtProduto = new javax.swing.JTextField();
        lblInc1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        sprQuantidade = new javax.swing.JSpinner();
        cbxOrdenacao = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório de produtos vendidos");

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

        lblInc.setFont(principal.FrmLogin.fontePadrao);
        lblInc.setText("Data Inicio:");

        lblMod.setFont(principal.FrmLogin.fontePadrao);
        lblMod.setText("Data Final:");

        calDataInicio.setDateFormat("dd/MM/yyyy");
        calDataInicio.setTextEditable(false);
        calDataInicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                calDataInicioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        calDataFim.setDateFormat("dd/MM/yyyy");
        calDataFim.setTextEditable(false);
        calDataFim.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                calDataFimAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtProduto.setFocusable(false);

        lblInc1.setFont(principal.FrmLogin.fontePadrao);
        lblInc1.setText("Produto:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        sprQuantidade.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        cbxOrdenacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mais vendido", "Menos vendido" }));
        cbxOrdenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdenacaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade:");

        jLabel2.setText("Ordenação:");

        javax.swing.GroupLayout pnDatasLayout = new javax.swing.GroupLayout(pnDatas);
        pnDatas.setLayout(pnDatasLayout);
        pnDatasLayout.setHorizontalGroup(
            pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatasLayout.createSequentialGroup()
                        .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInc1)
                            .addGroup(pnDatasLayout.createSequentialGroup()
                                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblInc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMod)
                                    .addComponent(calDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatasLayout.createSequentialGroup()
                        .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDatasLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxOrdenacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, 234, Short.MAX_VALUE)
                                    .addComponent(sprQuantidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pnDatasLayout.createSequentialGroup()
                                .addComponent(txtProduto)
                                .addGap(26, 26, 26)))
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTodos)))
                .addContainerGap())
        );
        pnDatasLayout.setVerticalGroup(
            pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInc)
                    .addComponent(lblMod))
                .addGap(7, 7, 7)
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblInc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sprQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        calDataInicio.setText("");
        calDataFim.setText("");

        idProduto = "";
        txtProduto.setText(""); 
        
        sprQuantidade.getModel().setValue(1);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void calDataInicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_calDataInicioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_calDataInicioAncestorAdded

    private void calDataFimAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_calDataFimAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_calDataFimAncestorAdded

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // campos para combobox sendo texto visual e o nome campo do banco referente.
        LinkedHashMap<String, String> combo = new LinkedHashMap<>();
        combo.put("Nome", "nome");
        combo.put("Código", "id");

        // titulos para as colunas da tabela, sendo texto visual e nome campo do banco referente.
        LinkedHashMap<String, String> titulo = new LinkedHashMap<>();
        titulo.put("NOME", "nome");
        titulo.put("CÓDIGO", "id");

        // campos que deseja deixar invisível, pode-se omitir.
        String[] invisivel = null;

        // tamanho das colunas visíveis, pode-se omitir.
        //        int[] tamanho = {200, 400};

        pesquisa.iFrmPesquisa produto;
        produto = new pesquisa.iFrmPesquisa(this,
            "Pesquisa de Produtos",
            principal.Principal.conexao.getConexao(),
            qryProduto,
            "id",
            combo,
            titulo,
            "SELECT id, nome FROM produtos",
            invisivel,
            null);

        principal.FrmPrincipal.Desktop.add(produto);
        produto.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        txtProduto.setText("");
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        if(calDataInicio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe a data inicial");
        }else if(calDataFim.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe a data final");
        }else{
            String where, ordenacao, quantidade;

            where = String.format(
                "WHERE (data BETWEEN '%s' AND '%s') ",
                calDataInicio.getDateAsSQLDate(),
                calDataFim.getDateAsSQLDate());
            ordenacao = cbxOrdenacao.getSelectedIndex() == 0?"desc":"asc";
            quantidade = String.valueOf(sprQuantidade.getValue()).equals("0")?"1":
                    String.valueOf(sprQuantidade.getValue());

            if(!txtProduto.getText().isEmpty()){
                where += String.format(
                    "AND id_produto = '%s' ",
                    idProduto);
            }

            relatorio.Relatorios.rep_produtos_vendidos(
                calDataInicio.getDateAsSQLDate(),
                calDataFim.getDateAsSQLDate(),
                where,
                ordenacao,
                quantidade);

            // registro de log
            FrmLogin.log.gravar(
                FrmLogin.usuario.getNomeUsuario(),
                "iFrm_rep_produtos_vendidos",
                idProduto,
                "emitido relatório");
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void cbxOrdenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdenacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOrdenacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnTodos;
    private lib.jdb.control.jdbcalendar.JDBCalendar calDataFim;
    private lib.jdb.control.jdbcalendar.JDBCalendar calDataInicio;
    private javax.swing.JComboBox cbxOrdenacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblInc;
    private javax.swing.JLabel lblInc1;
    private javax.swing.JLabel lblMod;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnDatas;
    private javax.swing.JSpinner sprQuantidade;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables

    public void atribuirCampos(){
        idProduto = qryProduto.getCurrentFieldValueAsString("id");
        txtProduto.setText(qryProduto.getCurrentFieldValueAsString("nome"));
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

import javax.swing.JOptionPane;
import lib.jdb.jdbquery.JDBQuery;
import principal.FrmLogin;

/**
 *
 * @author patri
 */
public class iFrmPesCaixa extends javax.swing.JInternalFrame {
    JDBQuery qryPesquisa, qryOriginal;
    financeiro.iFrmCaixa formOriginal;
    String sqlOriginal;
    /**
     * Creates new form iFrmPesquisa
     */
    public iFrmPesCaixa(financeiro.iFrmCaixa formOriginal, JDBQuery qryOriginal){
        this.formOriginal = formOriginal;
        this.qryOriginal = qryOriginal;
        
//        formOriginal.setVisible(false);
        
        qryPesquisa = new JDBQuery();
        qryPesquisa.setJDBConnection(qryOriginal.getJDBConnection());
        qryPesquisa.setLanguage(qryOriginal.getLanguage());
        qryPesquisa.setTimeStampFormat(qryOriginal.getTimeStampFormat());
        qryPesquisa.setDecimalFormat(qryOriginal.getDecimalFormat());
        qryPesquisa.setConcurUpdatable(false);
        
        initComponents();
        
        tbPesCaixa.setJDBQuery(qryPesquisa);
        tbPesCaixa.setEditable(false);
        tbPesCaixa.setInvisibleFields("tipo saldo_final data_inclusao data_modificacao");
        tbPesCaixa.setFieldsTitle("id", "CÓD.");
        tbPesCaixa.setFieldsTitle("descricao", "DESCRIÇÃO");
        tbPesCaixa.setFieldsTitle("desc_tipo", "TIPO");
        tbPesCaixa.setFieldsTitle("data_abertura", "ABERTURA");
        tbPesCaixa.setFieldsTitle("data_fechamento", "FECHAMENTO");
        
        calData.setDateFormat("dd/MM/yyyy");
        
        lblContador.setjDBQuery(qryPesquisa);
        
        sqlOriginal = 
                "SELECT "
                    + "id, "
                    + "descricao, "
                    + "tipo, "
                    + "desc_tipo, "
                    + "data_abertura, "
                    + "data_fechamento, "
                    + "saldo_final, "
                    + "data_inclusao, "
                    + "data_modificacao "
                + "FROM vw_caixa_tipo";
        
        pesquisar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        scrlPesCaixa = new javax.swing.JScrollPane();
        tbPesCaixa = new lib.jdb.control.jdbtable.JDBTable();
        lblQuantidadeItens = new javax.swing.JLabel();
        lblContador = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        cbxFechada = new lib.jdb.control.jdbcheckbox.JDBCheckBox();
        lblData = new javax.swing.JLabel();
        pnCodigo = new javax.swing.JPanel();
        txtID = new lib.jdb.control.jdbtextfield.JDBTextField();
        calData = new lib.jdb.control.jdbcalendar.JDBCalendar();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisa de Caixa");
        setPreferredSize(new java.awt.Dimension(600, 418));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        Painel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        btnPesquisa.setFont(principal.FrmLogin.fontePadrao);
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/look.png"))); // NOI18N
        btnPesquisa.setMnemonic('p');
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.setNextFocusableComponent(txtID);
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        scrlPesCaixa.setFont(principal.FrmLogin.fontePadrao);

        tbPesCaixa.setFont(principal.FrmLogin.fontePadrao);
        tbPesCaixa.setToolTipText("Duplo clique para selecionar");
        tbPesCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesCaixaMouseClicked(evt);
            }
        });
        scrlPesCaixa.setViewportView(tbPesCaixa);

        lblQuantidadeItens.setFont(principal.FrmLogin.fontePadrao);
        lblQuantidadeItens.setText("Quantidade de itens:");

        lblContador.setFont(principal.FrmLogin.fontePadrao);
        lblContador.setText("jDBLabelCount1");

        cbxFechada.setFont(principal.FrmLogin.fontePadrao);
        cbxFechada.setNextFocusableComponent(btnPesquisa);
        cbxFechada.setText("Fechada");

        lblData.setText("Data abertura:");

        pnCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)), "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtID.setFont(principal.FrmLogin.fontePadrao);

        javax.swing.GroupLayout pnCodigoLayout = new javax.swing.GroupLayout(pnCodigo);
        pnCodigo.setLayout(pnCodigoLayout);
        pnCodigoLayout.setHorizontalGroup(
            pnCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnCodigoLayout.setVerticalGroup(
            pnCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCodigoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        calData.setTextEditable(false);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlPesCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblQuantidadeItens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(pnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(calData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cbxFechada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisa)))
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPesquisa)
                        .addGroup(PainelLayout.createSequentialGroup()
                            .addComponent(lblData)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxFechada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlPesCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeItens)
                    .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void tbPesCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesCaixaMouseClicked
        if(evt.getClickCount() == 2){
            if(qryPesquisa.getCurrentFieldValueAsBoolean("tipo")){
                if(FrmLogin.usuario.verificarPermissao(this, "caixaCofre", 0)){
                    carregarSelecionado();
                }
            }else{
                carregarSelecionado();
            }
        }
    }//GEN-LAST:event_tbPesCaixaMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
//        formOriginal.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnPesquisa;
    private lib.jdb.control.jdbcalendar.JDBCalendar calData;
    private lib.jdb.control.jdbcheckbox.JDBCheckBox cbxFechada;
    private lib.jdb.control.jdblabelcount.JDBLabelCount lblContador;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblQuantidadeItens;
    private javax.swing.JPanel pnCodigo;
    private javax.swing.JScrollPane scrlPesCaixa;
    private lib.jdb.control.jdbtable.JDBTable tbPesCaixa;
    private lib.jdb.control.jdbtextfield.JDBTextField txtID;
    // End of variables declaration//GEN-END:variables

    private void pesquisar(){
        String complementos, ordenacao = "";
        
        if(cbxFechada.isSelected()){
            complementos = " WHERE data_fechamento IS NOT NULL";
        }else{
            complementos = " WHERE data_fechamento IS NULL";
        }
        
        if(!txtID.getText().isEmpty()){
            complementos += " AND id = " + txtID.getText();
            ordenacao = " ORDER BY id";
        }
        
        if(!calData.getText().isEmpty()){
            complementos += String.format(
                    " AND data_abertura LIKE '%%%s%%'", 
                    calData.getDateAsSQLDate());
            ordenacao = " ORDER BY data_abertura";
        }
        
        qryPesquisa.setSQL(sqlOriginal + complementos + ordenacao);
        
        qryPesquisa.execQuery();        
    }
    
    private void carregarSelecionado(){
        
        qryOriginal.setSQL(sqlOriginal 
                + " WHERE id = " + qryPesquisa.getCurrentFieldValueAsInteger("id"));
        qryOriginal.execQuery();
        
        formOriginal.atribuirCampor();
        
        doDefaultCloseAction();
    }
    
}

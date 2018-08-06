/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import fachada.Fachada;
import java.util.ArrayList;
import javax.swing.JTable;
import model.Avaliacao;
import model.ControleFinanceiro;
import model.ModeloTabela;

/**
 *
 * @author Insinuante
 */
public class FincanceiroJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AlunosJFrame
     */
    public FincanceiroJFrame() {
        initComponents();
        ArrayList<ControleFinanceiro> financeiro = Fachada.getInstance().getAllControleFinanceiro();
        carregarTabelar(financeiro);
        jFormattedTextFieldSaldo.setText(calcularSaldo(financeiro)+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jLabeConFinanceiro = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabelFiltrar = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        jFormattedTextFieldPeriodo2 = new javax.swing.JFormattedTextField();
        jLabelHa = new javax.swing.JLabel();
        jFormattedTextFieldPeriodo3 = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCaixa = new javax.swing.JTable();
        jLabelSaldo = new javax.swing.JLabel();
        jFormattedTextFieldSaldo = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelFiltrar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Fincanceiro");
        setExtendedState(6);

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeConFinanceiro.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeConFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        jLabeConFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fin_white.png"))); // NOI18N
        jLabeConFinanceiro.setText(" Controle Financeiro ");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabeConFinanceiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabeConFinanceiro)
                .addGap(28, 28, 28))
        );

        jButtonNovo.setBackground(new java.awt.Color(45, 118, 232));
        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Novo lançamento de conta");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(45, 118, 232));
        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir lançamento");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("Editar lançamento");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabelFiltrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFiltrar.setForeground(new java.awt.Color(45, 118, 232));
        jLabelFiltrar.setText("Filtrar");

        jLabelPeriodo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPeriodo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelPeriodo.setText("Período");

        try {
            jFormattedTextFieldPeriodo2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPeriodo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldPeriodo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPeriodo2ActionPerformed(evt);
            }
        });

        jLabelHa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelHa.setForeground(new java.awt.Color(45, 118, 232));
        jLabelHa.setText("a");

        try {
            jFormattedTextFieldPeriodo3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPeriodo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldPeriodo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPeriodo3ActionPerformed(evt);
            }
        });

        jTableCaixa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Histórico", "Descrição", "Valor", "Forma "
            }
        ));
        jTableCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCaixaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCaixa);

        jLabelSaldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSaldo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelSaldo.setText("Saldo:");

        jFormattedTextFieldSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextFieldSaldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabelFiltrar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFiltrar1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelFiltrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Bill_50px.png"))); // NOI18N
        jLabelFiltrar1.setText("Cadastrar Histórico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFiltrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelFiltrar1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackLayout.createSequentialGroup()
                                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFiltrar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackLayout.createSequentialGroup()
                                        .addComponent(jLabelPeriodo)
                                        .addGap(36, 36, 36)
                                        .addComponent(jFormattedTextFieldPeriodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelHa, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFormattedTextFieldPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE))
                            .addGroup(jPanelBackLayout.createSequentialGroup()
                                .addComponent(jLabelSaldo)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPeriodo)
                            .addComponent(jFormattedTextFieldPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHa)
                            .addComponent(jFormattedTextFieldPeriodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaldo)
                    .addComponent(jFormattedTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1063, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        if(Fachada.getFuncionarioLogado().isControleCaixaCadastrar())
            new FinanceiroLancarFaturaJFrame().show();
        else
            Mensagem.exibirErro();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(Fachada.getFuncionarioLogado().isControleCaixaExcluir()){
            int i = Integer.parseInt(jTableCaixa.getValueAt(jTableCaixa.getSelectedRow(), 0)+"");
            ControleFinanceiro c = Fachada.getInstance().getByIdControleFinanceiro(i);
            Fachada.getInstance().excluirControleFinanceiro(c);   
        }else
            Mensagem.exibirErro();

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if(Fachada.getFuncionarioLogado().isControleCaixaEditar()){
            FinanceiroLancarFaturaJFrame tela = new FinanceiroLancarFaturaJFrame();
            tela.set(Fachada.getInstance().getByIdControleFinanceiro(Integer.parseInt(
                jTableCaixa.getValueAt(jTableCaixa.getSelectedRow(), 0)+"")));
            tela.show();           
        }else
            Mensagem.exibirErro();

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jFormattedTextFieldPeriodo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPeriodo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPeriodo2ActionPerformed

    private void jFormattedTextFieldPeriodo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPeriodo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPeriodo3ActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        HomeJFrame.setColor(jPanel1);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        HomeJFrame.resetColor(jPanel1);
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        this.dispose();
        new HistoricoHomeJFrame().show();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jTableCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCaixaMouseClicked
        if(evt.getClickCount()==2){
            FinanceiroLancarFaturaJFrame tela = new FinanceiroLancarFaturaJFrame();
            tela.set(Fachada.getInstance().getByIdControleFinanceiro(Integer.parseInt(
                jTableCaixa.getValueAt(jTableCaixa.getSelectedRow(), 0)+"")));
            tela.show();
        }
    }//GEN-LAST:event_jTableCaixaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JFormattedTextField jFormattedTextFieldPeriodo2;
    private javax.swing.JFormattedTextField jFormattedTextFieldPeriodo3;
    private javax.swing.JFormattedTextField jFormattedTextFieldSaldo;
    private javax.swing.JLabel jLabeConFinanceiro;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JLabel jLabelFiltrar1;
    private javax.swing.JLabel jLabelHa;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCaixa;
    // End of variables declaration//GEN-END:variables

    private void carregarTabelar(ArrayList<ControleFinanceiro> financeiro){
        String [] colunas = {"ID","Data","Historico","Descrição","Valor"};
        ArrayList<Object[]> dados = new ArrayList<>();
        for(ControleFinanceiro c : financeiro)
            dados.add(new Object[]{c.getId(),c.getData(),c.getConta().getDescricao(),
                      c.getDescricao(),c.getValor()});
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableCaixa.setModel(modelo);
        
        jTableCaixa.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableCaixa.getColumnModel().getColumn(0).setResizable(false);
        jTableCaixa.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTableCaixa.getColumnModel().getColumn(1).setResizable(false);
        jTableCaixa.getColumnModel().getColumn(2).setPreferredWidth(290);
        jTableCaixa.getColumnModel().getColumn(2).setResizable(false);
        jTableCaixa.getColumnModel().getColumn(3).setPreferredWidth(248);
        jTableCaixa.getColumnModel().getColumn(3).setResizable(false);
        jTableCaixa.getColumnModel().getColumn(4).setPreferredWidth(135);
        jTableCaixa.getColumnModel().getColumn(4).setResizable(false);
        
        jTableCaixa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);    
    }
    
    private float calcularSaldo(ArrayList<ControleFinanceiro> f){
        float saldo=0;
        
        for (ControleFinanceiro c : f) {
            if(c.getConta().getTipo().equals("Débito"))
                saldo-=c.getValor();
            else
                saldo+=c.getValor();
        }
        return saldo;
    }
    
}

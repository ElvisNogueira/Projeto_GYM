/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.Util;
import dao.AlunoDao;
import fachada.Fachada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import model.Aluno;
import model.ModeloTabela;

/**
 *
 * @author Insinuante
 */
public class AlunosHomeJFrame extends javax.swing.JFrame {
    Fachada fachada;
    public AlunosHomeJFrame() {
        fachada = Fachada.getInstance();
        initComponents();
        carregarTabela(fachada.getAllAluno());            
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
        jLabeAlunos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jLabelProcurar = new javax.swing.JLabel();
        jTextFieldProsucar = new javax.swing.JTextField();
        jLabelIconPesquisar = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos");
        setExtendedState(6);

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeAlunos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jLabeAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_52px_1.png"))); // NOI18N
        jLabeAlunos.setText(" Alunos ");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabeAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabeAlunos)
                .addGap(28, 28, 28))
        );

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ));
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        jButtonEditar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("Editar aluno");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabelProcurar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelProcurar.setForeground(new java.awt.Color(45, 118, 232));
        jLabelProcurar.setText("Procurar");

        jTextFieldProsucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProsucarActionPerformed(evt);
            }
        });
        jTextFieldProsucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProsucarKeyReleased(evt);
            }
        });

        jLabelIconPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Search_20px_2.png"))); // NOI18N
        jLabelIconPesquisar.setToolTipText("Pesquisar");
        jLabelIconPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconPesquisarMouseClicked(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setToolTipText("Cadastrar avaliação fisica");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProcurar)
                            .addComponent(jTextFieldProsucar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelIconPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabelProcurar))
                    .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIconPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldProsucar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(716, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        AlunosCadastroJFrame tela = new AlunosCadastroJFrame();
        tela.setAluno(
        fachada.getByIdAluno(Integer.parseInt(jTableAlunos.getValueAt
            (jTableAlunos.getSelectedRow(), 0)+"")));
            tela.show();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldProsucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProsucarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProsucarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        this.dispose();
        new AlunosCadastroJFrame().show();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jLabelIconPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconPesquisarMouseClicked
        String busca = this.jTextFieldProsucar.getText().toLowerCase();

        if (busca.trim().length() == 0) {
            Mensagem.exibirMensagem("Digite uma busca");
            return;
        }
        ArrayList<Aluno> alunos = Fachada.getInstance().getAlunosPosBusca(busca);

        carregarTabela(alunos);

    }//GEN-LAST:event_jLabelIconPesquisarMouseClicked

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        if(evt.getClickCount()==2){
            
            AlunosCadastroJFrame tela = new AlunosCadastroJFrame();
            Util.bloquearCampos(tela.getjPanelCadastro());
            tela.setAluno(
            fachada.getByIdAluno(Integer.parseInt(jTableAlunos.getValueAt
            (jTableAlunos.getSelectedRow(), 0)+"")));
            tela.show();
        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void jTextFieldProsucarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProsucarKeyReleased
        String busca = this.jTextFieldProsucar.getText().toLowerCase();
        ArrayList<Aluno> alunos = Fachada.getInstance().getAlunosPosBusca(busca);

        carregarTabela(alunos);
    }//GEN-LAST:event_jTextFieldProsucarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabeAlunos;
    private javax.swing.JLabel jLabelIconPesquisar;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTextField jTextFieldProsucar;
    // End of variables declaration//GEN-END:variables

    private void carregarTabela(ArrayList<Aluno> alunos) {
        String[] colunas = new String[]{"ID","NOME"};
        ArrayList<Object[]> dados = new ArrayList<>();
        
        for(Aluno a:alunos){
            dados.add(new Object[]{a.getId(),a.getNome()});
        }
        
        ModeloTabela modeloTabela =  new ModeloTabela(dados, colunas);   
        jTableAlunos.setModel(modeloTabela);      
        jTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableAlunos.getColumnModel().getColumn(0).setResizable(false);
        jTableAlunos.getColumnModel().getColumn(1).setPreferredWidth(410);
        jTableAlunos.getColumnModel().getColumn(1).setResizable(false);
        jTableAlunos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    
}

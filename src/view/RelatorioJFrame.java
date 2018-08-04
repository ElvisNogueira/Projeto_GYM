/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Williany
 */
public class RelatorioJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AlunosJFrame
     */
    public RelatorioJFrame() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanelBack = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jLabeFuncionario = new javax.swing.JLabel();
        jPanelAlunosDeb = new javax.swing.JPanel();
        jLabelAlunos = new javax.swing.JLabel();
        jLabelIconAlunos = new javax.swing.JLabel();
        jPanelFuncionarios = new javax.swing.JPanel();
        jLabellFuncionarios = new javax.swing.JLabel();
        jLabelIconlFuncionarios = new javax.swing.JLabel();
        jLabellFuncionarios1 = new javax.swing.JLabel();
        jPanelFinanceiro = new javax.swing.JPanel();
        jLabelFinanceiro = new javax.swing.JLabel();
        jLabelIconFinanceiro = new javax.swing.JLabel();
        jPanelAlunosListagem = new javax.swing.JPanel();
        jLabelAlunos1 = new javax.swing.JLabel();
        jLabelIconAlunos1 = new javax.swing.JLabel();
        jPanelAlunosCredito = new javax.swing.JPanel();
        jLabelAlunos2 = new javax.swing.JLabel();
        jLabelIconAlunos2 = new javax.swing.JLabel();
        jPanelAlunosPlano = new javax.swing.JPanel();
        jLabelAlunos3 = new javax.swing.JLabel();
        jLabelIconAlunos3 = new javax.swing.JLabel();
        jLabelAlunos4 = new javax.swing.JLabel();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");
        setExtendedState(6);

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeFuncionario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabeFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list_white.png"))); // NOI18N
        jLabeFuncionario.setText(" Relatórios");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabeFuncionario)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabeFuncionario)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanelAlunosDeb.setToolTipText("Cadastro de alunos");
        jPanelAlunosDeb.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelAlunosDeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAlunosDebMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAlunosDebMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAlunosDebMousePressed(evt);
            }
        });

        jLabelAlunos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAlunos.setForeground(new java.awt.Color(45, 118, 232));
        jLabelAlunos.setText("Alunos em débito");

        jLabelIconAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAlunosDebLayout = new javax.swing.GroupLayout(jPanelAlunosDeb);
        jPanelAlunosDeb.setLayout(jPanelAlunosDebLayout);
        jPanelAlunosDebLayout.setHorizontalGroup(
            jPanelAlunosDebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosDebLayout.createSequentialGroup()
                .addGroup(jPanelAlunosDebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlunosDebLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelIconAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAlunosDebLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelAlunos)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelAlunosDebLayout.setVerticalGroup(
            jPanelAlunosDebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosDebLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFuncionarios.setToolTipText("Cadastro de funcionários");
        jPanelFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelFuncionariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelFuncionariosMousePressed(evt);
            }
        });

        jLabellFuncionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabellFuncionarios.setForeground(new java.awt.Color(45, 118, 232));
        jLabellFuncionarios.setText("funcionários");

        jLabelIconlFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/crachá-50.png"))); // NOI18N

        jLabellFuncionarios1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabellFuncionarios1.setForeground(new java.awt.Color(45, 118, 232));
        jLabellFuncionarios1.setText("Listagem de");

        javax.swing.GroupLayout jPanelFuncionariosLayout = new javax.swing.GroupLayout(jPanelFuncionarios);
        jPanelFuncionarios.setLayout(jPanelFuncionariosLayout);
        jPanelFuncionariosLayout.setHorizontalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabellFuncionarios1)
                    .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                            .addComponent(jLabellFuncionarios)
                            .addGap(29, 29, 29))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                            .addComponent(jLabelIconlFuncionarios)
                            .addGap(43, 43, 43)))))
        );
        jPanelFuncionariosLayout.setVerticalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelIconlFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabellFuncionarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabellFuncionarios)
                .addContainerGap())
        );

        jPanelFinanceiro.setToolTipText("Financeiro");
        jPanelFinanceiro.setPreferredSize(new java.awt.Dimension(140, 90));
        jPanelFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelFinanceiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelFinanceiroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelFinanceiroMousePressed(evt);
            }
        });

        jLabelFinanceiro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFinanceiro.setForeground(new java.awt.Color(45, 118, 232));
        jLabelFinanceiro.setText("Fluxo de caixa");

        jLabelIconFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fin50.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFinanceiroLayout = new javax.swing.GroupLayout(jPanelFinanceiro);
        jPanelFinanceiro.setLayout(jPanelFinanceiroLayout);
        jPanelFinanceiroLayout.setHorizontalGroup(
            jPanelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinanceiroLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFinanceiroLayout.createSequentialGroup()
                        .addComponent(jLabelIconFinanceiro)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFinanceiroLayout.createSequentialGroup()
                        .addComponent(jLabelFinanceiro)
                        .addGap(24, 24, 24))))
        );
        jPanelFinanceiroLayout.setVerticalGroup(
            jPanelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinanceiroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelIconFinanceiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFinanceiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAlunosListagem.setToolTipText("Cadastro de alunos");
        jPanelAlunosListagem.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelAlunosListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAlunosListagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAlunosListagemMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAlunosListagemMousePressed(evt);
            }
        });

        jLabelAlunos1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAlunos1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelAlunos1.setText("Listagem de alunos");

        jLabelIconAlunos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAlunosListagemLayout = new javax.swing.GroupLayout(jPanelAlunosListagem);
        jPanelAlunosListagem.setLayout(jPanelAlunosListagemLayout);
        jPanelAlunosListagemLayout.setHorizontalGroup(
            jPanelAlunosListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosListagemLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanelAlunosListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosListagemLayout.createSequentialGroup()
                        .addComponent(jLabelIconAlunos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosListagemLayout.createSequentialGroup()
                        .addComponent(jLabelAlunos1)
                        .addContainerGap())))
        );
        jPanelAlunosListagemLayout.setVerticalGroup(
            jPanelAlunosListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconAlunos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAlunos1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAlunosCredito.setToolTipText("Cadastro de alunos");
        jPanelAlunosCredito.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelAlunosCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAlunosCreditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAlunosCreditoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAlunosCreditoMousePressed(evt);
            }
        });

        jLabelAlunos2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAlunos2.setForeground(new java.awt.Color(45, 118, 232));
        jLabelAlunos2.setText("Alunos em crédito");

        jLabelIconAlunos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAlunosCreditoLayout = new javax.swing.GroupLayout(jPanelAlunosCredito);
        jPanelAlunosCredito.setLayout(jPanelAlunosCreditoLayout);
        jPanelAlunosCreditoLayout.setHorizontalGroup(
            jPanelAlunosCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosCreditoLayout.createSequentialGroup()
                .addGroup(jPanelAlunosCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlunosCreditoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelIconAlunos2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAlunosCreditoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelAlunos2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelAlunosCreditoLayout.setVerticalGroup(
            jPanelAlunosCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconAlunos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAlunos2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAlunosPlano.setToolTipText("Cadastro de alunos");
        jPanelAlunosPlano.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelAlunosPlano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAlunosPlanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAlunosPlanoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAlunosPlanoMousePressed(evt);
            }
        });

        jLabelAlunos3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAlunos3.setForeground(new java.awt.Color(45, 118, 232));
        jLabelAlunos3.setText("Alunos com plano ");

        jLabelIconAlunos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_52px.png"))); // NOI18N

        jLabelAlunos4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAlunos4.setForeground(new java.awt.Color(45, 118, 232));
        jLabelAlunos4.setText("a vencer");

        javax.swing.GroupLayout jPanelAlunosPlanoLayout = new javax.swing.GroupLayout(jPanelAlunosPlano);
        jPanelAlunosPlano.setLayout(jPanelAlunosPlanoLayout);
        jPanelAlunosPlanoLayout.setHorizontalGroup(
            jPanelAlunosPlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosPlanoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelIconAlunos3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosPlanoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelAlunos4)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosPlanoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAlunos3)
                .addContainerGap())
        );
        jPanelAlunosPlanoLayout.setVerticalGroup(
            jPanelAlunosPlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosPlanoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelIconAlunos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabelAlunos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAlunos4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelAlunosListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAlunosDeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAlunosCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAlunosPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAlunosDeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAlunosPlano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAlunosCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAlunosListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFinanceiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jPanelFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(921, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelAlunosDebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosDebMouseEntered
        HomeJFrame.setColor(jPanelAlunosDeb);
    }//GEN-LAST:event_jPanelAlunosDebMouseEntered

    private void jPanelAlunosDebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosDebMouseExited
        HomeJFrame.resetColor(jPanelAlunosDeb);
    }//GEN-LAST:event_jPanelAlunosDebMouseExited

    private void jPanelAlunosDebMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosDebMousePressed
        new RelatorioAlunoDebitoJFrame().show();
    }//GEN-LAST:event_jPanelAlunosDebMousePressed

    private void jPanelFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionariosMouseEntered
        HomeJFrame.setColor(jPanelFuncionarios);
    }//GEN-LAST:event_jPanelFuncionariosMouseEntered

    private void jPanelFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionariosMouseExited
        HomeJFrame.resetColor(jPanelFuncionarios);
    }//GEN-LAST:event_jPanelFuncionariosMouseExited

    private void jPanelFuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionariosMousePressed
        //new RelatorioFuncionarioListaJFrame().show();
        new RelatoriListaFunJFrame().show();
    }//GEN-LAST:event_jPanelFuncionariosMousePressed

    private void jPanelFinanceiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFinanceiroMouseEntered
        HomeJFrame.setColor(jPanelFinanceiro);
    }//GEN-LAST:event_jPanelFinanceiroMouseEntered

    private void jPanelFinanceiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFinanceiroMouseExited
        HomeJFrame.resetColor(jPanelFinanceiro);
    }//GEN-LAST:event_jPanelFinanceiroMouseExited

    private void jPanelFinanceiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFinanceiroMousePressed
        new RelatorioFluxoCaixaJFrame().show();
    }//GEN-LAST:event_jPanelFinanceiroMousePressed

    private void jPanelAlunosListagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosListagemMouseEntered
        HomeJFrame.setColor(jPanelAlunosListagem);
    }//GEN-LAST:event_jPanelAlunosListagemMouseEntered

    private void jPanelAlunosListagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosListagemMouseExited
        HomeJFrame.resetColor(jPanelAlunosListagem);
    }//GEN-LAST:event_jPanelAlunosListagemMouseExited

    private void jPanelAlunosListagemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosListagemMousePressed
        new RelatorioListaAluJFrame().show();
    }//GEN-LAST:event_jPanelAlunosListagemMousePressed

    private void jPanelAlunosCreditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosCreditoMouseEntered
        HomeJFrame.setColor(jPanelAlunosCredito);
    }//GEN-LAST:event_jPanelAlunosCreditoMouseEntered

    private void jPanelAlunosCreditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosCreditoMouseExited
        HomeJFrame.resetColor(jPanelAlunosCredito);
    }//GEN-LAST:event_jPanelAlunosCreditoMouseExited

    private void jPanelAlunosCreditoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosCreditoMousePressed
        new RelatorioAlunoCreditoJFrame().show();
    }//GEN-LAST:event_jPanelAlunosCreditoMousePressed

    private void jPanelAlunosPlanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosPlanoMouseEntered
        HomeJFrame.setColor(jPanelAlunosPlano);
    }//GEN-LAST:event_jPanelAlunosPlanoMouseEntered

    private void jPanelAlunosPlanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosPlanoMouseExited
        HomeJFrame.resetColor(jPanelAlunosPlano);
    }//GEN-LAST:event_jPanelAlunosPlanoMouseExited

    private void jPanelAlunosPlanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosPlanoMousePressed
        new RelatorioAlunoPlanoVencerJFrame().show();
    }//GEN-LAST:event_jPanelAlunosPlanoMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeFuncionario;
    private javax.swing.JLabel jLabelAlunos;
    private javax.swing.JLabel jLabelAlunos1;
    private javax.swing.JLabel jLabelAlunos2;
    private javax.swing.JLabel jLabelAlunos3;
    private javax.swing.JLabel jLabelAlunos4;
    private javax.swing.JLabel jLabelFinanceiro;
    private javax.swing.JLabel jLabelIconAlunos;
    private javax.swing.JLabel jLabelIconAlunos1;
    private javax.swing.JLabel jLabelIconAlunos2;
    private javax.swing.JLabel jLabelIconAlunos3;
    private javax.swing.JLabel jLabelIconFinanceiro;
    private javax.swing.JLabel jLabelIconlFuncionarios;
    private javax.swing.JLabel jLabellFuncionarios;
    private javax.swing.JLabel jLabellFuncionarios1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanelAlunosCredito;
    private javax.swing.JPanel jPanelAlunosDeb;
    private javax.swing.JPanel jPanelAlunosListagem;
    private javax.swing.JPanel jPanelAlunosPlano;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JPanel jPanelFinanceiro;
    private javax.swing.JPanel jPanelFuncionarios;
    // End of variables declaration//GEN-END:variables
}

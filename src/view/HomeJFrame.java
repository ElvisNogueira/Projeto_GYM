/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.Projeto_GYM;
import controller.LoginControlador;
import fachada.Fachada;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Insinuante
 */
public class HomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrameHome
     */
    public HomeJFrame() {
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

        jPanelBackground = new javax.swing.JPanel();
        jPanelCabecario = new javax.swing.JPanel();
        jLabeAcademia = new javax.swing.JLabel();
        jLabeGym = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabeAcademia1 = new javax.swing.JLabel();
        jLabeSair = new javax.swing.JLabel();
        jLabelMax = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        logoutjLabel = new javax.swing.JLabel();
        jPanelAlunos = new javax.swing.JPanel();
        jLabelAlunos = new javax.swing.JLabel();
        jLabelIconAlunos = new javax.swing.JLabel();
        jPanelFuncionarios = new javax.swing.JPanel();
        jLabellFuncionarios = new javax.swing.JLabel();
        jLabelIconlFuncionarios = new javax.swing.JLabel();
        jPanelRelatorio = new javax.swing.JPanel();
        jLabelFinanceiro = new javax.swing.JLabel();
        jLabelIconFinanceiro = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabellInfo = new javax.swing.JLabel();
        jLabelIconlInfo = new javax.swing.JLabel();
        jPanelExercicio = new javax.swing.JPanel();
        jLabellExercicios = new javax.swing.JLabel();
        jLabelIconlExer = new javax.swing.JLabel();
        jPanelFinanceiro = new javax.swing.JPanel();
        jLabelFinanceiro1 = new javax.swing.JLabel();
        jLabelIconFinanceiro1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setExtendedState(6);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(991, 635));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBackground.setVerifyInputWhenFocusTarget(false);

        jPanelCabecario.setBackground(new java.awt.Color(45, 118, 232));

        jLabeAcademia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabeAcademia.setForeground(new java.awt.Color(255, 255, 255));
        jLabeAcademia.setText("Gestão de Academia");

        jLabeGym.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 55)); // NOI18N
        jLabeGym.setForeground(new java.awt.Color(255, 255, 255));
        jLabeGym.setText("GYM");

        jTextFieldPesquisar.setBackground(new java.awt.Color(45, 118, 232));
        jTextFieldPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPesquisar.setToolTipText("Digite texto para pesquisa");
        jTextFieldPesquisar.setBorder(null);
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search_20px_1.png"))); // NOI18N
        jLabel1.setToolTipText("Pesquisar");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3.png"))); // NOI18N

        jLabeAcademia1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabeAcademia1.setForeground(new java.awt.Color(255, 255, 255));
        jLabeAcademia1.setText("de Musculação");

        jLabeSair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabeSair.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Close_Window_30px.png"))); // NOI18N
        jLabeSair.setToolTipText("Sair");
        jLabeSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeSairMousePressed(evt);
            }
        });

        jLabelMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Maximize_Window_30px.png"))); // NOI18N
        jLabelMax.setToolTipText("Maximizar");
        jLabelMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMaxMousePressed(evt);
            }
        });

        jLabelMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Minimize_Window_30px.png"))); // NOI18N
        jLabelMin.setToolTipText("Minimizar");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinMousePressed(evt);
            }
        });

        logoutjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Logout_Rounded_Up_30px_1_1.png"))); // NOI18N
        logoutjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutjLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCabecarioLayout = new javax.swing.GroupLayout(jPanelCabecario);
        jPanelCabecario.setLayout(jPanelCabecarioLayout);
        jPanelCabecarioLayout.setHorizontalGroup(
            jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                        .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabeAcademia1))
                            .addComponent(jLabeAcademia))
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                        .addComponent(jLabeGym)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutjLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMin)))
                .addGap(18, 18, 18)
                .addComponent(jLabelMax)
                .addGap(18, 18, 18)
                .addComponent(jLabeSair)
                .addGap(23, 23, 23))
        );
        jPanelCabecarioLayout.setVerticalGroup(
            jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCabecarioLayout.createSequentialGroup()
                        .addComponent(jLabeSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCabecarioLayout.createSequentialGroup()
                        .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                                .addComponent(jLabeGym)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabeAcademia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabeAcademia1))
                            .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(70, 70, 70))
                    .addGroup(jPanelCabecarioLayout.createSequentialGroup()
                        .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        jPanelAlunos.setToolTipText("Cadastro de alunos");
        jPanelAlunos.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAlunosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAlunosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelAlunosMousePressed(evt);
            }
        });

        jLabelAlunos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAlunos.setForeground(new java.awt.Color(45, 118, 232));
        jLabelAlunos.setText("    Alunos");

        jLabelIconAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelAlunosLayout = new javax.swing.GroupLayout(jPanelAlunos);
        jPanelAlunos.setLayout(jPanelAlunosLayout);
        jPanelAlunosLayout.setHorizontalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIconAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanelAlunosLayout.setVerticalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabelIconAlunos)
                .addGap(18, 18, 18)
                .addComponent(jLabelAlunos)
                .addContainerGap())
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
        jLabellFuncionarios.setText("Funcionários");

        jLabelIconlFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/crachá-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFuncionariosLayout = new javax.swing.GroupLayout(jPanelFuncionarios);
        jPanelFuncionarios.setLayout(jPanelFuncionariosLayout);
        jPanelFuncionariosLayout.setHorizontalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabellFuncionarios))
                    .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelIconlFuncionarios)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFuncionariosLayout.setVerticalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIconlFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabellFuncionarios)
                .addContainerGap())
        );

        jPanelRelatorio.setToolTipText("Financeiro");
        jPanelRelatorio.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRelatorioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRelatorioMousePressed(evt);
            }
        });

        jLabelFinanceiro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFinanceiro.setForeground(new java.awt.Color(45, 118, 232));
        jLabelFinanceiro.setText(" Relatórios");

        jLabelIconFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelRelatorioLayout = new javax.swing.GroupLayout(jPanelRelatorio);
        jPanelRelatorio.setLayout(jPanelRelatorioLayout);
        jPanelRelatorioLayout.setHorizontalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIconFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelRelatorioLayout.setVerticalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelIconFinanceiro)
                .addGap(18, 18, 18)
                .addComponent(jLabelFinanceiro)
                .addContainerGap())
        );

        jPanelInfo.setToolTipText("Infomações sobre o sistema");
        jPanelInfo.setPreferredSize(new java.awt.Dimension(140, 120));
        jPanelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelInfoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelInfoMousePressed(evt);
            }
        });

        jLabellInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabellInfo.setForeground(new java.awt.Color(45, 118, 232));
        jLabellInfo.setText("  Infomação");

        jLabelIconlInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/about.png"))); // NOI18N

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabellInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelIconlInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabelIconlInfo)
                .addGap(18, 18, 18)
                .addComponent(jLabellInfo)
                .addContainerGap())
        );

        jPanelExercicio.setToolTipText("Cadastro de exercícios");
        jPanelExercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExercicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelExercicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelExercicioMousePressed(evt);
            }
        });

        jLabellExercicios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabellExercicios.setForeground(new java.awt.Color(45, 118, 232));
        jLabellExercicios.setText(" Exercícios");

        jLabelIconlExer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Blue.png"))); // NOI18N

        javax.swing.GroupLayout jPanelExercicioLayout = new javax.swing.GroupLayout(jPanelExercicio);
        jPanelExercicio.setLayout(jPanelExercicioLayout);
        jPanelExercicioLayout.setHorizontalGroup(
            jPanelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExercicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExercicioLayout.createSequentialGroup()
                        .addComponent(jLabellExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExercicioLayout.createSequentialGroup()
                        .addComponent(jLabelIconlExer)
                        .addGap(43, 43, 43))))
        );
        jPanelExercicioLayout.setVerticalGroup(
            jPanelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExercicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIconlExer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabellExercicios)
                .addContainerGap())
        );

        jPanelFinanceiro.setToolTipText("Financeiro");
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

        jLabelFinanceiro1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFinanceiro1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelFinanceiro1.setText("Financeiro");

        jLabelIconFinanceiro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fin50.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFinanceiroLayout = new javax.swing.GroupLayout(jPanelFinanceiro);
        jPanelFinanceiro.setLayout(jPanelFinanceiroLayout);
        jPanelFinanceiroLayout.setHorizontalGroup(
            jPanelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinanceiroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFinanceiro1)
                    .addComponent(jLabelIconFinanceiro1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelFinanceiroLayout.setVerticalGroup(
            jPanelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinanceiroLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabelIconFinanceiro1)
                .addGap(18, 18, 18)
                .addComponent(jLabelFinanceiro1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanelAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jPanelFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jPanelFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelCabecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelCabecario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelFuncionarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExercicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelRelatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFinanceiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(991, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelExercicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExercicioMousePressed
        new ExerciciosHomeJFrame().show();
    }//GEN-LAST:event_jPanelExercicioMousePressed

    private void jPanelExercicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExercicioMouseExited
        resetColor(jPanelExercicio);
    }//GEN-LAST:event_jPanelExercicioMouseExited

    private void jPanelExercicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExercicioMouseEntered
        setColor(jPanelExercicio);
    }//GEN-LAST:event_jPanelExercicioMouseEntered

    private void jPanelInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelInfoMousePressed
        new InformacaoJFrame().show();
    }//GEN-LAST:event_jPanelInfoMousePressed

    private void jPanelInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelInfoMouseExited
        resetColor(jPanelInfo);
    }//GEN-LAST:event_jPanelInfoMouseExited

    private void jPanelInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelInfoMouseEntered
        setColor(jPanelInfo);
    }//GEN-LAST:event_jPanelInfoMouseEntered

    private void jPanelRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelatorioMousePressed
        if(Fachada.getFuncionarioLogado().isRelatorioAcessar()){
            new RelatorioJFrame().show();
        }else
            Mensagem.exibirErro();
    }//GEN-LAST:event_jPanelRelatorioMousePressed

    private void jPanelRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelatorioMouseExited
        resetColor(jPanelRelatorio);
    }//GEN-LAST:event_jPanelRelatorioMouseExited

    private void jPanelRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelatorioMouseEntered
        setColor(jPanelRelatorio);
    }//GEN-LAST:event_jPanelRelatorioMouseEntered

    private void jPanelFuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionariosMousePressed
        if(Fachada.getFuncionarioLogado().isCadFuncAcessar())
            new FuncionariosJFrame().show();
        else
            Mensagem.exibirErro();
    }//GEN-LAST:event_jPanelFuncionariosMousePressed

    private void jPanelFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionariosMouseExited
        resetColor(jPanelFuncionarios);
    }//GEN-LAST:event_jPanelFuncionariosMouseExited

    private void jPanelFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionariosMouseEntered
        setColor(jPanelFuncionarios);
    }//GEN-LAST:event_jPanelFuncionariosMouseEntered

    private void jPanelAlunosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMousePressed
        if(Fachada.getFuncionarioLogado().isCadAlunoAcessar())
            new AlunosHomeJFrame().show();
        else
            Mensagem.exibirErro();
    }//GEN-LAST:event_jPanelAlunosMousePressed

    private void jPanelAlunosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseExited
        resetColor(jPanelAlunos);
    }//GEN-LAST:event_jPanelAlunosMouseExited

    private void jPanelAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAlunosMouseEntered
        setColor(jPanelAlunos);
    }//GEN-LAST:event_jPanelAlunosMouseEntered

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jPanelFinanceiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFinanceiroMouseEntered
        setColor(jPanelFinanceiro);
    }//GEN-LAST:event_jPanelFinanceiroMouseEntered

    private void jPanelFinanceiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFinanceiroMouseExited
        resetColor(jPanelFinanceiro);
    }//GEN-LAST:event_jPanelFinanceiroMouseExited

    private void jPanelFinanceiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFinanceiroMousePressed
        if(Fachada.getFuncionarioLogado().isControleCaixaAcessar()){
            new FincanceiroJFrame().show();
        }else
            Mensagem.exibirErro();
    }//GEN-LAST:event_jPanelFinanceiroMousePressed

    private void jLabeSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeSairMousePressed
       System.exit(0);
    }//GEN-LAST:event_jLabeSairMousePressed

    private void jLabelMaxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaxMousePressed
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jLabelMaxMousePressed

    private void jLabelMinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMousePressed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMousePressed

    private void logoutjLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutjLabelMousePressed
        dispose();
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
        new LoginControlador(login);
    }//GEN-LAST:event_logoutjLabelMousePressed

    // ME: 
    public static void setColor(JPanel panel){
     panel.setBackground(new java.awt.Color(197, 197, 197));
    }
 
 
    public static void resetColor(JPanel panel){
     panel.setBackground(new java.awt.Color(240,240,240));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeAcademia;
    private javax.swing.JLabel jLabeAcademia1;
    private javax.swing.JLabel jLabeGym;
    private javax.swing.JLabel jLabeSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAlunos;
    private javax.swing.JLabel jLabelFinanceiro;
    private javax.swing.JLabel jLabelFinanceiro1;
    private javax.swing.JLabel jLabelIconAlunos;
    private javax.swing.JLabel jLabelIconFinanceiro;
    private javax.swing.JLabel jLabelIconFinanceiro1;
    private javax.swing.JLabel jLabelIconlExer;
    private javax.swing.JLabel jLabelIconlFuncionarios;
    private javax.swing.JLabel jLabelIconlInfo;
    private javax.swing.JLabel jLabelMax;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabellExercicios;
    private javax.swing.JLabel jLabellFuncionarios;
    private javax.swing.JLabel jLabellInfo;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelCabecario;
    private javax.swing.JPanel jPanelExercicio;
    private javax.swing.JPanel jPanelFinanceiro;
    private javax.swing.JPanel jPanelFuncionarios;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelRelatorio;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JLabel logoutjLabel;
    // End of variables declaration//GEN-END:variables
}

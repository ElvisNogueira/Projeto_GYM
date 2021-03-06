/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.Util;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import fachada.Fachada;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import model.ModeloTabela;
import model.Parcelas;

/**
 *
 * @author Insinuante
 */
public class RelatorioAlunoPlanoVencerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameLogin
     */
    public RelatorioAlunoPlanoVencerJFrame() {
        initComponents();
        preencherTabela(Fachada.getInstance().AlunosPlanosVencer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        cabjLabe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alunoCredjTable = new javax.swing.JTable();
        gerarPDFjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos com plano a vencer");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        cabjLabe.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        cabjLabe.setForeground(new java.awt.Color(255, 255, 255));
        cabjLabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list_white.png"))); // NOI18N
        cabjLabe.setText(" Alunos com plano a vencer");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cabjLabe)
                .addContainerGap(707, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cabjLabe)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        alunoCredjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Dia do vencimento"
            }
        ));
        jScrollPane1.setViewportView(alunoCredjTable);

        gerarPDFjButton.setBackground(new java.awt.Color(45, 118, 232));
        gerarPDFjButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gerarPDFjButton.setForeground(new java.awt.Color(255, 255, 255));
        gerarPDFjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Download_25px.png"))); // NOI18N
        gerarPDFjButton.setText(" Gerar Relatório ");
        gerarPDFjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarPDFjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gerarPDFjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(gerarPDFjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1286, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerarPDFjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDFjButtonActionPerformed
        gerarPDF(Fachada.getInstance().AlunosPlanosVencer());
    }//GEN-LAST:event_gerarPDFjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alunoCredjTable;
    private javax.swing.JLabel cabjLabe;
    private javax.swing.JButton gerarPDFjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void preencherTabela(ArrayList<Parcelas>parc){
        String[] colunas = new String[]{"ID","Nome","Data"};
        ArrayList<Object[]> dados = new ArrayList<>();
        
        for(Parcelas p : parc){
            dados.add(new Object[]{p.getId(),p.getAlunos().getNome(), p.getData_de_Vencimento()});
        }
        
        ModeloTabela modeloTabela =  new ModeloTabela(dados, colunas);   
        alunoCredjTable.setModel(modeloTabela);      
        alunoCredjTable.getColumnModel().getColumn(0).setPreferredWidth(90);
        alunoCredjTable.getColumnModel().getColumn(0).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(1).setPreferredWidth(560);
        alunoCredjTable.getColumnModel().getColumn(1).setResizable(false);
        alunoCredjTable.getColumnModel().getColumn(2).setPreferredWidth(160);
        alunoCredjTable.getColumnModel().getColumn(2).setResizable(false);
        alunoCredjTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    public void gerarPDF(ArrayList<Parcelas>parc){
        Document doc = new Document();
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream("Relatorio de Alunos com plano a vencer.pdf"));
            
            Font fontCab = new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK);
            Font fontTexto = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL,BaseColor.BLACK);
            PdfPTable table = new PdfPTable(3);
            
            table.addCell(new Paragraph("Id", fontTexto));
            table.addCell(new Paragraph("Nome", fontTexto));
            table.addCell(new Paragraph("Dia Vencimento", fontTexto));
            
            
            for(Parcelas p : parc){
                table.addCell(new Paragraph(""+p.getId(), fontTexto));
                table.addCell(new Paragraph(""+p.getAlunos().getNome(), fontTexto));                
                table.addCell(new Paragraph(""+p.getData_de_Vencimento(), fontTexto));
                 
             }
            
            doc.open();            
            doc.add(new Paragraph(Util.getDatasRel(new Date()),fontTexto));
            doc.add(new Paragraph("GYM - Relatorio de Alunos com plano a vencer\n\n",fontCab));
            doc.add(table);
            
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            doc.close();
        }
        
        try {
            Desktop.getDesktop().open(new File("Relatorio de Alunos com plano a vencer.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fachada.Fachada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ControleFinanceiro;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class ControleFinanceiroDao {
    private PreparedStatement statement;
    
    public void cadastrar(ControleFinanceiro c){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_CONTROLE_FINANCEIRO);
            
//        insert into controle_financeiro (data,descricao,valor,contas_id)
            statement.setDate(1, c.getData());
            statement.setString(2, c.getDescricao());
            statement.setFloat(3, c.getValor());
            statement.setInt(4, c.getConta().getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Controle Financeiro!"+ex.getMessage());
        }
        
        
    }
    public void editar(ControleFinanceiro c){}
    public void excluir(ControleFinanceiro c){}
    public ControleFinanceiro getById(int id){return null;}
    public ArrayList<ControleFinanceiro> getAll(){
        ResultSet result;
        ArrayList<ControleFinanceiro> financeiros = new ArrayList<>();
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_CONTROLE_FINANCEIRO);
            result = statement.executeQuery();
            
            while (result.next()) {                
                financeiros.add(get(result));
            }
        } catch (Exception ex) {
            Logger.getLogger(ControleFinanceiroDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return financeiros;
    }
    
    private ControleFinanceiro get(ResultSet result){
        ControleFinanceiro f = new ControleFinanceiro();
        
        try {
            f.setId(result.getInt(1));
            f.setData(result.getDate(2));
            f.setDescricao(result.getString(3));
            f.setValor(result.getFloat(4));
            f.setConta(Fachada.getInstance().getByIdConta(result.getInt(5)));
        } catch (SQLException ex) {
            Logger.getLogger(ControleFinanceiroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
}

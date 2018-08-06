/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FichaExercicio;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class FichaExercicioDao {
    private PreparedStatement statement;
    
    public void cadastrar(FichaExercicio f){
        try {
            //Cadastrar primeiro a ficha de treino
            //        (repeticoes,ordem,dia,exercicio_id,ficha_treino_id)
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_FICHA_EXERCICIO);
            
            statement.setInt(1, f.getRepeticoes());
            statement.setInt(2, f.getOrdem());
            statement.setString(3, f.getDia());
            statement.setInt(4, f.getExercicio().getId());
            statement.setInt(5, SQLUtil.getLastIdTabela("ficha_de_treino"));
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar em Ficha_Exercicio!\n"+ex.getMessage());
        }
    }
    public void excluir(FichaExercicio f){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_FICHA_EXERCICIO);
            statement.setInt(1, f.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editar(FichaExercicio f){}
    public FichaExercicio getByIdFichaTreiino(int id){
        
        return null;
    }
    
    
    
    
    
    
}

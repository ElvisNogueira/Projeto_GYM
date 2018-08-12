/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import app.Projeto_GYM;
import dao.FichaDeTreinoDao;
import fachada.Fachada;
import java.util.ArrayList;
import model.FichaDeTreino;
import model.FichaExercicio;
import view.Mensagem;


/**
 *
 * @author Elvis
 */
public class FichaDeTreinoBusiness {
    FichaDeTreinoDao dao;

    public FichaDeTreinoBusiness() {
        dao=new FichaDeTreinoDao();
    }
    
    public void Cadastrar(FichaDeTreino f){
        try {
            dao.cadastrar(f);
            for(FichaExercicio e : f.getExercicios()){
                Mensagem.exibirMensagem(e.getDia()+" "+f.getExercicios().size());
                Projeto_GYM.fachada.cadastrarFichaExercicio(e);
            }
            Mensagem.exibirMensagem("Ficha de Treino cadastrado com sucesso!");
        } catch (Exception e) {
            Mensagem.exibirMensagem("Erro ao cadastrar Ficha de Treino!");
        }
    }
    
    public void editar(FichaDeTreino f){
        dao.editar(f);
    }
    
    public void excluir(FichaDeTreino f){
        dao.excluir(f);
    }
    
    public FichaDeTreino getById(int i){
        return dao.getById(0);
    }
    
     public ArrayList<FichaDeTreino> getByAlunoId(int id){
         return dao.getByAlunoId(id);
     }
}

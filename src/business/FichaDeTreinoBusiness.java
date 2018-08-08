/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import app.Projeto_GYM;
import dao.FichaDeTreinoDao;
import fachada.Fachada;
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
        dao.cadastrar(f);
        
        for(FichaExercicio e : f.getExercicios()){
            Mensagem.exibirMensagem(e.getDia()+" "+f.getExercicios().size());
            Projeto_GYM.fachada.cadastrarFichaExercicio(e);
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
}

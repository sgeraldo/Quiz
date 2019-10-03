package entity;

import java.util.ArrayList;
import java.util.List;

import persistency.QuestionarioDAO;

public class Listar {

	public List<Metrica> listar(){
    
		List<Metrica> listagem = new ArrayList<Metrica>();
    
    {
		
    	 QuestionarioDAO qt1 = new QuestionarioDAO();
		    
		    listagem = qt1.listarMetricas();
					
		   return listagem;		    
		  
		
		}
	}

}

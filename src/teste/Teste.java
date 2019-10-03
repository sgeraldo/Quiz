package teste;

import persistency.QuestionarioDAO;

public class Teste {
	
	public static void main(String[] args) {
		
		QuestionarioDAO qDAO = new QuestionarioDAO();
		
		System.out.println(qDAO.listarMetrica());
	}

}

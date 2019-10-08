package controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Metrica;
import persistency.QuestionarioDAO;

/**
 * Servlet implementation class Controler
 */
@WebServlet("/Controler")
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = "";
		String sobrenome = "";

		nome = request.getParameter("nome");

		sobrenome = request.getParameter("sobrenome");

		request.setAttribute("nome", nome);

		request.setAttribute("sobrenome", sobrenome);

		request.getRequestDispatcher("/jsp/listarPerguntas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcao = request.getParameter("cmd");

		if (opcao.equalsIgnoreCase("lista")) {
			enviarLista(request, response);
		}
		if (opcao.equalsIgnoreCase("email")) {
			enviarEmail(request, response);
		}
		if (opcao.equalsIgnoreCase("listarRespostas")) {
			listarRespostas(request, response);
		}

//      ArrayList<String> lista = new ArrayList<String>();
//		
//		request.setAttribute("lista", lista);
//		
//		String nome = "";
//		String sobrenome = "";
//		nome = request.getParameter("nome");
//		sobrenome = request.getParameter("sobrenome");
//
//		request.setAttribute("nome", nome);
//		request.setAttribute("sobrenome", sobrenome);
//		request.getRequestDispatcher("listarPerguntas.jsp").forward(request, response);

	}

	protected void enviarLista(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Metrica> listagem = new ArrayList<Metrica>();

		QuestionarioDAO qt1 = new QuestionarioDAO();

		listagem = qt1.listarMetricas();

		request.setAttribute("listagem", listagem);

		request.getRequestDispatcher("/jsp/listarPerguntas.jsp").forward(request, response);
	};

	protected void listarRespostas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			request.getRequestDispatcher("/jsp/listarRespostas.jsp").forward(request, response);
	};

	protected void enviarEmail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("email", "email enviado");
		request.getRequestDispatcher("/jsp/listarPerguntas.jsp").forward(request, response);
	}
}

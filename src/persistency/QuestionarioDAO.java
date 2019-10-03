package persistency;

import java.util.ArrayList;
import java.util.List;

import entity.Metrica;

public class QuestionarioDAO extends ConexaoMySQL {

	public void listar() {

		try {
			OpenConexao();
			stmt = conn.prepareStatement("select * from TB_METRICA");
			rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("NM_METRICA"));
			}
			CloseConexao();

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

	public ArrayList<String> listarMetrica() {

		ArrayList<String> lista = new ArrayList<String>();

		try {
			OpenConexao();
			stmt = conn.prepareStatement("select * from TB_METRICA");
			rs = stmt.executeQuery();

			while (rs.next()) {

				lista.add(rs.getString("NM_METRICA"));
				lista.add(rs.getString("ID_METRICA"));
				lista.add(rs.getString("NU_PRAZO"));
			}

			CloseConexao();

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}

		return lista;
	}

	public List<Metrica> listarMetricas() {

		List<Metrica> lista = new ArrayList<Metrica>();

		try {
			OpenConexao();
			stmt = conn.prepareStatement("select * from TB_METRICA");
			rs = stmt.executeQuery();

			while (rs.next()) {

				Metrica metrica = new Metrica();

				metrica.setId(Integer.parseInt(rs.getString("ID_METRICA")));
				metrica.setNome(rs.getString("NM_METRICA"));
				metrica.setPrazo(Integer.parseInt(rs.getString("NU_PRAZO")));

				lista.add(metrica);

			}

			CloseConexao();

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}

		return lista;

	}

}

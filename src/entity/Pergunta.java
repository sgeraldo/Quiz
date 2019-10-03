package entity;

import java.util.List;

public class Pergunta {
	private Integer Id;
	private String descricao;
	private List <Resposta> respostas;

	public Integer getId() {
		return Id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public List<Resposta> getRespostas() {
		return respostas;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
}

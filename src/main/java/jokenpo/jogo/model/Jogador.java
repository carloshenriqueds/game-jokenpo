package jokenpo.jogo.model;

public class Jogador {

	private Integer id;
	private String nome;
	private Integer pontuacao;
	
	public Jogador(Integer id, String nome){
		this.nome = nome;
		this.id = id;
	}
	
	public Jogador(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}

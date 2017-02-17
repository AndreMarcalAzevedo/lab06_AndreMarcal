package gameCenter;

import java.util.Set;

public class Jogo {
	protected String nome;
	protected double preco;
	protected int highscore;
	protected int jogadas;
	protected int zeradas;
	protected Set<EstilosJogo> estilos;
	protected int recompensa;
	
	public Jogo (String nome, double preco, Set<EstilosJogo> estilos) throws Exception{
		this.nome = nome;
		this.preco = preco;
		this.highscore = 0;
		this.jogadas = 0;
		this.zeradas = 0;
		this.estilos = estilos;
		if (nome == null || nome.equals("")){
			throw new Exception("Nome inválido");
		}
		if (preco < 0) {
			throw new Exception("Preço inválido");
		}
	}
	
	
	public int registraJogada(int score, boolean zerou){
		jogadas++;
		if (score > highscore) {
			highscore = score;
		}
		if (zerou == true) {
			zeradas++;
		}
		return recompensa;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws Exception{
		if (preco < 0) {
			throw new Exception("Preço invalido");
		}
		this.preco = preco;
	}

	public int getHighscore() {
		return highscore;
	}

	public int getJogadas() {
		return jogadas;
	}

	public int getZeradas() {
		return zeradas;
	}

	@Override
	public String toString(){
		return nome + " " + preco + " ";
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof Jogo) {
			if(((Jogo) obj).getNome().equals(this.getNome())){
				return true;
			}
			
		}
		return false;
	}
	
	
}
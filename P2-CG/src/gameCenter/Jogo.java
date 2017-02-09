package gameCenter;

public class Jogo {
	protected String nome;
	protected double preco;
	protected int highscore;
	protected int jogadas;
	protected int zeradas;
	
	public Jogo (String nome, double preco) throws Exception{
		this.nome = nome;
		this.preco = preco;
		this.highscore = 0;
		this.jogadas = 0;
		this.zeradas = 0;
		if (nome == null || nome.equals("")){
			throw new Exception("Nome invalido");
		}
	}
	
	public void registraJogada(int score, boolean zerou){
		jogadas++;
		if (score > highscore) {
			highscore = score;
		}
		if (zerou == true) {
			zeradas++;
		}
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws Exception{
		this.preco = preco;
		if (preco < 0) {
			throw new Exception("Preço invalido");
		}
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
		return this.nome + " " + this.preco + " " ;
	
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
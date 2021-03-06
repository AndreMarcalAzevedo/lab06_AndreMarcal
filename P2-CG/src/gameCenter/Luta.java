package gameCenter;

import java.util.Set;

public class Luta extends Jogo{

	public Luta(String nome, double preco, Set<EstilosJogo> estilos) throws Exception {
		super(nome, preco, estilos);
	}
	
	public int registraJogada(int score, boolean zerou){
		recompensa = 0;
		jogadas++;
		if (score > highscore) {
			highscore = score;
			recompensa = (score/1000);
		}
		if (zerou == true) {
			zeradas++;
		}
		return recompensa;
	}
	
	@Override
	public String toString(){
		return nome + " " + preco + " Luta";
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Luta) {
			if(((Luta) obj).getNome().equals(this.getNome())){
				return true;
			}
			
		}
		return false;
	}
}

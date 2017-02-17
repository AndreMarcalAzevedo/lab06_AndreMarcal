package gameCenter;

import java.util.Set;

public class Luta extends Jogo{

	public Luta(String nome, double preco, Set<EstilosJogo> estilos) throws Exception {
		super(nome, preco, estilos);
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

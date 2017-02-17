package gameCenter;

import java.util.Set;

public class RPG extends Jogo{

	public RPG(String nome, double preco, Set<EstilosJogo> estilos) throws Exception {
		super(nome, preco, estilos);
	}
	@Override
	public String toString(){
		return nome + " " + preco + " RPG";	
	}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof RPG) {
			if(((RPG) obj).getNome().equals(this.getNome())){
				return true;
			}
			
		}
		return false;
	}
}

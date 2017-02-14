package gameCenter;

import java.util.Set;

public class Plataforma extends Jogo{

	public Plataforma(String nome, double preco, Set<EstilosJogo> estilos) throws Exception {
		super(nome, preco, estilos);
	}
	
	@Override
	public String toString(){
		return nome + " " + preco + " Plataforma";
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Plataforma) {
			if(((Plataforma) obj).getNome().equals(this.getNome())){
				return true;
			}
			
		}
		return false;
	}
}

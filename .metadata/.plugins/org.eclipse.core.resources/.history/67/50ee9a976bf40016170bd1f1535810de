package gameCenter;

public class Noob extends Usuario{
	
	public Noob(String nome, String nomeLogin) throws Exception{
		super(nome, nomeLogin);
	}
	
	@Override
	public String toString() {
		return "Noob " + nome + " " + nomeLogin;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Noob) {
			if (((Noob) obj).getNomeLogin().equals(this.getNomeLogin())) {
				return true;
			}
		}
		return false;
	}
}

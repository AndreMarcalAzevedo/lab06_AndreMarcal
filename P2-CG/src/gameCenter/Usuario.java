package gameCenter;

public class Usuario {
	private String nome;
	private String nomeLogin;
	private double dinheiro;
	
	public void adicionarDinheiro(int money){
		dinheiro += money;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeLogin() {
		return nomeLogin;
	}

	public double getDinheiro() {
		return dinheiro;
	}
}

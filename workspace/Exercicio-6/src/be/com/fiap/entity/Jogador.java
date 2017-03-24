package be.com.fiap.entity;

public class Jogador {

	private int cd_jogador;
	private String nm_jogador;
	private Time time;

	public Jogador() {
	}

	public Jogador(int cd_jogador, String nm_jogador, Time time) {
		super();
		this.cd_jogador = cd_jogador;
		this.nm_jogador = nm_jogador;
		this.time = time;
	}

	public int getCd_jogador() {
		return cd_jogador;
	}

	public void setCd_jogador(int cd_jogador) {
		this.cd_jogador = cd_jogador;
	}

	public String getNm_jogador() {
		return nm_jogador;
	}

	public void setNm_jogador(String nm_jogador) {
		this.nm_jogador = nm_jogador;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}

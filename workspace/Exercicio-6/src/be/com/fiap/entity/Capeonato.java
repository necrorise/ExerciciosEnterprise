package be.com.fiap.entity;

public class Capeonato {

	private int cd_campeonato;
	private String nm_campeonato;

	public Capeonato() {
	}

	public Capeonato(int cd_campeonato, String nm_campeonato) {
		super();
		this.cd_campeonato = cd_campeonato;
		this.nm_campeonato = nm_campeonato;
	}

	public int getCd_campeonato() {
		return cd_campeonato;
	}

	public void setCd_campeonato(int cd_campeonato) {
		this.cd_campeonato = cd_campeonato;
	}

	public String getNm_campeonato() {
		return nm_campeonato;
	}

	public void setNm_campeonato(String nm_campeonato) {
		this.nm_campeonato = nm_campeonato;
	}

}

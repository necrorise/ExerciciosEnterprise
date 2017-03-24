package be.com.fiap.entity;

public class Tecnico {
	private int cd_tecnico;
	private String nm_tecnico;

	public Tecnico() {

	}

	public Tecnico(int cd_tecnico, String nm_tecnico) {
		super();
		this.cd_tecnico = cd_tecnico;
		this.nm_tecnico = nm_tecnico;
	}

	public int getCd_tecnico() {
		return cd_tecnico;
	}

	public void setCd_tecnico(int cd_tecnico) {
		this.cd_tecnico = cd_tecnico;
	}

	public String getNm_tecnico() {
		return nm_tecnico;
	}

	public void setNm_tecnico(String nm_tecnico) {
		this.nm_tecnico = nm_tecnico;
	}

}

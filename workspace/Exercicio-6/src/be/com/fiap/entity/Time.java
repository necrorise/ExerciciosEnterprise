package be.com.fiap.entity;

import java.util.Date;

public class Time {
	
	private int cd_time;
	private String nm_time;
	private Date dt_fundacao;
	private String nr_titulo;
	private Tecnico tecnico;

	
	
	public Time() {
	}
	
	public Time(int cd_time, String nm_time, Date dt_fundacao, String nr_titulo, Tecnico tecnico) {
		super();
		this.cd_time = cd_time;
		this.nm_time = nm_time;
		this.dt_fundacao = dt_fundacao;
		this.nr_titulo = nr_titulo;
		this.tecnico = tecnico;
	}
	
	int getCd_time() {
		return cd_time;
	}
	public void setCd_time(int cd_time) {
		this.cd_time = cd_time;
	}
	public String getNm_time() {
		return nm_time;
	}
	public void setNm_time(String nm_time) {
		this.nm_time = nm_time;
	}
	public Date getDt_fundacao() {
		return dt_fundacao;
	}
	public void setDt_fundacao(Date dt_fundacao) {
		this.dt_fundacao = dt_fundacao;
	}
	public String getNr_titulo() {
		return nr_titulo;
	}
	public void setNr_titulo(String nr_titulo) {
		this.nr_titulo = nr_titulo;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	

}

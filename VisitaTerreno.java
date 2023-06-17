package sprint;

import java.util.regex.Pattern;

public class VisitaTerreno {
	String dias = "(lunes|martes|miercoles|jueves|viernes|sabado|domingo)";
	String horasV = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
	private Revision revision;// revisar
	private Integer idTerreno;
	private Integer rutCliente;
	private String diaVisita, lugar, comentarios;
	private String horaVisita;
	public VisitaTerreno(Integer idTerreno, Integer rutCliente, String diaVisita, String lugar, String comentarios,
			String horaVisita) {
		if(idTerreno == null|| lugar.length() <10 || lugar.length() > 50|| rutCliente == null|| comentarios.length() > 100 ||!Pattern.matches(dias, diaVisita) ||!Pattern.matches(horasV, horaVisita)){
			throw new IllegalArgumentException("Datos invalidos");
	}
		this.idTerreno = idTerreno;
		this.rutCliente = rutCliente;
		this.diaVisita = diaVisita;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.horaVisita = horaVisita;
	}
	public Integer getIdTerreno() {
		return idTerreno;
	}
	public void setIdTerreno(Integer idTerreno) {
		this.idTerreno = idTerreno;
	}
	public Integer getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDiaVisita() {
		return diaVisita;
	}
	public void setDiaVisita(String diaVisita) {
		this.diaVisita = diaVisita;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getHoraVisita() {
		return horaVisita;
	}
	public void setHoraVisita(String horaVisita) {
		this.horaVisita = horaVisita;
	}
	
	@Override
	public String toString() {
		return "VisitaTerreno [revision=" + revision + ", identificadorVisita=" + idTerreno + ", rutCliente="
				+ rutCliente + ", dia=" + diaVisita + ", hora=" + horaVisita + ", lugar=" + lugar + ", comentarios=" + comentarios
				+ "]";
	}
	

}

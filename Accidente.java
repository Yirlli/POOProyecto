package sprint;

import java.util.regex.Pattern;

public class Accidente {
	String dias = "(lunes|martes|miercoles|jueves|viernes|sabado|domingo)";
	String horasV = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
	private Integer idAccidente;
	private Integer rut;
	private String diaAccidente;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	public Accidente(Integer idAccidente, Integer rut, String diaAccidente, String hora, String lugar, String origen,
			String consecuencias) {
		if(idAccidente == null || rut == null|| lugar.length() <10 || lugar.length() > 50|| origen.length() > 100 || consecuencias.length() > 100 ||!Pattern.matches(dias, diaAccidente) ||!Pattern.matches(horasV, hora)) {
			throw new IllegalArgumentException("Dato invalido");
				
		}
		this.idAccidente = idAccidente;
		this.rut = rut;
		this.diaAccidente = diaAccidente;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}
	public Integer getIdAccidente() {
		return idAccidente;
	}
	public void setIdAccidente(Integer idAccidente) {
		this.idAccidente = idAccidente;
	}
	public Integer getRut() {
		return rut;
	}
	public void setRut(Integer rut) {
		this.rut = rut;
	}
	public String getDiaAccidente() {
		return diaAccidente;
	}
	public void setDiaAccidente(String diaAccidente) {
		this.diaAccidente = diaAccidente;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getConsecuencias() {
		return consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	
	@Override
	public String toString() {
		return "Accidente [identificadorAccidente=" + idAccidente + ", rutCliente=" + rut + ", dia="
				+ diaAccidente + ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias="
				+ consecuencias + "]";
	}
	public void setIdentificadorAccidente(Integer identificadorAccidente) {
		if(identificadorAccidente == null) {
			throw new IllegalArgumentException("Debe ingresar un numéro identificador");
		}
		this.idAccidente = identificadorAccidente;
	}
	

}

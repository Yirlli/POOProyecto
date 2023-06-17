package sprint;

public class Capacitacion {

	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private Integer duracion;
	private int cantidadAsistentes;
	
	public Capacitacion() {
		
	}

	public Capacitacion(Integer identificador, Integer rutCliente, String dia, String hora, String lugar, Integer duracion, int cantidadAsistentes) {
		super();
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
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

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		String duracionStr = String.valueOf(duracion);
		this.duracion = duracion;
		
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + mostrarDetalle() +", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}
	
	public String mostrarDetalle() {
		return "La capacitacion sera en " + lugar + " del dia " +dia +" y durara " + duracion*60  + " minutos";
	}

	
	
}

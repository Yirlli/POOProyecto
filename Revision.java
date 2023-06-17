package sprint;

public class Revision {
	private Integer idRevision, idVisitaTerreno;
	private String nombreAlusivo, detalleRevision;
	private int estadoRevision;
	public Revision(Integer idRevision, Integer idVisitaTerreno, String nombreAlusivo, String detalleRevision,
			int estadoRevision) {
		if(idVisitaTerreno == null||nombreAlusivo.length() <10 || nombreAlusivo.length() > 50 || detalleRevision.length() > 100|| estadoRevision != 1 || estadoRevision != 2 || estadoRevision != 3)
			throw new IllegalArgumentException("Datos invalidos");
		this.idRevision = idRevision;
		this.idVisitaTerreno = idVisitaTerreno;
		this.nombreAlusivo = nombreAlusivo;
		this.detalleRevision = detalleRevision;
		this.estadoRevision = estadoRevision;
	}
	public Integer getIdRevision() {
		return idRevision;
	}
	public void setIdRevision(Integer idRevision) {
		this.idRevision = idRevision;
	}
	public Integer getIdVisitaTerreno() {
		return idVisitaTerreno;
	}
	public void setIdVisitaTerreno(Integer idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}
	public String getNombreAlusivo() {
		return nombreAlusivo;
	}
	public void setNombreAlusivo(String nombreAlusivo) {
		this.nombreAlusivo = nombreAlusivo;
	}
	public String getDetalleRevision() {
		return detalleRevision;
	}
	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}
	public int getEstadoRevision() {
		return estadoRevision;
	}
	public void setEstadoRevision(int estadoRevision) {
		this.estadoRevision = estadoRevision;
	}
	
	@Override
	public String toString() {
		return "Revision [identificadorVisita=" + idVisitaTerreno + ", identificadorRevision="
				+ idRevision + ", nombreRevision=" + nombreAlusivo + ", detalle=" + detalleRevision + ", estado="
				+ estadoRevision + "]";
	}
	
}

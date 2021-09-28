package cl.ciisa.actividad.dto;

public class DireccionDto {
	
	public String calle;
    public String comuna;
    
	public DireccionDto(String calle, String comuna) {
		super();
		this.calle = calle;
		this.comuna = comuna;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

}

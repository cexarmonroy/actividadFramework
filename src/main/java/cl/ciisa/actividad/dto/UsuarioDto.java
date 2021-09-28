package cl.ciisa.actividad.dto;

import java.util.Date;
import java.util.List;

public class UsuarioDto {
	
	public Long id;
	public String rut;
	public String nombre;
	public String apellido;
	public DireccionDto direccion;
	public Date fechaNac;
	public String genero;
	public List<String> redesSociales;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public DireccionDto getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionDto direccion) {
		this.direccion = direccion;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<String> getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(List<String> redesSociales) {
		this.redesSociales = redesSociales;
	}
	
	
	
}

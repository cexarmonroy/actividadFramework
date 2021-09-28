package cl.ciisa.actividad.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ciisa.actividad.dto.DireccionDto;
import cl.ciisa.actividad.dto.UsuarioDto;
import cl.ciisa.actividad.models.UsuarioDireccion;
import cl.ciisa.actividad.models.UsuarioModel;
import cl.ciisa.actividad.repositories.UsuarioDireccionRepository;
import cl.ciisa.actividad.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	UsuarioDireccionRepository usuarioDirecRepository;

	public ArrayList<UsuarioDto> obtenerUsuarios() {	
		List<UsuarioModel> lista = (List<UsuarioModel>) usuarioRepository.findAll();
		List<UsuarioDto> listaDto= new ArrayList<UsuarioDto>();
		for (UsuarioModel usuarioModel : lista) {
			UsuarioDto user = new UsuarioDto();
			user.id = usuarioModel.getId();
			user.nombre=usuarioModel.getNombre();
			user.apellido = usuarioModel.getApellido();
			user.fechaNac = usuarioModel.getFechaNac();
			user.genero = usuarioModel.getGenero();					
			user.setDireccion(new DireccionDto(usuarioModel.getDireccion().getCalle(),usuarioModel.getDireccion().getComuna()));
			listaDto.add(user);
		}
		return (ArrayList<UsuarioDto>) listaDto;
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}

	public Optional<UsuarioModel> obtenerPorId(Long id) {
		return usuarioRepository.findById(id);
	}

	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}

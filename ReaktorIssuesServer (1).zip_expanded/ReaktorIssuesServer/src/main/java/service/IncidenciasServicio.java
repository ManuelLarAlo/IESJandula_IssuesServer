package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import models.Incidencias;

@Service
public class IncidenciasServicio {

	
	@Autowired
	private Incidencias repositorio;
	
	@Transactional
	public String crearIncidencia(Incidencias incidencia) {
		return null;
		
	}
	
		
		public List<Incidencias> listaIncidencias(){
			return repositorio.findAll();
		}
	
	
}

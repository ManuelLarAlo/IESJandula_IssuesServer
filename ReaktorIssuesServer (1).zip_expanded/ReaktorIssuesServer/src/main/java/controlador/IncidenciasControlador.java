package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Incidencias;
import service.IncidenciasServicio;

@RestController
public class IncidenciasControlador {

	@Autowired
	IncidenciasServicio incidenciaServicio;
	
	@RequestMapping(value= "/incidencias")
	public List<Incidencias> listaIncidencias(){
		return null;
		
	}
	
}

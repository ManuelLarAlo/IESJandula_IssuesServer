package models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringBootApplication
@Entity
@Table(name = "incidencias")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Incidencias {

	@Id
	@GeneratedValue()
	int id;
	
	@Column
	String numeroAula;
	
	@Column
	String nombreProfesor;
	
	@Column
	Date fecha;
	
	@Column
	String descripcion;
	
	@Column
	String estado;

	public List<Incidencias> findAll() {
		
		return null;
	}
}

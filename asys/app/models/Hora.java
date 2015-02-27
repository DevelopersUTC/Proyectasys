package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Hora extends Model {
	public long code;
	public String hora;

	public Hora(Long code, String hora) {
		this.code = code;
		this.hora = hora;

	}

	public Hora findAhorario(int code) {
		return null;
	}

	public String toString() {
		return hora;
	}
	// fin actividades
	
}

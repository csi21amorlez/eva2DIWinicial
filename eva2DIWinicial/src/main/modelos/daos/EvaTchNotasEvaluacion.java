package main.modelos.daos;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

;

/*
 * EvaTchNotasEvaluacion --> Clase DAO para la tabla eva_tch_notas_evaluacion
 */
@Entity
@Table(name = "eva_tch_notas_evaluacion", schema = "sc_evaluacion")
public class EvaTchNotasEvaluacion {
//	Atributos
	@Column(name = "md_uuid")
	private String mdUuid;
	@Column(name = "md_fch")
	private Timestamp mdFch;
	@Id
	@Column(name = " id_nota_alumno")
	private int idNotaEvaluacion;
	@Column(name = "cod_alumno")
	private String codAlumno;
	@Column(name = "nota_evaluacion")
	private int notaEvaluacion;
	@Column(name = "cod_evaluacion")
	private String codEvaluacion;

//	Constructor vacio
	public EvaTchNotasEvaluacion() {
		super();
	}

//	Construcotr para testeo
	public EvaTchNotasEvaluacion(String mdUuid, Timestamp mdFch, int idNotaEvaluacion, String codAlumno,
			int notaEvaluacion, String codEvaluacion) {
		super();
		this.mdUuid = mdUuid;
		this.mdFch = mdFch;
		this.idNotaEvaluacion = idNotaEvaluacion;
		this.codAlumno = codAlumno;
		this.notaEvaluacion = notaEvaluacion;
		this.codEvaluacion = codEvaluacion;
	}

//	Getters y setters 
	public String getMdUuid() {
		return mdUuid;
	}

	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
	}

	public Timestamp getMdFch() {
		return mdFch;
	}

	public void setMdFch(Timestamp mdFch) {
		this.mdFch = mdFch;
	}

	public int getIdNotaEvaluacion() {
		return idNotaEvaluacion;
	}

	public void setIdNotaEvaluacion(int idNotaEvaluacion) {
		this.idNotaEvaluacion = idNotaEvaluacion;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public int getNotaEvaluacion() {
		return notaEvaluacion;
	}

	public void setNotaEvaluacion(int notaEvaluacion) {
		this.notaEvaluacion = notaEvaluacion;
	}

	public String getCodEvaluacion() {
		return codEvaluacion;
	}

	public void setCodEvaluacion(String codEvaluacion) {
		this.codEvaluacion = codEvaluacion;
	}

}

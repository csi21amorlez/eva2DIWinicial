package main.modelos.dtos;

//RegistroDTO --> DTO con el que trabajaremos los datos obtenidos a traves de los daos

public class RegistroDTO {
	
	private String codAlumno;
	private String codEvaluacion;
	private int notaEvaluacion;
	
	
	
	public RegistroDTO() {
		super();
	}

	public RegistroDTO(String codAlumno, String codEvaluacion, int notaEvaluacion) {
		super();
		this.codAlumno = codAlumno;
		this.codEvaluacion = codEvaluacion;
		this.notaEvaluacion = notaEvaluacion;
	}

	@Override
	public String toString() {
		return "RegistroDTO [codAlumno= " + codAlumno + ", codEvaluacion= " + codEvaluacion + ", notaEvaluacion= "
				+ notaEvaluacion + "]\n";
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public String getCodEvaluacion() {
		return codEvaluacion;
	}

	public void setCodEvaluacion(String codEvaluacion) {
		this.codEvaluacion = codEvaluacion;
	}

	public int getNotaEvaluacion() {
		return notaEvaluacion;
	}

	public void setNotaEvaluacion(int notaEvaluacion) {
		this.notaEvaluacion = notaEvaluacion;
	}

		
	
	
	
	
	
	

}

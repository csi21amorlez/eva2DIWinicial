package main.modelos.daos;

import java.util.ArrayList;

//Interfaz que define los metodos a implementar para la clase EvaTchEvaluacion, su implementacion estara en EvaTchNotasEvaluacionImpl

public interface EvaTchNotasEvaluacionService {
	
	//Insertara un registro en la base de datos
	public void insertarRegistro(EvaTchNotasEvaluacion dao);
	
	//Obtendra todos los registros de la base de datos
	public ArrayList<EvaTchNotasEvaluacion> buscarTodos();

}

package Implementacion;

import java.util.ArrayList;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.modelos.daos.EvaTchNotasEvaluacionImpl;
import main.modelos.dtos.RegistroDTO;
import modelos.convertidor.Convertidor;
import modelos.convertidor.ConvertidorImpl;
@Component
public class Consultas {
	
	@Autowired
	private EvaTchNotasEvaluacionImpl evp;
	
	@Autowired 
	ConvertidorImpl cimpl;
	
	@Transactional
	public void insertar(RegistroDTO dto) {
		evp.insertarRegistro(cimpl.DTOtoDAO(dto));
	}
	
	@Transactional
	public ArrayList<RegistroDTO> buscarTodos() {
		
		return cimpl.DAOtoDTOList(evp.buscarTodos());
		
	}

}

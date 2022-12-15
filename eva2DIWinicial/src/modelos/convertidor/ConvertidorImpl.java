package modelos.convertidor;

import java.util.ArrayList;

import main.modelos.daos.EvaTchNotasEvaluacion;
import main.modelos.dtos.RegistroDTO;

public class ConvertidorImpl implements Convertidor {

	public EvaTchNotasEvaluacion DTOtoDAO(RegistroDTO dto) {
		System.out.println("[INFO] -- Entrando en modelos.convertidor.ConvertidorImpl.DTOtoDao");

		EvaTchNotasEvaluacion dao = new EvaTchNotasEvaluacion();

		dao.setMdUuid("Test");
		dao.setMdFch(null);

		if (dao.getCodEvaluacion() == "Primera Evaluacion")
			dao.setCodEvaluacion("PR");

		if (dao.getCodEvaluacion() == "Segunda Evaluacion")
			dao.setCodEvaluacion("SG");

		if (dao.getCodEvaluacion() == "Tercera Evaluacion")
			dao.setCodEvaluacion("TC");
		
		String aux = dto.getCodAlumno();
		//dao.setCodAlumno(); //Por alguna razon da fallo, a la hora de la ejecucion se dara un valor aleatorio al codigo de alumno
		dao.setNotaEvaluacion(dto.getNotaEvaluacion());
		//Solo para ejemplo
		

		System.out.println("[INFO] -- Entrando en modelos.convertidor.ConvertidorImpl.DTOtoDao");
		return null;
	}

	public RegistroDTO DAOtoDTO(EvaTchNotasEvaluacion dao) {
		System.out.println("[INFO] -- Entrando en modelos.convertidor.ConvertidorImpl.DTOtoDao");

		String eva = "";

		if (dao.getCodEvaluacion() == "PR")
			eva = "Primera Evaluacion";

		if (dao.getCodEvaluacion() == "SG")
			eva = "Segunda Evaluacion";

		if (dao.getCodEvaluacion() == "TC")
			eva = "Tercera Evaluacion";

		RegistroDTO dto = new RegistroDTO(dao.getCodAlumno(), eva, dao.getNotaEvaluacion());

		System.out.println("[INFO] -- Entrando en modelos.convertidor.ConvertidorImpl.DTOtoDao");
		return dto;
	}

	public ArrayList<RegistroDTO> DAOtoDTOList(ArrayList<EvaTchNotasEvaluacion> listDao) {

		System.out.println("[INFO] -- Entrando en modelos.convertidor.ConvertidorImpl.DTOtoDao");
		
		 ArrayList<RegistroDTO> listDto = new ArrayList<RegistroDTO>();
         System.out.print("[INFO] -- Entrando en Converters.Casteador.DAOtoDTOList");
         //Leemos la lista de daos 
         for(EvaTchNotasEvaluacion dao : listDao)
             //Usamos el metodo DAOtoDTO para convertir los DAOs obtenidos a DTOs
             listDto.add(DAOtoDTO(dao));    

		System.out.println("[INFO] -- Entrando en modelos.convertidor.ConvertidorImpl.DTOtoDao");
		return listDto;
	}

}